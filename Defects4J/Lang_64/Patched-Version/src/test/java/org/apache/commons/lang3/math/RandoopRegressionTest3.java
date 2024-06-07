package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaxed mode");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 90, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0 220.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-141410441044" + "'", str14, "-141410441044");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("MIXED MOD");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MIXED MOD\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0#104.0" + "'", str6, "-1.0#104.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 104.0d + "'", double8 == 104.0d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(":", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("UTF-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("...aaaaaaaaaS4");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, 41);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("xed mod");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaaaaaaaaa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaaaaaaaaa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scriptsaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 223L, 0.0d, (double) 135);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a8-ftua platform api specification");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a8-ftua platform api specification is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1A10A-4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.Class<?> wildcardClass14 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1" + "'", str12, "0 1");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("   hi!    ", (double) 71L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 71.0d + "'", double2 == 71.0d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa", 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, (float) 7L, (float) 135);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 135.0f + "'", float3 == 135.0f);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1#-1#1#100#33#10a8-FTU", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) '4', (int) (short) 1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0a10.0a10.0" + "'", str12, "100.0a10.0a10.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0#10.0#10.0" + "'", str16, "100.0#10.0#10.0");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(2L, (long) 1791, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1791L + "'", long3 == 1791L);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("tnemnorivnEemitnuRES)MT(avaJ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 223, (long) (byte) 41, 34L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 223L + "'", long3 == 223L);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XaJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XvJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XaJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS X(J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XTJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XMJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS X)J4 Vi4u4 M4in4 S4ifi4i4nM4 OS X J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XSJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XEJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS X J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XRJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XuJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XnJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XtJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XiJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XmJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XeJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS X J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XEJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XnJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XvJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XiJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XrJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XoJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XnJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XmJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XeJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XnJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XtJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS X");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0.0f, 0.0d, (double) 104.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a #4 a 4  a 4 a 4  ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0410.0410.0" + "'", str10, "100.0410.0410.0");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("/Users/sanjitkumar/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("########################aaaaaaaaa                                                                                                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, 0.0d, 3292.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3292.0d + "'", double3 == 3292.0d);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(5.0d, (double) 7L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.0d + "'", double3 == 7.0d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(8, 0, 205);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, 223, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("US 4 a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(2L, 3293L, (long) 23);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 41, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4v4Virtu4lM4chineSpecific4tion/Users/s4njitkum4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4v4Virtu4lM4chineSpecific4tion/Users/s4njitkum4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("            ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" 1.8.0_181");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', (int) 'a', (int) (byte) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', 220, (int) (byte) 10);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0 10.0 10.0" + "'", str16, "100.0 10.0 10.0");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...                    ...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("tion");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: tion is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(" 1.8.0_181", (short) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 220L, (double) 32, (double) 104L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 230, (double) 71, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 41, (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("J4 Vi4u4 ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#a#aaa4a4aa", (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1A10A");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) ' ', (int) ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int24 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 104 + "'", int22 == 104);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 104 + "'", int23 == 104);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 10 10 100 1 100" + "'", str9, "10 10 10 100 1 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a10a10a100a1a100" + "'", str11, "10a10a10a100a1a100");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 214, 45);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a10a-1" + "'", str7, "-1a10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 41, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("A8-ftuA                                                                                                                                                                                                                     ", 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        int[] intArray1 = new int[] { 220 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[220]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 220 + "'", int2 == 220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 220 + "'", int3 == 220);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        double[] doubleArray5 = new double[] { (short) -1, '#', 0L, 52.0f, 52.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 35.0, 0.0, 52.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0 35.0 0.0 52.0 52.0" + "'", str8, "-1.0 35.0 0.0 52.0 52.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0a35.0a0.0a52.0a52.0" + "'", str11, "-1.0a35.0a0.0a52.0a52.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.0#52.0#220.0#4.0#10.0#0.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 12.0d, (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4#4 a 4 a#4#100a1a1a0a100a-1 4 a# ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4aa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("x86_64");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 104.0d + "'", double10 == 104.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 104.0" + "'", str12, "-1.0 104.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 104.0d + "'", double14 == 104.0d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(206, 135, 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 206 + "'", int3 == 206);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(119, 100, 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', (int) (byte) 100, (int) (short) 0);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 13, 223L, (long) 119);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 13L + "'", long3 == 13L);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 41, (byte) 10, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 41 + "'", byte3 == (byte) 41);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) -1, (short) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.#1.71.2", (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 0.0d, (double) 58.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 58.0d + "'", double3 == 58.0d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(".lw2wt.m2cosx.CPri");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".lw2wt.m2\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(35, 0, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaa0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                             /Lib:/Lib");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"         \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 5.0f, 45.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 43684L, (double) (short) 100, (double) 71);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 71.0d + "'", double3 == 71.0d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 41.0f, (double) 41L, (double) 7L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 41.0d + "'", double3 == 41.0d);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(7.0d, (double) 26, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-11104###", (double) 205L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 205.0d + "'", double2 == 205.0d);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.Class<?> wildcardClass12 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 104.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 242, (long) 4);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 242L + "'", long3 == 242L);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4aaa4aaa ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS10.16a0.0a52.0a52.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4', (int) '#', (int) (short) 10);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0a10.0a10.0" + "'", str10, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0a10.0a10.0" + "'", str12, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0a10.0a10.0" + "'", str18, "100.0a10.0a10.0");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 136, (long) 12, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 136L + "'", long3 == 136L);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-1#10#-1" + "'", str35, "-1#10#-1");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1#10#-1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 104, 15);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 38, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 38");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, (long) 206, (long) 62);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 230, 52);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 104 + "'", int23 == 104);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        short[] shortArray5 = new short[] { (byte) -1, (short) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) 'a', 230);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1, 10, 0, -1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#-1#10#0#-1" + "'", str7, "-1#-1#10#0#-1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 -1 10 0 -1" + "'", str11, "-1 -1 10 0 -1");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts4/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts444/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts", (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 7, (float) 136L, (float) 13);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 7.0f + "'", float3 == 7.0f);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0 220.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XJJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XaJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XvJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XaJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS X(J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XTJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XMJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS X)J4 Vi4u4 M4in4 S4ifi4i4nM4 OS X J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XSJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XEJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS X J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XRJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XuJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XnJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XtJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XiJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XmJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XeJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS X J4 Vi4u4 M4in4 S4ifi4i4nM4 OS XEJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XnJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XvJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XiJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XrJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XoJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XnJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XmJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XeJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XnJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS XtJ4 Vi4u4 M4in4 S4ifi4i4nM4 OS X");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 41, (byte) 100, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 TnemnorivnEemitnuRES)MT(avaJ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaclATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPSO:.Vg;", (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("32.0a10.0a97.0a104.0a10.0#32.0a10.0a97.0a104.0a10.0#32.0a10.0a97.0a104.0a10.0#32.0a10.0a97.0a104.0a10.0#32.0a10.0a97.0a104.0a10.0-32.0a10.0a97.0a104.0a10.0132.0a10.0a97.0a104.0a10.0.32.0a10.0a97.0a104.0a10.0032.0a10.0a97.0a104.0a1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1, 17, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("Jaavaa aVairtual");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("irtu l M chine Specific tion");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: irtu l M chine Specific tion is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(1L, 205L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 205L + "'", long3 == 205L);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("# a 44 a 4 a  4 a 4 a", 10.16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.16d + "'", double2 == 10.16d);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 1" + "'", str5, "0 1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0#1" + "'", str7, "0#1");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 41 + "'", byte3 == (byte) 41);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 41, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 41 + "'", byte3 == (byte) 41);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(3, 119, 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 119 + "'", int3 == 119);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(".lw2wt.m2cosx.CPri", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("         100.0a10.0a10.0", (double) 205);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 205.0d + "'", double2 == 205.0d);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 41, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 104 + "'", int22 == 104);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual 100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual 100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                       JvVirtulMchineSpecifiction", (double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1#-1#1#100#33#1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10.16");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 41, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 41 + "'", byte3 == (byte) 41);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        double[] doubleArray2 = new double[] { (short) -1, 104 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 1, 1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 6, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("j4 vi4u4 m4in4 s4ifi4i4nm4 os xjj4 vi4u4 m4in4 s4ifi4i4nm4 os xaj4 vi4u4 m4in4 s4ifi4i4nm4 os xvj4 vi4u4 m4in4 s4ifi4i4nm4 os xaj4 vi4u4 m4in4 s4ifi4i4nm4 os x(j4 vi4u4 m4in4 s4ifi4i4nm4 os xtj4 vi4u4 m4in4 s4ifi4i4nm4 os xmj4 vi4u4 m4in4 s4ifi4i4nm4 os x)j4 vi4u4 m4in4 s4ifi4i4nm4 os x j4 vi4u4 m4in4 s4ifi4i4nm4 os xsj4 vi4u4 m4in4 s4ifi4i4nm4 os xej4 vi4u4 m4in4 s4ifi4i4nm4 os x j4 vi4u4 m4in4 s4ifi4i4nm4 os xrj4 vi4u4 m4in4 s4ifi4i4nm4 os xuj4 vi4u4 m4in4 s4ifi4i4nm4 os xnj4 vi4u4 m4in4 s4ifi4i4nm4 os xtj4 vi4u4 m4in4 s4ifi4i4nm4 os xij4 vi4u4 m4in4 s4ifi4i4nm4 os xmj4 vi4u4 m4in4 s4ifi4i4nm4 os xej4 vi4u4 m4in4 s4ifi4i4nm4 os x j4 vi4u4 m4in4 s4ifi4i4nm4 os xej4 vi4u4 m4in4 s4ifi4i4nm4 os xnj4 vi4u4 m4in4 s4ifi4i4nm4 os xvj4 vi4u4 m4in4 s4ifi4i4nm4 os xij4 vi4u4 m4in4 s4ifi4i4nm4 os xrj4 vi4u4 m4in4 s4ifi4i4nm4 os xoj4 vi4u4 m4in4 s4ifi4i4nm4 os xnj4 vi4u4 m4in4 s4ifi4i4nm4 os xmj4 vi4u4 m4in4 s4ifi4i4nm4 os xej4 vi4u4 m4in4 s4ifi4i4nm4 os xnj4 vi4u4 m4in4 s4ifi4i4nm4 os xtj4 vi4u4 m4in4 s4ifi4i4nm4 os x");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaa-1#10#-1 aaaaaaaaaasanjitkumar", 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "-1 1 104 10 -1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1 1 104 10 -1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.0");
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
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) (byte) 10, 4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str14, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 104.0d + "'", double16 == 104.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 104.0d + "'", double17 == 104.0d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) (byte) 10, 4);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 104.0d + "'", double11 == 104.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-14104-1", 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("Jaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual...JJaavaa aVairtual");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 1, (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 1, (short) 41);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 23, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 0, 41);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        double[] doubleArray5 = new double[] { (short) -1, '#', 0L, 52.0f, 52.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', (-11104), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -11104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 35.0, 0.0, 52.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0 35.0 0.0 52.0 52.0" + "'", str8, "-1.0 35.0 0.0 52.0 52.0");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("          -1.0a35.0a0.0a52.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"          -1.0a35.0a0.0a52.0a52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(6, 17, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("TnemnorivnEemitnuRES)MT(avaJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("####-1.0#4a44####");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###-1.0#4a44####\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("...", (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 104, 23);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', 18, (int) (byte) 10);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 119, 0);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 1 0 0 10" + "'", str9, "1 1 0 0 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1a1a0a0a10" + "'", str25, "1a1a0a0a10");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        double[] doubleArray6 = new double[] { 1.8f, 246L, 2, 1.7999999523162842d, Double.POSITIVE_INFINITY, (byte) 0 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.7999999523162842, 246.0, 2.0, 1.7999999523162842, Infinity, 0.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 9, 6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 0, 100, -1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a1a1a0a100a-1" + "'", str12, "100a1a1a0a100a-1");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a1a1a0a100a-1" + "'", str15, "100a1a1a0a100a-1");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(43684, 200, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43684 + "'", int3 == 43684);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a8-FTUaaaaaaaaaaaPLATFORMaaaaaaaaaaAPIaaaaaaaaaaSPECIFICATION");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 71, (long) 4, 12L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 71L + "'", long3 == 71L);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 431, 206);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0#10.0#10.0" + "'", str10, "100.0#10.0#10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 104 + "'", int22 == 104);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Java Platform API SpecificationJava Platform API SpecificationJava Platform API SpecificationJava P:RTUALMACHINESPECIFICATIONJAVAVIRTUAL AAA AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Java Platform API SpecificationJava Platform API SpecificationJava Platform API SpecificationJava P:RTUALMACHINESPECIFICATIONJAVAVIRTUAL AAA AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("tnemN", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(3293, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3293 + "'", int3 == 3293);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 1 104 10 -1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.04104.0-1.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...J...J...J...J...J...J...J...J...", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkum...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: /Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkum...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("..J");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 6, (double) 90, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(" 4  4   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("/Library/Java/JavaVirtualMachines/jdk4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  .8.4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  _4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  84 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  4 a 4 a  .jdk/Contents/Home/jre");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                         MIXED MODE                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1#10#-1" + "'", str12, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 96, (float) 135, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (float) 8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) -1, (long) 5, 136L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 41, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "HTTP://JAVA.ORACLE.COM/");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HTTP://JAVA.ORACLE.COM/");
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
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("sanjitkumar");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(3293, 6, 205);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3293 + "'", int3 == 3293);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1A10A-4444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1A10A-4444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...                    ...", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(100L, (long) 'a', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 9, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("U8Fiu8 in8 ifiin 8  8X-U8Fiu8 in8 ifiin 8  8X1U8Fiu8 in8 ifiin 8  8X4U8Fiu8 in8 ifiin 8  8X1U8Fiu8 in8 ifiin 8  8X0U8Fiu8 in8 ifiin 8  8X4U8Fiu8 in8 ifiin 8  8X-U8Fiu8 in8 ifiin 8  8X1U8Fiu8 in8 ifiin 8  8X");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"U8Fiu8 in8 ifiin 8  8X-U8Fiu8 in8 ifiin 8  8X1U8Fiu8 in8 ifiin 8  8X4U8Fiu8 in8 ifiin 8  8X1U8Fiu8 in8 ifiin 8  8X0U8Fiu8 in8 ifiin 8  8X4U8Fiu8 in8 ifiin 8  8X-U8Fiu8 in8 ifiin 8  8X1U8Fiu8 in8 ifiin 8  8X\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1.0f), 0.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("32.0 10.0 97.0 104.0 10.0ava32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.032.0 10.0 97.0 104.0 10.0atf32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.0API32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.0S32.0 10.0 97.0 104.0 10.0pecifica");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkumar/personal_p1.3/Users/sanjitkum...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J...J", (long) 25);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 25L + "'", long2 == 25L);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 13, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(".:ava", (short) 41);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 41 + "'", short2 == (short) 41);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str14, "32.0a10.0a97.0a104.0a10.0");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 58, (int) (byte) 10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) (byte) -1, 58);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 104 + "'", int14 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1 1 104 10 4" + "'", str21, "-1 1 104 10 4");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("..J");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 119, (int) (byte) -1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 33.0f, (double) 208, (double) 33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 208.0d + "'", double3 == 208.0d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1 4 a 4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 4 a 4 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(" 4 a 4 a  ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) '4', (int) (short) 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 0, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(90, 52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1791, 35, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 41, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 97, (float) 34L, (float) 87);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 34.0f + "'", float3 == 34.0f);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("JAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPE####-1.0# a 4####JAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPECIFICATIONJAVA PLATFORM API SPEC");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("32.0 10.0 97.0 104.0 10.0ava32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.032.0 10.0 97.0 104.0 10.0atf32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.0API32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.0S32.0 10.0 97.0 104.0 10.0pecifica");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) (short) -1, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0 10.0 10.0" + "'", str11, "100.0 10.0 10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0a10.0a10.0" + "'", str13, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0410.0410.0" + "'", str15, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0", (float) 242);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041041");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1a1a104a10a4" + "'", str21, "-1a1a104a10a4");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("LAUTRIVAVAJNOITACIFICEPSENIHCAMLAUTRIVAVAJAAA4AAA4LAUTRIVAVAJNOITACIFICEPSENIHCAMLAUTRIVAVAJ", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        float[] floatArray5 = new float[] { 100L, (-1.0f), (byte) -1, (-1.0f), 100.0f };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 9, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#', (int) 'a', 2);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[100.0, -1.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.04-1.04-1.04-1.04100.0" + "'", str17, "100.04-1.04-1.04-1.04100.0");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444-1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 7, (int) (short) 1);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0#1" + "'", str8, "0#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(62.0f, (float) 52, (float) 3269);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3269.0f + "'", float3 == 3269.0f);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 25, 2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 10 10 100 1 100" + "'", str11, "10 10 10 100 1 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10#10#10#100#1#100" + "'", str17, "10#10#10#100#1#100");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a# 4#a#4#a#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 97, 35);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 71, 5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str9, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(5.0f, (float) 6, (float) 200);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 200.0f + "'", float3 == 200.0f);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 220.0f, 0.0d, (double) 62L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"         \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("UTF-8", (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 100, (int) '4', 1791);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 9, 6);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 0, 100, -1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a1a1a0a100a-1" + "'", str13, "100a1a1a0a100a-1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 97, (double) 38, 10.16d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
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
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (byte) 0);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(28, 1, 198);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(5, 45, 3292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3292 + "'", int3 == 3292);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 5, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 246, 58);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1#10#-1" + "'", str11, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 246.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1a-1a1a100a33a10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("JAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL4AAA4AAAJAVAVIRTUALMACHINESPECIFICATIONJAVAVIRTUAL");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("Java Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine SpecificationJava Virtual Machine Specification", 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 431, 0L, (-1110410L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1110410L) + "'", long3 == (-1110410L));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                LATFORM API SPECIFICATIONusususu", (byte) 41);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 41 + "'", byte2 == (byte) 41);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(198, 28, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 41, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("/USERS/SANJITKUMAR/LIBRARY/JAVA/EXTENSIONS:/LIBRARY/JAVA/JAVAVIRTUALMACHINES/JDK1.8.0_181.JDK/CONTENTS/HOME/JRE/LIB/EXT:/LIBRARY/JAVA/EXTENSIONS:/NETWORK/LIBRARY/JAVA/EXTENSIONS:/SYSTEM/LIBRARY/JAVA/EXTENSIONS:/USR/LIB/JAVA", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 1" + "'", str17, "0 1");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("############################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"############################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 47, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 47");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(26.0f, (float) 223L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) (short) -1, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.Class<?> wildcardClass19 = floatArray3.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0 10.0 10.0" + "'", str11, "100.0 10.0 10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0a10.0a10.0" + "'", str13, "100.0a10.0a10.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0410.0410.0" + "'", str15, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0a10.0a10.0" + "'", str18, "100.0a10.0a10.0");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.Class<?> wildcardClass8 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("ava Virtual Machine Specification/Users/sanjitkuma");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ava Virtual Machine Specification/Users/sanjitkuma\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 220, (int) (byte) 10);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 34, 0);
        int int24 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int25 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 104 + "'", int24 == 104);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '4', (long) 65, (long) 205);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 205L + "'", long3 == 205L);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 41, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" OS X4nM4i4ifi4 S4in4 M4u4 Vi4J");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" OS X4nM4i4ifi4 S4in4 M4u4 Vi4J\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4aaa4aaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" #a# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  #a#  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("osx4nm4i4ifi4s4in4m4u4vi4j", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0111-401");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', 34, 3269);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0#1" + "'", str14, "0#1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("         100.0a10.0a10.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 97, 0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("US 4 a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (short) 10, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 15, (int) (byte) -1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 26, 15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14104-1" + "'", str8, "-14104-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) ' ', (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 2, (int) (short) 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32.0#10.0#97.0#104.0#10.0" + "'", str19, "32.0#10.0#97.0#104.0#10.0");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100.0f, (double) 104.0f, (double) 71);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 71.0d + "'", double3 == 71.0d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0a104.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0a104.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaJ4 V-1 100");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1a-1a10a0a-1", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1#1#0#0#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#1#0#0#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 1, (long) 15, (long) 104);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 41, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 18, 0);
        java.lang.Class<?> wildcardClass23 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1 58 62 2 -1 12");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 58 62 2 -1 12\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 71L, (double) 205.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 205.0d + "'", double3 == 205.0d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("mixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemixedmodemi/uSERS/SANJITKUMAR/PERSONAL_PROJECTS/cOLLEGEiLLINOIS/sOFTWAREeNGINEERINGpRINCIPLES/MILESTONE3/M3_SCRIPTS");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1#1#104#10#4" + "'", str23, "-1#1#104#10#4");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-141410441044" + "'", str25, "-141410441044");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1A10A-4444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1A10A-4444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-110-1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(205.0d, (double) (short) 41, (double) 34);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 205.0d + "'", double3 == 205.0d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 71, (float) 35L, 8.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 8.0f + "'", float3 == 8.0f);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, 0);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 104, (long) 1696, (long) (-11104));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-11104L) + "'", long3 == (-11104L));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 13, (float) 1791L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1791.0f + "'", float3 == 1791.0f);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("       -1.0#220.0", 13L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13L + "'", long2 == 13L);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1#1#104#10#4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0a0a100a10a100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0a100a10a100a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(8.0f, (float) 242, (float) 246L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 8.0f + "'", float3 == 8.0f);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-14-1410404-1##");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa1a1a104a10a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa1a1a104a10a4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" -14-1410404-1 ", (byte) 41);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 41 + "'", byte2 == (byte) 41);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 12, (long) (byte) 0, 8L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1#.#8#.#0#_#181#-#b#13");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#.#8#.#0#_#181#-#b#13\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 23L, 9.0d, (double) 5.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (byte) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.Class<?> wildcardClass12 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "041" + "'", str11, "041");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-11104###");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11104###\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(3293, 0, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3293 + "'", int3 == 3293);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 9, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1 10 -1" + "'", str20, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-14104-1" + "'", str22, "-14104-1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-14104-1" + "'", str28, "-14104-1");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(3292.0d, (double) 31, (double) (byte) 41);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 31.0d + "'", double3 == 31.0d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44444444444444444444444");
        org.junit.Assert.assertNotNull(number1);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (short) 1, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 5, 135);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 1" + "'", str9, "0 1");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a', 3292, 26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a', (int) (byte) 1, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1, 87, 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 71, 71);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-14104-1" + "'", str15, "-14104-1");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        double[] doubleArray6 = new double[] { 1.0f, 52.0f, 220.0f, 4, (byte) 10, 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 6, 6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 8, (int) (short) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', (int) (short) 100, (int) (short) 0);
        double double21 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 52.0, 220.0, 4.0, 10.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0452.04220.044.0410.040.0" + "'", str16, "1.0452.04220.044.0410.040.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 220.0d + "'", double21 == 220.0d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.4");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4f + "'", float1 == 1.4f);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100.0a10.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        int[] intArray4 = new int[] { 431, 1, 54, (short) 100 };
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[431, 1, 54, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 115, (long) 246, (long) 26);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 246L + "'", long3 == 246L);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) '#', 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 58, 1791);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 58");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Java(TM)SERuntimeEnvironment#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Java(TM)SERuntimeEnvironment#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa4#aaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#a44a4a4a4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("/uSERS/SANJITKUMAR");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/uSERS/SANJITKUMAR\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1 1 104 10 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 1 104 10 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1#10#-1" + "'", str8, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 10 -1" + "'", str12, "-1 10 -1");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a #4 a 4  a 4 a 4  a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 41 + "'", byte3 == (byte) 41);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 41, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 119, 8L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(" 1 104 10 4", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (byte) 100, 41);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("32.0 10.0 97.0 104.0 10.0#32.0 10.0 97.0 104.0 10.0#32.0 10.0 97.0 104.0 10.0#32.0 10.0 97.0 104.0 10.0#32.0 10.0 97.0 104.0 10.0-32.0 10.0 97.0 104.0 10.0132.0 10.0 97.0 104.0 10.0.32.0 10.0 97.0 104.0 10.0032.0 10.0 97.0 104.0 10.0#32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.0 32.0 10.0 97.0 104.0 10.0432.0 10.0 97.0 104.0 10.0#32.0 10.0 97.0 104.0 10.0#32.0 10.0 97.0 104.0 10.0#32.0 10.0 97.0 104.0 10.0#32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 35L, (float) (byte) 0, (float) 242L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 242.0f + "'", float3 == 242.0f);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("SUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"SUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB8-FTUSUN.LW2WT.M2COSX.CPRINTERJOB/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.Java Virtual Machine Specification1.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.71.21.41.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 75, (long) 200, (long) 250);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 75L + "'", long3 == 75L);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaa-1#10#-1aaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 0, 1696);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual", (float) 34L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 4, 220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) '4', (int) (byte) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a-1" + "'", str11, "-1a10a-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 10 -1" + "'", str13, "-1 10 -1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("8-FTU");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        short[] shortArray5 = new short[] { (byte) -1, (short) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1, 10, 0, -1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#-1#10#0#-1" + "'", str7, "-1#-1#10#0#-1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 -1 10 0 -1" + "'", str11, "-1 -1 10 0 -1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1a-1a10a0a-1" + "'", str13, "-1a-1a10a0a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-14-1410404-1" + "'", str15, "-14-1410404-1");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" 1.8.0_181", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1.0f), (double) 3292.0f, (double) 24L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3292.0d + "'", double3 == 3292.0d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("rSequence;cl uS 4 a  rSequence;cl ", (float) 93);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 93.0f + "'", float2 == 93.0f);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 41, (long) 3269, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3269L + "'", long3 == 3269L);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0a10.0a10.0" + "'", str10, "100.0a10.0a10.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        float[] floatArray1 = new float[] { (-1.0f) };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', (int) (byte) 100, (int) (short) 0);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', (-11104), 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -11104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0" + "'", str3, "-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("   hi...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(9, 3869, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3869 + "'", int3 == 3869);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', 21, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a1a0a0a10" + "'", str10, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1a1a0a0a10" + "'", str13, "1a1a0a0a10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("3b-8_ 8 ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, 1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 4, 4);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(24, 205, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 205 + "'", int3 == 205);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 41, (short) (byte) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        double[] doubleArray5 = new double[] { (short) -1, '#', 0L, 52.0f, 52.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 35.0, 0.0, 52.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0 35.0 0.0 52.0 52.0" + "'", str8, "-1.0 35.0 0.0 52.0 52.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 35.0 0.0 52.0 52.0" + "'", str11, "-1.0 35.0 0.0 52.0 52.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 52, 0.0d, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("atform API Speci", 230);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 230 + "'", int2 == 230);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        short[] shortArray5 = new short[] { (byte) -1, (short) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1, 10, 0, -1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#-1#10#0#-1" + "'", str7, "-1#-1#10#0#-1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 1, (long) 104, (long) 18);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 104L + "'", long3 == 104L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 41, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3293, 3869, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("X 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 a 4 a  4aaa4aaa 4 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) '#', 3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (short) 10, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 33, (int) (byte) 41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 54, (long) 208, (long) 93);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 54L + "'", long3 == 54L);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 223, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', 0, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 1 0 0 10" + "'", str14, "1 1 0 0 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1414040410" + "'", str16, "1414040410");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                100.0a10.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0a10.0a10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 54, (long) (byte) 100, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("Java Virtual Machine SpecificationMac OS X          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Java Virtual Machine SpecificationMac OS X\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        long long34 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0#0#100#10#100#1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaa aaa  tnemnorivnEscihparGC.twa.nus /moc.elcaro.avaj//:ptth Java(TM)SERuntimeEnvironment /moc.elcaro.avaj//:ptth aaa aa", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...J");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("        4aaa4aa        ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a1a0a0a10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(21, 25, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 23.0f, (double) (-11104), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23.0d + "'", double3 == 23.0d);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 431, (double) 1.8f, (double) 54L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7999999523162842d + "'", double3 == 1.7999999523162842d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        float[] floatArray5 = new float[] { 100L, (-1.0f), (byte) -1, (-1.0f), 100.0f };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 9, 0);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 97, 45);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[100.0, -1.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0a-1.0a-1.0a-1.0a100.0" + "'", str12, "100.0a-1.0a-1.0a-1.0a100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0#1" + "'", str14, "0#1");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 7.0f, 0.0d, (double) 13);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(17, 135, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("J4 Vi4u4 ", (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1a-1a10a0a-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a-1a10a0a-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 220, 23);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-14104-1" + "'", str6, "-14104-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1a10a-1" + "'", str12, "-1a10a-1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaclATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPChA:SPqAPVcP;clATT [LAAvAPlAVgPSO:.Vg;", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 246L, (float) 543, (float) 54);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 543.0f + "'", float3 == 543.0f);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a8-FTUa", (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.0410.0" + "'", str7, "100.0410.0410.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 246, 43684L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 43684L + "'", long3 == 43684L);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        double[] doubleArray5 = new double[] { (short) -1, '#', 0L, 52.0f, 52.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 35.0, 0.0, 52.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("jVvIRTUL\nNEsPECIFICTION");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', (int) (short) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10, 208.0d, (double) 2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1, 100, 33, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 220, 3292);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 220");
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
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 32L, 0.0f, (float) 220);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 18, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 3293, 75);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 208, (int) (byte) 1);
        long long24 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#10#-1" + "'", str10, "-1#10#-1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("Sun.lw2wt.m2cosx.CPrinterJob8-FTUsun.lw2wt.m2cosx.CPrin...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("xed modxed modxed ######################Java(TM) SE Runtime Environment1.8.0_1811.8.0_1811.8#######################   xed modxed modxed -1 -1 1 100 33 10-1 -1 1 100 33 10-1 -1 1 100 33 10-1 -1 1 100 33 10-");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("00.040.040.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 34L, (double) 135, (double) 24L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 135.0d + "'", double3 == 135.0d);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "#4a44");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #4a44");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 41);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 41, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 41 + "'", short3 == (short) 41);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 208, 4.4444444E22f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.4444444E22f + "'", float3 == 4.4444444E22f);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("SUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB44FTUSUN4LW4WT4M4COSX4CPRINTERJOB", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("c", (double) 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 75.0d + "'", double2 == 75.0d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("TIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUSJ#V# PL#TFORM API SPECITIKLOOTCWL.XSOCAM.TWAWL.NUS", 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0 220.0aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaaaaaa########################aaaaa                                           /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib                                             /Lib:/Lib");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0 220.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("             -1#10#-1              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("########################aaaaaaaaa                                                                                                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"########################aaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa4aAa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        long[] longArray6 = new long[] { 1L, 58L, 62, 2, (-1L), 12 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 119, 65);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 58, 62, 2, -1, 12]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 58 62 2 -1 12" + "'", str8, "1 58 62 2 -1 12");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 62L + "'", long13 == 62L);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("####################################################", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 41, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0a10.0a10.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "#a44a4a4a4a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #a44a4a4a4a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a10a10a100a1a100" + "'", str12, "10a10a10a100a1a100");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (short) 10, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 135, 75);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jr");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0a0a100a10a100a14444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 58L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58L + "'", long2 == 58L);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 12, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1" + "'", str6, "0#1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Library/Java/JavaVirtualMachines/jdk.8._8.jdk/Contents/Home/jreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (float) 115);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 115.0f + "'", float2 == 115.0f);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("J#Vi#u#M#in#S#ifi#i#nM#OS XJ#Vi#u#M#in#S#4a44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"J#Vi#u#M#in#S#ifi#i#nM#OS XJ#Vi#u#M#in#S#4a44\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0", 23L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...cificationJa...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...cifica\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual4JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualaJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual#JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(24, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) '#', 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "#4A44");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #4A44");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 246, (double) 93, (double) 7.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.0d + "'", double3 == 7.0d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/endorsed", (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                  ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 41, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.444444444444444E135d + "'", double1 == 4.444444444444444E135d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("JavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtual", (-11104L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11104L) + "'", long2 == (-11104L));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 34, 0);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str10, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 104.0d + "'", double13 == 104.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 104.0d + "'", double19 == 104.0d);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3869, (long) 200, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("v Virtul Mchine Specifiction/Users/snjitkum");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        long[] longArray3 = new long[] { (byte) -1, (short) 10, (-1L) };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) (short) 100, 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 10 -1" + "'", str12, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 10 -1" + "'", str14, "-1 10 -1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1 10 -1" + "'", str16, "-1 10 -1");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444414.46", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("SUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB##FTUSUN#LW#WT#M#COSX#CPRINTERJOB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 25L, (double) (-1110410.0f), (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1110410.0d) + "'", double3 == (-1110410.0d));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10#10#10#100#1#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#10#10#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.7000000476837158d, 18.0d, 23.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23.0d + "'", double3 == 23.0d);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("Jv Virtul Mchine SpecifictionJv Virtul44Jv Virtul Mchine SpecifictionJv Virtul");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("J Viu M");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#A#4#31b-181_0.8.1sun.lwawt.macosx.LWCToolkit");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        float[] floatArray3 = new float[] { (byte) 100, 10.0f, 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', (int) '4', (int) (short) 1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4', 543, 120);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.0410.0" + "'", str5, "100.0410.0410.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0a10.0a10.0" + "'", str12, "100.0a10.0a10.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 3, 100);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 104 + "'", int17 == 104);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 26, 3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str8, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.0d + "'", double7 == 104.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32.0 10.0 97.0 104.0 10.0" + "'", str9, "32.0 10.0 97.0 104.0 10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str11, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "0A1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0A1");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0#1" + "'", str12, "0#1");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaa aaa  tnemnorivnEscihparGC.twa.nus /moc.elcaro.avaj//:ptth Java(TM)SERuntimeEnvironment /moc.elcaro.avaj//:ptth aaa aaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("TnemnorivnEemitnuRES)MT(avaTnemnorivnEemitnuRES)MT(ava", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        short[] shortArray2 = new short[] { (short) -1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 23, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 90, 115);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 90");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a100" + "'", str8, "-1a100");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("ficationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJavaVirtualJavaVirtualMachineSpecificationJavaVirtual4aaa4aaaJavaVirtualMachineSpecificationJava");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        int[] intArray5 = new int[] { (-1), (short) 1, 104, 10, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '4', (int) (short) 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 104, 10, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 1 104 10 4" + "'", str7, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 104 + "'", int15 == 104);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 1 104 10 4" + "'", str17, "-1 1 104 10 4");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1 1 104 10 4" + "'", str20, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1 1 104 10 4" + "'", str22, "-1 1 104 10 4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1#1#104#10#4" + "'", str24, "-1#1#104#10#4");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        double[] doubleArray5 = new double[] { ' ', 10.0f, 'a', 104, 10L };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) ' ', (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 2, (int) (short) 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 97.0, 104.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 104.0d + "'", double6 == 104.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32.0a10.0a97.0a104.0a10.0" + "'", str12, "32.0a10.0a97.0a104.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32.0#10.0#97.0#104.0#10.0" + "'", str19, "32.0#10.0#97.0#104.0#10.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "32.0410.0497.04104.0410.0" + "'", str21, "32.0410.0497.04104.0410.0");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("UUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("AAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAA AAAAAAA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(104L, (long) 90, (long) 12);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 104L + "'", long3 == 104L);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 135);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 135L + "'", long2 == 135L);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (-1.0f), (double) 220);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 220.0d + "'", double3 == 220.0d);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        short[] shortArray5 = new short[] { (short) 1, (byte) 1, (byte) 0, (short) 0, (short) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', (int) (short) 41, 24);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a1a0a0a10" + "'", str7, "1a1a0a0a10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1414040410" + "'", str10, "1414040410");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("rSequence;cl ss [Lj v el ngeString;cl ss [Lj v el ngeCh rSequence;cl ss [Lj v el ngeCh rSequen...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: rSequence;cl ss [Lj v el ngeString;cl ss [Lj v el ngeCh rSequence;cl ss [Lj v el ngeCh rSequen... is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("OS X4nM4i4ifi4 S4in4 M4u4 Vi4J");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"OS X4nM4i4ifi4 S4in4 M4u4 Vi4J\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu                  100.0a10.0a10. PLATFORM API SPECIFICATIONususususususususususususu\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }
}

