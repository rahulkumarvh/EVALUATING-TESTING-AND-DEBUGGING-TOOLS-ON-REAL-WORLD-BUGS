package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1a1a104a10a4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(9.0f, (float) 32L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("MIXED MODE", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("SPECIFICATION API PLATFORM JAVA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: SPECIFICATION API PLATFORM JAVA is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1.4");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 1.4f + "'", number1, 1.4f);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 2, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("x86_64");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"x86_64\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 26, (double) 97L, 220.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 220.0d + "'", double3 == 220.0d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 TnemnorivnEemitnuRES)MT(avaJ", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("  a 4 a 4  a 4 a 44 a #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1#104#10#4" + "'", str15, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1#1#104#10#4" + "'", str17, "-1#1#104#10#4");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("class [LjavaelangeCharSequence;class [LjavaelangeCharSequence;class [LjavaelangeString;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 9, 6);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "J Viu M");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: J Viu M");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 0, 100, -1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0L, (float) 23, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 23.0f + "'", float3 == 23.0f);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 7, 23.0d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, 1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a8-FTUa PLATFORM API SPECIFICATION");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(52.0f, 1.8f, (float) 26);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("/users/sanjitkumar");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 1, (long) (short) 10, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("####-1.0# a 4####", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                        ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("/uSERS/SANJITKUMAR/PERSONAL_PROJECTS/cOLLEGEiLLINOIS/sOFTWAREeNGINEERINGpRINCIPLES/MILESTONE3/M3_SCRIPTS");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 18, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("java platform api specification");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"java platform api specification\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0#1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Java Virtual Machine Specification/Users/sanjitkumar");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Java Virtual Machine Specification/Users/sanjitkumar is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 246, (int) (byte) 100);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("Java Platform API Speci");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Java \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 220, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 220.0f + "'", float3 == 220.0f);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a220.0", (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(5, 26, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0# a 4", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaaaaaaaaa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaaaaaaaaa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "32.0a10.0a97.0a104.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 32.0a10.0a97.0a104.0a10.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("SUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 9, 7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 4, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), 0.0f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 1, (short) 100, (short) 0 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 33, (double) 32.0f, (double) 220.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 220.0d + "'", double3 == 220.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100L, (float) '#', (float) 246);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" V");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14104-1" + "'", str8, "-14104-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 18, (double) (byte) -1, (double) (-1110410L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 18.0d + "'", double3 == 18.0d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1), (double) 10, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(100.0d, (double) 100, (double) 58);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("8-F#U");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"8-F#U\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 220, (float) '#', 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(Float.POSITIVE_INFINITY, 58.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("J1.8.0_181");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(5.0d, (double) 'a', (double) 6);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.Class<?> wildcardClass8 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("ava Virtual Machine Specification/Users/sanjitkuma", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("Java Platform API SpecificationJava Platform API SpecificationJava Platform API SpecificationJava P:", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#10#-1" + "'", str10, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1#10#-1" + "'", str13, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("class [Ljava.lang.CharSequence;class [Ljava.lang.CharSequence;class [Ljava.lang.String;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (-1), (long) 205, (long) 2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 205L + "'", long3 == 205L);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "-14-1410404-1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -14-1410404-1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" PLATFORM API SPECIFICATIO");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"PLATFORM API SPECIFICATIO\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 23, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("TnemnorivnEemitnuRES)MT(avaJ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("44a444a4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44a444a4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaaaaaaaaa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaaaaaaaaa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("####-1.0# a 4####");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("sun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: sun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...t...", (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("java platform api specification");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"java platform api specification\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 1", 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("Mac OS X", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("J Viu Min SifiinM OS X-J Viu Min SifiinM OS X1J Viu Min SifiinM OS X4J Viu Min SifiinM OS X1J Viu Min SifiinM OS X0J Viu Min SifiinM OS X4J Viu Min SifiinM OS X-J Viu Min SifiinM OS X1J Viu Min SifiinM OS X");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"J Viu Min SifiinM OS X-J Viu Min SifiinM OS X1J Viu Min SifiinM OS X4J Viu Min SifiinM OS X1J Viu Min SifiinM OS X0J Viu Min SifiinM OS X4J Viu Min SifiinM OS X-J Viu Min SifiinM OS X1J Viu Min SifiinM OS X\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("   hi!    -1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-11104");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11104) + "'", int1 == (-11104));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("..J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1A1A104A10A4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1A1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                                                                                         MIXED MODE                                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                          MIXED MODE                                                                                                         ");
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
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44a444a4 ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("http://java.oracle.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: http://java.oracle.com/ is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("8-F#U");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaclATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPSO:.Vg;", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a8-FTUa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a8-FTUa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44a444a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44a444a4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1 10 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 10 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("J4 Vi4u4 M4in4 S4ifi4i4nM4 OS X");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"J4 Vi4u4 M4in4 S4ifi4i4nM4 OS X\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 0, (double) 104.0f, (double) 23);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(" -1 1 100 33 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 1 100 33 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3293, (long) 26, (long) 23);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 23L + "'", long3 == 23L);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3293, 90, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 35.0f, (double) 100.0f, (double) 62);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 15, (float) 90, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32.0#10.0#97.0#104.0#10.0" + "'", str9, "32.0#10.0#97.0#104.0#10.0");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("###################################################################################################################################################################################################################################################100", (float) 9L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("sun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: sun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob8-ftusun.lw2wt.m2cosx.cprinterjob is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("############");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("/Users/sanjitkumar/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: /Users/sanjitkumar/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-11104), (float) 5, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 5.0f + "'", float3 == 5.0f);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 104.0d + "'", double9 == 104.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                          aaaaaaaaaasanjitkumar                                                                                          aaaaaaaaaa-1#10#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("users/sanjitkumar");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10 10 10 100 1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 10 10 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a8-FTUa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1.0d, (double) 246, (double) 7);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1U10U-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1L, 0.0d, (double) 220);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 220.0d + "'", double3 == 220.0d);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 10 -1", (long) 58);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58L + "'", long2 == 58L);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 3293.0f, (double) 6L, 23.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3293.0d + "'", double3 == 3293.0d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3293, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# a 4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 220, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) (short) 1, 223);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1#104#10#4" + "'", str15, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("avaVirtualMachineSpecification/Users/sanjitkuma");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"avaVirtualMachineSpecification/Users/sanjitkuma\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1.8.0_181-b13");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.8.0_181-b13\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("  a 4 a 4  a 4 a 44 a #");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '#', 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 'a', (long) (byte) 1, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("EN", (long) 104);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 104L + "'", long2 == 104L);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, 9, 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1a100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(3293.0f, Float.POSITIVE_INFINITY, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + Float.POSITIVE_INFINITY + "'", float3 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 9L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("mixedmode", 23L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23L + "'", long2 == 23L);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a8-FTUa                                                                                                                                                                                                                     ", (float) 26L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("http://jav");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("JAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1), (double) (-1110410L), 5.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1110410.0d) + "'", double3 == (-1110410.0d));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 7, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 104 + "'", int17 == 104);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1a100");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 32.0d, (double) 26L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1#100", (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) 100, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 9, 1.8f, (float) 3293);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.8f + "'", float3 == 1.8f);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4aaa4aaa http://java.oracle.com/ tnemnorivnEemitnuRES)MT(avaJ http://java.oracle.com/ sun.awt.CGraphicsEnvironment 4aaa4aaa ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("Java Platform API Specification", (float) 205L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 205.0f + "'", float2 == 205.0f);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) '4', (float) ' ', 26.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                       JvVirtulMchineSpecifictio");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                        JvVirtulMchineSpecifictio is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 18, (long) 35, (long) 23);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10 10 10 100 1 100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 220L, (double) 9, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 220.0d + "'", double3 == 220.0d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("ficationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJava");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 10, 26, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 58, (double) Float.POSITIVE_INFINITY, 9.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3 == 9.0d);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("HTTP://JAVA.ORACLE.COM/", (double) 246);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 246.0d + "'", double2 == 246.0d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4444444444444444A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 17, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("mixedmode");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("J v  Virtu l M chine Specific tion");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Java(TM)SERuntimeEnvironment");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        short[] shortArray2 = new short[] { (short) -1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 23, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("\n", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(15, (int) (short) 0, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 97, (float) 10L, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (-1));
        java.lang.Class<?> wildcardClass10 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("http://java.oracle.com/");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) ' ', (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0410.0497.04104.0410.0" + "'", str12, "32.0410.0497.04104.0410.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str14, "32.0a10.0a97.0a104.0a10.0");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(220.0f, 0.0f, (float) 24L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 220.0f + "'", float3 == 220.0f);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 1 104 10 4", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("ne");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ne\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                          MIXED MODE", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("HTTP://JAV");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444A");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 35, (long) 246, 104L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 246L + "'", long3 == 246L);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', (int) 'a', (int) (byte) -1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', 9, 8);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("java virtual machine specificationaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("/var/folders/q_/q9vzn1hs6pqdw0s9wlgsgybw0000gn/T/", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32.0410.0497.04104.0410.0" + "'", str14, "32.0410.0497.04104.0410.0");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("US 4 a  ", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1a1a104a10a4" + "'", str20, "-1a1a104a10a4");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, 1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 28, 205);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("32.0A10.0A97.0A104.0A10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32.0A10.0A97.0A104.0A10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4 a 4 a  04 a 4 a  44 a 4 a  14 a 4 a  ", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 35.0f, (-1.41410441044E11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.41410441044E11d) + "'", double3 == (-1.41410441044E11d));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "/var/folders/q_/q9vzn1hs6pqdw0s9wlgsgybw0000gn/T/");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: /var/folders/q_/q9vzn1hs6pqdw0s9wlgsgybw0000gn/T/");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.04104.0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#4 a 4 a#4#4 a 4 a# ", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#104.0" + "'", str5, "-1.0#104.0");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(8, 0, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("041", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 41 + "'", byte2 == (byte) 41);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 104, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(" aaa4aaa4 tnemnorivnEscihparGC.twa.nus /moc.elcaro.avaj//:ptth Java(TM)SERuntimeEnvironment /moc.elcaro.avaj//:ptth aaa4aaa4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(" 4  4   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 4  4   \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(246, 100, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 246 + "'", int3 == 246);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 41, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 41 + "'", byte3 == (byte) 41);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 223, (double) (-11104), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-11104.0d) + "'", double3 == (-11104.0d));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 52L, (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3, (double) 6, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(246.0d, 220.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("J Viu Min SifiinM OS X", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
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
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("JAVA PLATFORM API SPECIFICATION");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 5, (int) (byte) -1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("J v  Virtu l M chine Specific tion");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"J v  Virtu l M chine Specific tion\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 41, (short) (byte) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("JvVirtulMchineSpecifiction");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1 1 104 10 4-1 1 104 10 4");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("sun.awt.CGraphicsEnvironment");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"sun.awt.CGraphicsEnvironment\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaa aaaaaaaa aaaaaaa", (double) 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.0d + "'", double2 == 12.0d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) (byte) 10, 4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str14, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32.0410.0497.04104.0410.0" + "'", str16, "32.0410.0497.04104.0410.0");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(52.0f, (float) 104, (float) 3292);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3292.0f + "'", float3 == 3292.0f);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("us");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 90, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 90");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-14104-1" + "'", str10, "-14104-1");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4aaa4aaa ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 'a', 23.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) -1, (float) 32L, (float) 7);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((-1110410.0d), 5.0d, 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1110410.0d) + "'", double3 == (-1110410.0d));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("Mixedmode", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(23.0f, (float) (short) 0, (float) 3292);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3292.0f + "'", float3 == 3292.0f);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3292, 10, (-11104));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-11104) + "'", int3 == (-11104));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.01 0.401 0.79 0.01 0.23");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.01 0.401 0.79 0.01 0.23\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#a#aaa4a4aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a#aaa4a4aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 104.0d + "'", double10 == 104.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 104.0" + "'", str12, "-1.0 104.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 7, (float) 9, Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 7.0f + "'", float3 == 7.0f);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 5, (int) (byte) -1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1#10#-1" + "'", str12, "-1#10#-1");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("sun.lw2wt.m2cosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("class/uSERS/SANJITKUMAR /uSERS/SANJITKUMAR[/uSERS/SANJITKUMARLjava/uSERS/SANJITKUMAR./uSERS/SANJITKUMARlang/uSERS/SANJITKUMAR./uSERS/SANJITKUMARString/uSERS/SANJITKUMAR;/uSERS/SANJITKUMARclass/uSERS/SANJITKUMAR /uSERS/SANJITKUMAR[/uSERS/SANJITKUMARLjava/uSERS/SANJITKUMAR./uSERS/SANJITKUMARlang/uSERS/SANJITKUMAR./uSERS/SANJITKUMARString/uSERS/SANJITKUMAR;/uSERS/SANJITKUMARclass/uSERS/SANJITKUMAR /uSERS/SANJITKUMAR[/uSERS/SANJITKUMARLjava/uSERS/SANJITKUMAR./uSERS/SANJITKUMARlang/uSERS/SANJITKUMAR./uSERS/SANJITKUMARString/uSERS/SANJITKUMAR;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                100.0a10.0a10.0", (double) 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1 1 0 0 10", 136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 136 + "'", int2 == 136);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "041" + "'", str11, "041");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(35, 4, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) -1, (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 24, 58L, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24L + "'", long3 == 24L);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 'a', Float.POSITIVE_INFINITY, 5.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 5.0f + "'", float3 == 5.0f);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("J Viu Min SifiinM OS X", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" PLATFORM API SPECIFICATION", (double) 205.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 205.0d + "'", double2 == 205.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3292, 1, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 97L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("JAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.Class<?> wildcardClass15 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 104 + "'", int14 == 104);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 32L, (float) (byte) 1, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1110410L), (double) 104L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                       ", (double) 23.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.0d + "'", double2 == 23.0d);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("       -1.0#220.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.04-1.04-1.04-1.04100.0", (double) 104L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.0d + "'", double2 == 104.0d);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 100 + "'", byte1 == (byte) 100);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 4, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("       -1.0#220.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 10, 0.0f, (float) 7L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 28, 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (-1), (int) (byte) 41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 104 + "'", int19 == 104);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-141410441044" + "'", str21, "-141410441044");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 97, 0);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str13, "32.0 10.0 97.0 104.0 10.0");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a#", 58L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58L + "'", long2 == 58L);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(220L, (long) 2, (long) 136);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 3293);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3293.0f + "'", float2 == 3293.0f);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (byte) 100, 5);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (byte) 0, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("sanjitkumar");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("/Library/Java/JavaVirtualMachines/jdk.8._8.jdk/Contents/Home/jre");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: /Library/Java/JavaVirtualMachines/jdk.8._8.jdk/Contents/Home/jre is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44a444a4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44a444a4 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                               44444444444444444444444                                                                                                                ", (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("Java(TM)SERuntimeEnvironment#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" a #4 a 4  a 4 a 4  a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" a #4 a 4  a 4 a 4  a \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                        ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(5, 1791, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a 4 a  ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("/USERS/SANJITKUMAR/LIBRARY/JAVA/EXTENSIONS:/LIBRARY/JAVA/JAVAVIRTUALMACHINES/JDK1.8.0_181.JDK/CONTENTS/HOME/JRE/LIB/EXT:/LIBRARY/JAVA/EXTENSIONS:/NETWORK/LIBRARY/JAVA/EXTENSIONS:/SYSTEM/LIBRARY/JAVA/EXTENSIONS:/USR/LIB/JAVA", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("   4  4   4  44  #", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 41, (short) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.3", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.7f, (float) (byte) 100, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.7f + "'", float3 == 1.7f);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("041", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 17, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("class [Ljava.lang.CharSequence;class [Ljava.lang.CharSequence;class [Ljava.lang.String;", (int) (byte) 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1L, (double) (byte) 10, (double) 24);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.0d + "'", double3 == 24.0d);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsed");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.Class<?> wildcardClass10 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("####-1.0#4a44####", (double) 1.4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.399999976158142d + "'", double2 == 1.399999976158142d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, 52, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(58, (int) (byte) 41, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.math.NumberUtils.max(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("S 4   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: S 4    is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(2L, (long) 10, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("J Viu Min SifiinM OS X-J Viu Min SifiinM OS X1J Viu Min SifiinM OS X4J Viu Min SifiinM OS X1J Viu Min SifiinM OS X0J Viu Min SifiinM OS X4J Viu Min SifiinM OS X-J Viu Min SifiinM OS X1J Viu Min SifiinM OS X");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"J Viu Min SifiinM OS X-J Viu Min SifiinM OS X1J Viu Min SifiinM OS X4J Viu Min SifiinM OS X1J Viu Min SifiinM OS X0J Viu Min SifiinM OS X4J Viu Min SifiinM OS X-J Viu Min SifiinM OS X1J Viu Min SifiinM OS X\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 41, (short) (byte) 41, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((-11104.0d), (double) 7.0f, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-11104.0d) + "'", double3 == (-11104.0d));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444444444444444444444444444444444444444444444", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(4, (int) (short) -1, (int) (byte) 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 3292, 0.0d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3292.0d + "'", double3 == 3292.0d);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaaaaaaaaa/Users/");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaaaaaaaaa/Users/\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444", 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4444444444444445E22d + "'", double2 == 4.4444444444444445E22d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("/Users/sanjitkumar/Library/Java/...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1#1#104#10#4", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(100.0f, 0.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 10 10 100 1 100" + "'", str9, "10 10 10 100 1 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1U10U-1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#4#a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("J4 Vi4u4 M4in4 S4ifi4i4nM4 OS X");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 1 0 0 10" + "'", str12, "1 1 0 0 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("SUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 1, (double) 'a', (double) 26.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4, 62, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 0L, (long) 41);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 41L + "'", long3 == 41L);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4aaa4aaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4aaa4aaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("##a#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##a#4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 34, (float) 104L, (float) 26L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 26.0f + "'", float3 == 26.0f);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10.16f, (double) 246, (double) 3292);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3292.0d + "'", double3 == 3292.0d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100.0a-1.0a-1.0a-1.0a100.0ava Virtual Machine Specification100.0a-1.0a-1.0a-1.0a100.0ava Virtual4aaa4aaa100.0a-1.0a-1.0a-1.0a100.0ava Virtual Machine Specification100.0a-1.0a-1.0a-1.0a100.0ava Virtual");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0a-1.0a-1.0a-1.0a100.0ava Virtual Machine Specification100.0a-1.0a-1.0a-1.0a100.0ava Virtual4aaa4aaa100.0a-1.0a-1.0a-1.0a100.0ava Virtual Machine Specification100.0a-1.0a-1.0a-1.0a100.0ava Virtual\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0#10.0#97.0#104.0#10.0" + "'", str10, "32.0#10.0#97.0#104.0#10.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', (int) (byte) 0, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 7.0f, (double) (byte) 41, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1a10a-1", (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 5, (double) 1.8f, (double) 58L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7999999523162842d + "'", double3 == 1.7999999523162842d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                       JvVirtulMchineSpecifictio", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.7f, (float) 246L, (float) (byte) 41);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.7f + "'", float3 == 1.7f);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 8, 205L, 220L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 220L + "'", long3 == 220L);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("52.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(100L, (long) (byte) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 104 + "'", int14 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 104 + "'", int15 == 104);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        float[] floatArray2 = new float[] { (-1L), 220 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) (byte) 100, 24);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 100, 28);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 220.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0a220.0" + "'", str4, "-1.0a220.0");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 220.0f + "'", float5 == 220.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a220.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(220L, (long) ' ', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                               44444444444444444444444                                                                                                                ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1.8f, 104.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("/uSERS/SANJITKUMAR/PERSONAL_PROJECTS/cOLLEGEiLLINOIS/sOFTWAREeNGINEERINGpRINCIPLES/MILESTONE3/M3_SCRIPTS", (float) 205);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 205.0f + "'", float2 == 205.0f);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 104 + "'", int23 == 104);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10 10 10 100 1 100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3292, (double) 17, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 41, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("/Users/sanjitkumar/Library/Java/...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("SUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1#-1#1#100#33#10a8-FTUa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(9.0f, (float) (-1L), (float) 18);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("x86_64#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"x86_64#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("JAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"JAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A8-ftuA                                                                                                                                                                                                                     ", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1#10ne-1#10ne-1#10ne-1#10ne-1#10ne-1#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        short[] shortArray5 = new short[] { (byte) 100, (byte) -1, (short) 1, (short) 100, (short) 0 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 -1 1 100 0" + "'", str9, "100 -1 1 100 0");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("http://java.oracle.com/", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual", (long) 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62L + "'", long2 == 62L);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# a 4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 41, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("Java Virtual Machine SpecificationJava Virtual4aaa4aaaJava Virtual Machine SpecificationJava Virtual");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Java Virtual Machine SpecificationJava Virtual4aaa4aaaJava Virtual Machine SpecificationJava Virtual\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 220L, (double) 35, 5.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 97, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1 1 0 0 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 1 0 0 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) -1, 0L, (long) 26);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 26L + "'", long3 == 26L);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(" 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#aaa4");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 43684 + "'", number1, 43684);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(3293, (int) (short) 0, 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3293 + "'", int3 == 3293);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '4', (long) (byte) 100, (long) 223);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 223L + "'", long3 == 223L);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("JAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: JAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUALJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1a1a0a0a10aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("AaaaaaaaaaaaaaaaaclATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPSO:.Vg;", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("..J");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((-1L), 9L, 246L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 246L + "'", long3 == 246L);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 246, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (byte) 10, 3293);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("Java Virtual Machine Specification/Users/sanjitkumar");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang3.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("00.040.040.0", 41L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("sun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"sun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, (float) 205, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 205.0f + "'", float3 == 205.0f);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 41, 0L, 220L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 220L + "'", long3 == 220L);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("/Users/s\nnjitkum\nr", (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 41, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 41 + "'", byte3 == (byte) 41);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaa6aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0a1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("00.040.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.040.040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 223, 52);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1#10#-1" + "'", str8, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(5.0f, 0.0f, (float) 9L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"UTF-8\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                           -1#1#104#10#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                           -1#1#104#10#4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("####################################################", (short) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 15, 220);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1#10#-1" + "'", str8, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 2, (long) 34, 62L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                       JvVirtulMchineSpecifiction");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.8.0_181-b13");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A8-FTUA4441.6A8-FTUA4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("J v  Virtu l M chine Specific tion", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1.5", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("31b-181_0.8.1sun.lwawt.macosx.LWCToolkit", (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("       -1.0#220.0", (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 104 + "'", int19 == 104);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 7, 35L, (long) 43684);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 43684L + "'", long3 == 43684L);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(41L, (long) 205, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A#", (long) 246);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 246L + "'", long2 == 246L);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "/Users/sanjitkumar/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: /Users/sanjitkumar/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("Oracle Corporation");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Oracle Corporation\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', (int) (byte) 1, 4);
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
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...Mixedmode");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', (int) 'a', (int) (byte) -1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) '#', 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 24, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 5, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((-1L), (long) (short) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 5.0f, 0.0d, (double) 23);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23.0d + "'", double3 == 23.0d);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 41L, 220.0d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 220.0d + "'", double3 == 220.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3, 2.0d, (double) 62);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1A10A-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1A10A-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jr", 246L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 246L + "'", long2 == 246L);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "041" + "'", str7, "041");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                          MIXED MOD");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                           MIXED MOD");
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
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0a1" + "'", str14, "0a1");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("J4 Vi4u4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: J4 Vi4u4  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, 5, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: # is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "4444444444444444444444444444444444/Users/sanjitkumar");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4444444444444444444444444444444444/Users/sanjitkumar");
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
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0a1" + "'", str14, "0a1");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', 0L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 -1 10 0 -1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("32.0410.0497.04104.0410.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 6L, (float) 15, (float) 246L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 246.0f + "'", float3 == 246.0f);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" PL");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  PL is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("http://java.oracle.com/");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 58L, 0.0d, (double) 33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 2, (float) 23L, (float) 7);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 10 10 10 10 10 10 10 10 10 10 10 10 10 10 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A8-FTUA PLATFORM API S ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Java Platform API SpecificationJava Platform API SpecificationJava Platform API SpecificationJava P:RTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...Mixedmode");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...MixedmodeJ...Mixedmode\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(246L, (long) 'a', (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) '#', (double) '4', (double) 4);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1a1a0a0a10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a1a0a0a10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0" + "'", str6, "-1.0");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a8-FTUa PLATFORM API SPECIFICATION", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 0, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 0, 4.0d, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4444444444444444444444444444444444/Users/sanjitkuma");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("sun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0#1" + "'", str8, "0#1");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a8-ftua platform api specification");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a8-ftua platform api specification\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang3.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("EN");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }
}

