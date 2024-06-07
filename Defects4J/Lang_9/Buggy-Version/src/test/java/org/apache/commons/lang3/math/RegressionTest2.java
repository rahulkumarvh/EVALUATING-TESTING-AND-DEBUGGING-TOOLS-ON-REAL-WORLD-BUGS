package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("JAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 100, (float) 10, 104.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 104.0f + "'", float3 == 104.0f);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 62, (float) 2L, (float) 2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 62.0f + "'", float3 == 62.0f);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 33, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 15, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("25.181-b13");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "uS 4 a  ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: uS 4 a  ");
        } catch (java.io.UnsupportedEncodingException e) {
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("xed modxed modxed ######################Java(TM) SE Runtime Environment1.8.0_1811.8.0_1811.8#######################   xed modxed modxed ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 12, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', 28, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 26.0f, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1.3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.3\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.Class<?> wildcardClass3 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) ' ', 205L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.01#0.401#0.79#0.01#0.23");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 223, (long) 'a', (long) 4);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 223L + "'", long3 == 223L);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "041" + "'", str7, "041");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 43684, 28);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 1 0 0 10" + "'", str12, "1 1 0 0 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1.0f, (double) 62, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100L, 9.0f, (float) (-1110410L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1110410.0f) + "'", float3 == (-1110410.0f));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("PLATFORM API SPECIFICATIONususususususususususususu");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"PLATFORM API SPECIFICATIONususususususususususususu\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("atform API Speci");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"atform \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaa-1#10#-1 aaaaaaaaaasanjitkumar");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                    ", (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("US 4   ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.7f, (float) 223L, (float) 6);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.7f + "'", float3 == 1.7f);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 41, (short) (byte) 41, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 26, 15.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 26.0d + "'", double3 == 26.0d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("JvVirtulMchineSpecifiction");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"JvVirtulMchineSpecifiction\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        float[] floatArray5 = new float[] { 100L, (-1.0f), (byte) -1, (-1.0f), 100.0f };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 9, 0);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[100.0, -1.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("sun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrinterJo");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        float[] floatArray2 = new float[] { (-1L), 220 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 220.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0a220.0" + "'", str4, "-1.0a220.0");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 220.0f + "'", float5 == 220.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a220.0" + "'", str7, "-1.0a220.0");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 41 + "'", byte3 == (byte) 41);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("32.010.097.010.010.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!    -1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("# a 4 a#4#4 a -1A10A-# a 4 a#4#4 a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10, (double) 41, (double) 220.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS10.16");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("J4 Vi4u4 M4in4 S4ifi4i4nM4 OS X");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1.8");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.8\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) (byte) 10, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 23, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                         MIXED MODE                                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("J...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("JAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"JAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.01 0.401 0.79 0.01 0.23");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) ' ', (float) 6L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a8-FTUa                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(2, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "-1.0#220.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.0#220.0");
        } catch (java.io.UnsupportedEncodingException e) {
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', 41, 24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', (int) (short) 41, 206);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("sanjitkum", (float) 23);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1 58 62 2 -1 12");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 58, (float) (short) 0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 58.0f + "'", float3 == 58.0f);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 104 + "'", int19 == 104);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaa-1 -1 10 0 -1aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaa4aaa4aaa 4aaa4aaa 4aaa4aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaa4aaa4aaa 4aaa4aaa 4aaa4aa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0, 9.0f, (float) 43684L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(" aaa aaa  tnemnorivnEscihparGC.twa.nus /moc.elcaro.avaj//:ptth Java(TM)SERuntimeEnvironment /moc.elcaro.avaj//:ptth aaa aaa ", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("   4  4   4  44  #");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(9, 87, 3293);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(104.0f, (float) 97L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 104.0f + "'", float3 == 104.0f);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(71, 18, 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 136 + "'", int3 == 136);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(75, 41, 220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 220 + "'", int3 == 220);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 0, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ## is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                 Java  -1 1 100 33 10 Machine Specif -1 1 100 33 10Java  -1 1 100 33 104aaa4aaaJava  -1 1 100 33 10 Machine Specif -1 1 100 33 10Java  -1 1 100 33 10                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                 Java  -1 1 100 33 10 Machine Specif -1 1 100 33 10Java  -1 1 100 33 104aaa4aaaJava  -1 1 100 33 10 Machine Specif -1 1 100 33 10Java  -1 1 100 33 10                                                                 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 1" + "'", str13, "0 1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "041" + "'", str16, "041");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 8, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#-1#1#100#33#10" + "'", str15, "-1#-1#1#100#33#10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1a-1a1a100a33a10" + "'", str18, "-1a-1a1a100a33a10");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" a #4 a 4  a 4 a 4  a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" a #4 a 4  a 4 a 4  a \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0 52.0 220.0 4.0 10.0 0.0", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A8-FTUA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaa4aaa4aaa 4aaa4aaa 4aaa4aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("44444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a35.0a0.0a52.0a52.0", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.01 0.401 0.79 0.01 0.23");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a35.0a0.0a52.0a52.0", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("####################################################", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("ava Virtual Machine Specification/Users/sanjitkuma", 62L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62L + "'", long2 == 62L);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("X SO MniifiS niM uiV J");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"X SO MniifiS niM uiV J\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("tiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nusJ#v# Pl#tform API SpecitiklooTCWL.xsocam.twawl.nus");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1791, (long) 3293, (long) 9);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3293L + "'", long3 == 3293L);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(220, 47, 1791);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1791 + "'", int3 == 1791);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 41, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("Java(TM) SE Runtime Environment", 223L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 223L + "'", long2 == 223L);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.Class<?> wildcardClass10 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        float[] floatArray2 = new float[] { (-1L), 220 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 220.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0a220.0" + "'", str4, "-1.0a220.0");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 220.0f + "'", float5 == 220.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 220.0f + "'", float6 == 220.0f);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 97, 23.0f, (float) (-11104));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-11104.0f) + "'", float3 == (-11104.0f));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" aaa aaa  tnemnorivnEscihparGC.twa.nus /moc.elcaro.avaj//:ptth Java(TM)SERuntimeEnvironment /moc.elcaro.avaj//:ptth aaa aaa ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" aaa aaa  tnemnorivnEscihparGC.twa.nus /moc.elcaro.avaj//:ptth Java(TM)SERuntimeEnvironment /moc.elcaro.avaj//:ptth aaa aaa \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1d + "'", double1 == 1.1d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a35.0a0.0a52.0a52.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("edomdexim");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("32.0A10.0A97.0A104.0A10.0", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("Java Platform API SpecificationJava Platform API SpecificationJava Platform API SpecificationJava P", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("jAVA pLATFORM api sPECIFICATION");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("# a 44 a 4 a  4 a 4 a  ", (long) 34);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 220, (double) (byte) 10, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 7L, 24.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', (int) (byte) 10, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(97, (int) '#', 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(26, (-11104), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-11104) + "'", int3 == (-11104));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1A10A", 62L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62L + "'", long2 == 62L);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("xed mode");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"xed mode\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("clATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPSO:.Vg;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"clATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPSO:.Vg;\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1#10#-1" + "'", str8, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 104.0" + "'", str13, "-1.0 104.0");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("J1.8.0_181");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.7999999523162842d, (double) 12, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.0d + "'", double3 == 12.0d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', (int) 'a', (int) (byte) -1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 104, 1791);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  1.0452.04220.044.0410.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  1.0452.04220.044.0410.040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("nment", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 52, (double) 4, (double) 23);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, 24, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaa aaaaaaaa aaaaaaa", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        double[] doubleArray5 = new double[] { (short) -1, '#', 0L, 52.0f, 52.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) '#', 62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 35.0, 0.0, 52.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("jAVA pLATFORM api sPECIFICATION");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("A8-FTUA PLATFORM API SPECIFICATION");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A8-FTUA PLATFORM API SPECIFICATION\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 104, 23);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', 18, (int) (byte) 10);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.Class<?> wildcardClass20 = shortArray5.getClass();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 1 0 0 10" + "'", str9, "1 1 0 0 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(" 4 a 4 a  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                             -1.0 104.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        1a1a0a0a10                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1#10ne-1#10ne-1#10ne-1#10ne-1#10ne-1#10");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("atform API Speci", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, 24, (int) (short) 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) (short) -1, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', 71, 7);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0 10.0 10.0" + "'", str11, "100.0 10.0 10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0a10.0a10.0" + "'", str13, "100.0a10.0a10.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 104.0f, 0.0d, 3292.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3292.0d + "'", double3 == 3292.0d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(".:avaj/bil/rsu/:snoisnetxE/avaJ/yrarbiL/metsyS/:snoisnetxE/avaJ/yrarbiL/krowteN/:snoisnetxE/avaJ/yrarbiL/:snoisnetxE/avaJ/yrarbiL/ramuktijnas/sresU/", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 26.0f, (double) 87, 3292.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3292.0d + "'", double3 == 3292.0d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("desrodne/bil/erj/emoH/stnetnoC/kdj.181_0.8.1kdj/senihcaMlautriVavaJ/avaJ/yrarbiL");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"desrodne/bil/erj/emoH/stnetnoC/kdj.181_0.8.1kdj/senihcaMlautriVavaJ/avaJ/yrarbiL\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("xed mode   ", 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("SUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOB");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"SUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOBaaFTUSUNaLWaWTaMaCOSXaCPRINTERJOB\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((-1110410L), 97L, 3293L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1110410L) + "'", long3 == (-1110410L));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("JavaVirtualMachineSpecification");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("sun.lwawt.macosx.LWCToolkit");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"sun.lwawt.macosx.LWCToolkit\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (-1), 0L, 205L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 205L + "'", long3 == 205L);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                100.0a10.0a10.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA8-FTUA44444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((-1110410.0f), (float) 33, (-1110410.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 33.0f + "'", float3 == 33.0f);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 87, (float) 23, 3293.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 23.0f + "'", float3 == 23.0f);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"      \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((-11104.0d), (double) 75, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-11104.0d) + "'", double3 == (-11104.0d));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1.0f), (double) 10, (double) 34);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 41, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(18, 58, 205);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 15, (int) (byte) -1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 104.0d + "'", double12 == 104.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("    0 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    0 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', 0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (-1), (int) (short) 41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 9, 58.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 58.0f + "'", float3 == 58.0f);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 9, 6);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 0, 100, -1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a1a1a0a100a-1" + "'", str13, "100a1a1a0a100a-1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100 1 1 0 100 -1" + "'", str16, "100 1 1 0 100 -1");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444/Users/sanjitkumar");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("Oracle Corporatio", (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                1a1a0a0a10", (long) 223);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 223L + "'", long2 == 223L);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 41, (short) 100, (short) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 431, (double) (short) 10, (double) 43684);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43684.0d + "'", double3 == 43684.0d);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', (int) (byte) 1, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 0, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("Java Platform API SpecificationJava Platform API SpecificationJava Platform API SpecificationJava P", (double) 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 75.0d + "'", double2 == 75.0d);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(3293.0f, 1.8f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3293.0f + "'", float3 == 3293.0f);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "java virtual machine specificationaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: java virtual machine specificationaaaaaaaaaaaaaaaaaaaaaaaa");
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a10a-1" + "'", str7, "-1a10a-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-14104-1" + "'", str9, "-14104-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-14104-1" + "'", str11, "-14104-1");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("v Virtul Mchine Specifiction/Users/snjitkum");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"v Virtu\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("ranjitkumas");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ranjitkumas\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 9, (-1.0f), (float) 62L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 62.0f + "'", float3 == 62.0f);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("             -1#10#-1              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1#10#-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 41, 230, 220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("8-F#U");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"8-F#U\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 12L, 3293.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Java Virtual Machine Specification");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Java Virtual Machine Specification\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#10#-1" + "'", str10, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-14104-1" + "'", str13, "-14104-1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 230, (float) 87, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 34, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 34, 43684);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("sun.awt.CGraphicsEnvironment", (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                 Java  -1 1 100 33 10 Machine Specif -1 1 100 33 10Java  -1 1 100 33 104aaa4aaaJava  -1 1 100 33 10 Machine Specif -1 1 100 33 10Java  -1 1 100 33 10                                                                 ", Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        short[] shortArray5 = new short[] { (byte) -1, (short) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 41, 3293);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1, 10, 0, -1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#-1#10#0#-1" + "'", str7, "-1#-1#10#0#-1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 -1 10 0 -1" + "'", str11, "-1 -1 10 0 -1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                100.0a10.0a10.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 220L, (long) 41);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 220L + "'", long3 == 220L);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("             -1#10#-1              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        long long22 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("Java Virtual Machine Specification", (float) 246);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 246.0f + "'", float2 == 246.0f);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1" + "'", str10, "0#1");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 104, 23);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', 18, (int) (byte) 10);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 1 0 0 10" + "'", str9, "1 1 0 0 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 10 + "'", short19 == (short) 10);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(23, 136, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 136 + "'", int3 == 136);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Ramuktijnas/sresU/");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("   hi!    ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa -1 1 100 33 10", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', (int) (short) 41, 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("sanjitkumar", (-11104.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-11104.0d) + "'", double2 == (-11104.0d));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) (short) -1, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0 10.0 10.0" + "'", str11, "100.0 10.0 10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0a10.0a10.0" + "'", str13, "100.0a10.0a10.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1A10A-4444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("# a 4 a#4#4 a -1A10A-# a 4 a#4#4 a ", 205L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 205L + "'", long2 == 205L);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (-1110410.0f), (double) 23.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23.0d + "'", double3 == 23.0d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("OSX4nM4i4ifi4S4in4M4u4Vi4J");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 15, 3293.0f, (float) 41L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3293.0f + "'", float3 == 3293.0f);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaa########################", (short) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        short[] shortArray2 = new short[] { (short) -1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 23, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a100" + "'", str8, "-1a100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 100" + "'", str10, "-1 100");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("J#v# Pl#tform API Speci");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 34, (long) 220, (long) (short) 41);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 220L + "'", long3 == 220L);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 7, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 1" + "'", str13, "0 1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("TnemnorivnEemitnuRES)MT(avaTnemnorivnEemitnuRES)MT(ava");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("J#v# Pl#tform API Speci");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 41, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("sUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("J v  Virtu l M chine Specific tion");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(246, (int) (byte) -1, 208);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 246 + "'", int3 == 246);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        double[] doubleArray5 = new double[] { (short) -1, '#', 0L, 52.0f, 52.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 35.0, 0.0, 52.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0 35.0 0.0 52.0 52.0" + "'", str8, "-1.0 35.0 0.0 52.0 52.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("mixed mode", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, (-11104), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 -1 1 100 33 10", (float) 220L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 220.0f + "'", float2 == 220.0f);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 97, 0);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(10L, 24L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("ficationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJava", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (byte) 0);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 52, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" PLATFORM API SPECIFICATIO                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" PLATFORM API SPECIFICATIO                                                                                                              \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "3b-8_.8.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 3b-8_.8.");
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
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".8");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8d + "'", double1 == 0.8d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1#10#-1" + "'", str12, "-1#10#-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 10 -1" + "'", str14, "-1 10 -1");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1a10a-1" + "'", str17, "-1a10a-1");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("32.0a10.0a97.0a104.0a10.0                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 10, (int) (byte) 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1a1a104a10a4" + "'", str20, "-1a1a104a10a4");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(3, 3293, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3293 + "'", int3 == 3293);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) ' ', (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', (int) (short) 0, 62);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 104.0d + "'", double15 == 104.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 28, (float) 41, 1.8f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.8f + "'", float3 == 1.8f);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA4#A#4#A# AAAAAAAAAA4AAA4AAA 4AAA4AAA 4AAA4AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("class [Ljava.lang.CharSequence;class [Ljava.lang.CharSequence;class [Ljava.lang.String;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class [Ljava.lang.CharSequence;class [Ljava.lang.CharSequence;class [Ljava.lang.String;\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("bbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 41, (short) 0, (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4aaa4aa", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("sanjitkumar", (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(5.0f, (float) (byte) 10, (float) 17);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 17.0f + "'", float3 == 17.0f);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("Java Virtual Machine Specificationaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Java\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1), (float) 100, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 41, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 47, 0.0d, (-11104.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-11104.0d) + "'", double3 == (-11104.0d));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 3292, 136);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1, (long) 242, (long) 206);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 242L + "'", long3 == 242L);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0Mac OS X-1.0a220.0", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1 58 62 2 -1 12");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, (float) 2L, (float) 33);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 33.0f + "'", float3 == 33.0f);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 7, (int) (byte) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0#104.0" + "'", str6, "-1.0#104.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0a104.0" + "'", str13, "-1.0a104.0");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (-1));
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) '#', (double) 10, (double) 246L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 41, (byte) 1, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS10.16");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS10.16\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("J V (Ti)uXEuR OnMmSuEOVMiOmSOn#   4#   4#   4#   4#   4#   4#   4#   4#   4#   4#   4#   4#   4#   ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1414040410" + "'", str13, "1414040410");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 1 0 0 10" + "'", str15, "1 1 0 0 10");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("Oracle Corporation");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', (int) '4', 3292);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 10 10 100 1 100" + "'", str9, "10 10 10 100 1 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("c", (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 41, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 8, (int) (byte) 0);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) ' ', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1.6");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.6\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("class/uSERS/SANJITKUMAR /uSERS/SANJITKUMAR[/uSERS/SANJITKUMARLjava/uSERS/SANJITKUMAR./uSERS/SANJITKUMARlang/uSERS/SANJITKUMAR./uSERS/SANJITKUMARString/uSERS/SANJITKUMAR;/uSERS/SANJITKUMARclass/uSERS/SANJITKUMAR /uSERS/SANJITKUMAR[/uSERS/SANJITKUMARLjava/uSERS/SANJITKUMAR./uSERS/SANJITKUMARlang/uSERS/SANJITKUMAR./uSERS/SANJITKUMARString/uSERS/SANJITKUMAR;/uSERS/SANJITKUMARclass/uSERS/SANJITKUMAR /uSERS/SANJITKUMAR[/uSERS/SANJITKUMARLjava/uSERS/SANJITKUMAR./uSERS/SANJITKUMARlang/uSERS/SANJITKUMAR./uSERS/SANJITKUMARString/uSERS/SANJITKUMAR;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 104, 15);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U8-F#U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 5, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-14104-1" + "'", str11, "-14104-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1a10a-1" + "'", str13, "-1a10a-1");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(208, 0, 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 431 + "'", int3 == 431);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a 4 a  ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 8, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 100, 33, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 -1 1 100 33 10" + "'", str8, "-1 -1 1 100 33 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1a-1a1a100a33a10" + "'", str15, "-1a-1a1a100a33a10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 1, (float) 0L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) '#', 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                         MIXED MODE                                                                                                         ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("US 4   ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((-11104.0f), (float) (-1110410L), 10.16f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1110410.0f) + "'", float3 == (-1110410.0f));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("... 4#a#4#a# 4#a#4#a#...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("J/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedv/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsed/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedVirtu/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedl/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedM/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedchine/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedSpecific/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedtionJ/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedv/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsed/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedVirtu/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedl/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedM/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedchine/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedSpecific/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedtionJ/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedv/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsed/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedVirtu/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedl/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedM/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedchine/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedSpecific/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedtionJ/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedv/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsed/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedVirtu/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedl/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedM/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedchine/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedSpecific/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedtionJ/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedv/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsed/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedVirtu/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedl/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedM/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedchine/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedSpecific/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsedtionJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        float[] floatArray5 = new float[] { 100L, (-1.0f), (byte) -1, (-1.0f), 100.0f };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 9, 0);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[100.0, -1.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (byte) 0);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 9, 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("/Users/sanjitkumar");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/Users/sa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("J4 Vi4u4 M4in4 S4ifi4i4nM4 OS X", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("tnemnorivnEemitnuRES)MT(avaJ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"tnemnorivnEemitnuRES)MT(avaJ\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 43684L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 43684L + "'", long3 == 43684L);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("32.0410.0497.04104.0410.32.0410.0497.04104.0410.32.0410.0497.04104.0410.32.0410.0497.04104.0410.3");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("xed mode   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("J#Vi#u#M#in#S#ifi#i#nM#OS X");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("TIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("J...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', 8, 246);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 10 10 100 1 100" + "'", str9, "10 10 10 100 1 100");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Environment1.8.0_1811.8.0_1811.8 Runtime SE Java(TM)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Environment1.8.0_1811.8.0_1811.8 Runtime SE Java(TM) is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("sun#lw#wt#m#cosx#CPrinterJob8-FTUsun#lw#wt#m#cosx#CPrinterJob8-FTUsun#lw#wt#m#cosx#CPrinterJob8-FTUsun#lw#wt#m#cosx#CPrinterJob8-FTUsun#lw#wt#m#cosx#CPrinterJob8-FTUsun#lw#wt#m#cosx#CPrinterJob8-FTUsun#lw#wt#m", (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10.16", (double) 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.16d + "'", double2 == 10.16d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 52, 7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 205, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) (short) 1, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.04104.0" + "'", str5, "-1.04104.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                tnemnorivnEemitnuRES)MT(avaJ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 208, 246.0f, (float) 45);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 45.0f + "'", float3 == 45.0f);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-141410441044" + "'", str16, "-141410441044");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 104 + "'", int17 == 104);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1 1 104 10 4" + "'", str19, "-1 1 104 10 4");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1 1 104 10 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -1 1 104 10  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 135, (long) 12, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 9, 6);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "                100.0a10.0a10.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                 100.0a10.0a10.");
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 25, (double) 2.0f, (double) 1.4f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.0d + "'", double3 == 25.0d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("MixedmodeJJJJJJJJJJJJJJJJJJJJJJJJJJJ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MixedmodeJJJJJJJJJJJJJJJJJJJJJJJJJJJ\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("EN");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(33, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                        ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 26, (long) 14, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        double[] doubleArray5 = new double[] { (short) -1, '#', 0L, 52.0f, 52.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 0, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 35.0, 0.0, 52.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(43684L, (long) 230, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 8, 0.8d, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', (int) (short) 100, 223);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 0, 431);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1a10a-1" + "'", str16, "-1a10a-1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 223);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 223.0f + "'", float2 == 223.0f);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 34, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 34L + "'", long3 == 34L);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(15.0d, (double) 135, (double) 223.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(4, 35, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.25                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("32.0410.0497.04104.0410.0sun.lw2wt.m2cosx.CPrinterJob32.0410.0497.04104.0410.0sun.lw2wt.m2cosx.CPrinterJob32.0410.0497.04104.0410.0sun.lw2wt.m2cosx.CPrinterJob32.0410.0497.04104.0410.0sun.lw2wt.m2cosx.CPrinterJob32.0410.0497.04104.0410.0sun.lw2wt.m2cosx.CPrinterJob32.0410.0497.04104.0410.0sun.lw2wt.m2cosx.CPrinterJob32.0410.0497.04104.0410.0sun.lw2wt.m2cosx.CPrinterJob32.0410.0497.04104.0410.0sun.lw2wt.m2cosx.CPrinterJob32.0410.0497.04104.0410.0sun.lw2wt.m2cosx.CPrinterJob32.0410.0497.04104.0410.0", (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Java Virtual Machine SpecificationJava Virtual4aaa4aaaJava Virtual Machine SpecificationJava Virtual");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0#104.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#104.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4aaa4aaa http://java.oracle.com/ tnemnorivnEemitnuRES)MT(avaJ http://java.oracle.com/ sun.awt.CGraphicsEnvironment 4aaa4aaa ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4aaa4aaa http://java.oracle.com/ tnemnorivnEemitnuRES)MT(avaJ http://java.oracle.com/ sun.awt.CGraphicsEnvironment 4aaa4aaa \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 71, (long) 1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 71L + "'", long3 == 71L);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 104, 0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 41, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 223.0f, (double) 'a', (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a1a0a0a10", 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) '#', 3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (short) 10, 5);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0a1" + "'", str14, "0a1");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(100.0f, (float) 0L, 17.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("sanjitkumsanjitkumsanjitkumsanjitkumsanjitkum");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 'a', 2.0f, (float) 104);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("sun.lwawt.macosx.CPrinterJob", 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 100, (short) 10, (byte) 100, (byte) 1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 100, 10, 100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0a0a100a10a100a1" + "'", str8, "0a0a100a10a100a1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(4.4444444444444445E22d, Double.POSITIVE_INFINITY, 104.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', (int) (byte) 100, (int) (short) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0" + "'", str9, "-1.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("####-1.0# a 4####", 119);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 119 + "'", int2 == 119);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("class/uSERS/SANJITKUMAR /uSERS/SANJITKUMAR[/uSERS/SANJITKUMARLjava/uSERS/SANJITKUMAR./uSERS/SANJITKUMARlang/uSERS/SANJITKUMAR./uSERS/SANJITKUMARString/uSERS/SANJITKUMAR;/uSERS/SANJITKUMARclass/uSERS/SANJITKUMAR /uSERS/SANJITKUMAR[/uSERS/SANJITKUMARLjava/uSERS/SANJITKUMAR./uSERS/SANJITKUMARlang/uSERS/SANJITKUMAR./uSERS/SANJITKUMARString/uSERS/SANJITKUMAR;/uSERS/SANJITKUMARclass/uSERS/SANJITKUMAR /uSERS/SANJITKUMAR[/uSERS/SANJITKUMARLjava/uSERS/SANJITKUMAR./uSERS/SANJITKUMARlang/uSERS/SANJITKUMAR./uSERS/SANJITKUMARString/uSERS/SANJITKUMAR;", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("UTF-", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100L, (double) 220.0f, 1.399999976158142d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 220.0d + "'", double3 == 220.0d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        double[] doubleArray5 = new double[] { (short) -1, '#', 0L, 52.0f, 52.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 223, 220);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 35.0, 0.0, 52.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 2, (float) 3293L, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3293.0f + "'", float3 == 3293.0f);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 28, (float) 135, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 5, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 0, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1#10#-1" + "'", str11, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("ava Virtual Machine Specification/Users/sanjitkuma");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("mixed mode", (long) 34);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(18.0d, (double) 1.7f, (double) 198);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7000000476837158d + "'", double3 == 1.7000000476837158d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" V", (double) 104.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.0d + "'", double2 == 104.0d);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 24, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(".8");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".8\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("JAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPE####-1.0# a 4####JAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPEC");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("###################################################################################################################################################################################################################################################100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10.16", (float) 214);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.16f + "'", float2 == 10.16f);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 41, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 41 + "'", byte3 == (byte) 41);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("/Library/Java/JavaVirtualMachines/jdk.8._8.jdk/Contents/Home/jre");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 18, (int) (byte) 10);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#10#-1" + "'", str10, "-1#10#-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(135, 58, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 135 + "'", int3 == 135);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-111010.0d), 18.0d, (double) 34L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 100, (short) 10, (byte) 100, (byte) 1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 223, (int) (byte) 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 100, 10, 100, 1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0a0a100a10a100a1" + "'", str8, "0a0a100a10a100a1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 97, 35);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str9, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32.0#10.0#97.0#104.0#10.0" + "'", str15, "32.0#10.0#97.0#104.0#10.0");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("###################################################################################################################################################################################################################################################100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaa", 3292.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3292.0f + "'", float2 == 3292.0f);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3293, 246, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28 + "'", int3 == 28);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("Jaavaa aVairtual");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Jaavaa aVairtual\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 41, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("mixed mode");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 104.0d + "'", double10 == 104.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.04104.0" + "'", str12, "-1.04104.0");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(45, 242, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 242 + "'", int3 == 242);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 45, 9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 10, 3293);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.Class<?> wildcardClass9 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1#10#-1" + "'", str8, "-1#10#-1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0 220.0aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0 220.0aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 97.0f, (float) 12);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3293L, (double) 2, (double) 25);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("   hi!    ", 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                            ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 66, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 66");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ##", (float) (-11104));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-11104.0f) + "'", float2 == (-11104.0f));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("J...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 5, 205);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 10 10 100 1 100" + "'", str9, "10 10 10 100 1 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "xed modxed modxed ######################Java(TM) SE Runtime Environment1.8.0_1811.8.0_1811.8#######################   xed modxed modxed ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: xed modxed modxed ######################Java(TM) SE Runtime Environment1.8.0_1811.8.0_1811.8#######################   xed modxed modxed ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0#1" + "'", str8, "0#1");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0#104.0" + "'", str6, "-1.0#104.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0a104.0" + "'", str9, "-1.0a104.0");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.7f, (float) 2L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1a-1a1a100a33a10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a-1a1a100a33a10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 41, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("US 4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("# a 44 a 4 a  4 a 4 a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" PLATFORM API SPECIFICATIO                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"PLATFORM API SPECIFICATIO\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 18, 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 0, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1a1a104a10a4" + "'", str18, "-1a1a104a10a4");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1a1a104a10a4" + "'", str24, "-1a1a104a10a4");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("8-F#U");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("32.0a10.0a97.0a104.0a10.0                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.01#0.401#0.79#0.01#0.23");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.01#0.401#0.79#0.01#0.23\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4#01#401#1#1-", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A# 4#A#4#A#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("   hi!    -1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-1-1#-1#10#0#-", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("xed modxed modxed ######################Java(TM) SE Runtime Environment1.8.0_1811.8.0_1811.8#######################   xed modxed modxed ", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(5, (int) (short) -1, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("JvVirtul\nneSpecifiction", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("http://java.oracle.com/");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"http://java.oracle.com/\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0A10.0A10.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(104L, (long) 100, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...J...J...J...J...J...J...J...J...", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" a #4 a 4  a 4 a 4  a ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (byte) 0);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
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
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 32, 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(43684L, (long) ' ', (-1110410L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1110410L) + "'", long3 == (-1110410L));
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.4444444E22f + "'", float1 == 4.4444444E22f);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(" JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual 100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                         MIXED MODE                                                                                                         ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 41, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("            ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("31b-181_0.8.1a31b-181_0.8.1l31b-181_0.8.1 31b-181_0.8.1M31b-181_0.8.1a31b-181_0.8.1c31b-181_0.8.1h31b-181_0.8.1i31b-181_0.8.1n31b-181_0.8.1e31b-181_0.8.1 31b-181_0.8.1S31b-181_0.8.1p31b-181_0.8.1e31b-181_0.8.1c31b-181_0.8.1i31b-181_0.8.1f31b-181_0.8.1i31b-181_0.8.1c31b-181_0.8.1a31b-181_0.8.1t31b-181_0.8.1i31b-181_0.8.1o31b-181_0.8.1n31b-181_0.8.1", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("x86_64#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa", (float) 41);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41.0f + "'", float2 == 41.0f);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(43684L, (long) 3293, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 43684L + "'", long3 == 43684L);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("14.46", 220L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 220L + "'", long2 == 220L);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("  aUS 4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"  aUS 4 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(7L, 12L, (long) 45);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 7L + "'", long3 == 7L);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("v Vl Mch Spcfco");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"v Vl Mch Spcfco\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(230, 220, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("ava Virtual Machine Specification/Users/sanjitkuma");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(52L, (long) 97, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("bbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: bbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJbbbJ is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("3b-8_ 8 ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 41, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("J Viu M", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((-1.0f), 223.0f, (float) 96);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 8, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 104 + "'", int16 == 104);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 104, 104);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts#/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts#/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts###/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts#/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts#/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts###/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 34, (long) 208, (long) 223);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 34L + "'", long3 == 34L);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("            ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(12L, (long) 97, (long) 24);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 3293, 206);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1a1a104a10a4" + "'", str20, "-1a1a104a10a4");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 104 + "'", int21 == 104);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.5", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 9, 6);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 0, 100, -1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a1a1a0a100a-1" + "'", str13, "100a1a1a0a100a-1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', (long) (byte) -1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str9, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0410.0497.04104.0410.0" + "'", str12, "32.0410.0497.04104.0410.0");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.01#0.401#0.79#0.01#0.23");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.01#0.401#0.79#0.01#0.23\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 8, (long) 9, (long) 246);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 8L + "'", long3 == 8L);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', 1L, (long) 41);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US-1#10#-1US", (long) 104);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 104L + "'", long2 == 104L);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str9, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaa#aaa4aaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("3b-8_.8.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3b-8_.8.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(1L, (long) 66, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 66L + "'", long3 == 66L);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 66L, (double) 41L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4444444444444444444444444444444444444444444444444444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4444444444444444444444444444444444444444444444444444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4444444444444444444444444444444444444444444444444444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4444444444444444444444444444444444444444444444444444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1#1#104#10#4" + "'", str20, "-1#1#104#10#4");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 104 + "'", int21 == 104);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1a1a104a10a4" + "'", str23, "-1a1a104a10a4");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 214, 223);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 214");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1a1a104a10a4" + "'", str21, "-1a1a104a10a4");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 104 + "'", int22 == 104);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        short[] shortArray2 = new short[] { (short) -1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 23, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a100" + "'", str9, "-1a100");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444/Users/sanjitkuma", (double) 47);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 47.0d + "'", double2 == 47.0d);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0111-401", (float) (-1110410L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1110410.0f) + "'", float2 == (-1110410.0f));
    }
}

