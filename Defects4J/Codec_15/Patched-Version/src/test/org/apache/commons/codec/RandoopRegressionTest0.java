package org.apache.commons.codec.binary;

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
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32InputStream base32InputStream16 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, true, (int) '#', byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain Base32 characters: [_wEA_wo]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u01ff\uff00\ufffd" + "'", str14, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[95, 119, 69, 65, 95, 119, 111]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            base32InputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = baseNCodecInputStream3.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = base32InputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = baseNCodecInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2, true);
        byte[] byteArray7 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray7);
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32(1, byteArray7, true);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) base32InputStream2, (org.apache.commons.codec.binary.BaseNCodec) base32_10, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\u01ff\uff00\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            base32_10.encode(byteArray14, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, -1, -1, 0, -1, -3]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2, true);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = base32InputStream4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream5.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = base32InputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        boolean boolean7 = base64_3.isInAlphabet((byte) 1);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = base64_3.decode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2, true);
        // The following exception was thrown during execution in test generation
        try {
            base32InputStream2.mark((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = base32InputStream1.skip((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative skip length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        byte[] byteArray7 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = base64_3.encode((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte byte4 = base64_2.PAD;
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_2.buffer = byteArray6;
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(1, byteArray11, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray11, true);
        boolean boolean18 = base64_2.isInAlphabet(byteArray11, false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str25 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray24);
        int int28 = base64_2.readResults(byteArray24, 0, 64);
        java.io.InputStream inputStream29 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream30 = new org.apache.commons.codec.binary.Base32InputStream(inputStream29);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream31 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream30);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream33 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream31, true);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray35);
        int int37 = base32InputStream33.read(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = base64_2.encode((java.lang.Object) base32InputStream33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 61 + "'", byte4 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u01ff\uff00\ufffd" + "'", str25, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream13 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream11, true);
        byte[] byteArray17 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("org.apache.commons.codec.DecoderException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream13, true, (int) 'a', byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain base64 characters: [o?r?g?.?a?p?a?c?h?e?.?c?o?m?m?o?n?s?.?c?o?d?e?c?.?D?e?c?o?d?e?r?E?x?c?e?p?t?i?o?n?:? ?]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[111, 0, 114, 0, 103, 0, 46, 0, 97, 0, 112, 0, 97, 0, 99, 0, 104, 0, 101, 0, 46, 0, 99, 0, 111, 0, 109, 0, 109, 0, 111, 0, 110, 0, 115, 0, 46, 0, 99, 0, 111, 0, 100, 0, 101, 0, 99, 0, 46, 0, 68, 0, 101, 0, 99, 0, 111, 0, 100, 0, 101, 0, 114, 0, 69, 0, 120, 0, 99, 0, 101, 0, 112, 0, 116, 0, 105, 0, 111, 0, 110, 0, 58, 0, 32, 0]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2, true);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        int int8 = base32InputStream4.read(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = base32InputStream4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream10 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, false);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        byte[] byteArray16 = base64_15.buffer;
        byte byte17 = base64_15.PAD;
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_15.buffer = byteArray19;
        byte[] byteArray24 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray24);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(1, byteArray24, true);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray24, true);
        boolean boolean31 = base64_15.isInAlphabet(byteArray24, false);
        int int32 = base64_15.available();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec34 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream36 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream33, baseNCodec34, true);
        boolean boolean37 = baseNCodecInputStream36.markSupported();
        byte[] byteArray40 = new byte[] {};
        java.lang.String str41 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray40);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream42 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream36, false, (int) 'a', byteArray40);
        byte[] byteArray43 = base64_15.encode(byteArray40);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, false);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream47 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream10, false, 0, byteArray46);
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str55 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray54);
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray54);
        org.apache.commons.codec.binary.Base32 base32_57 = new org.apache.commons.codec.binary.Base32(10, byteArray54);
        byte[] byteArray59 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray60 = base32_57.encode(byteArray59);
        // The following exception was thrown during execution in test generation
        try {
            base32OutputStream10.write(byteArray59, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 61 + "'", byte17 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u01ff\uff00\ufffd" + "'", str55, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.codec.binary.Base32 base32_0 = new org.apache.commons.codec.binary.Base32();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream(inputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2);
        boolean boolean4 = base32InputStream2.markSupported();
        byte[] byteArray8 = null;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(10, byteArray8, true);
        byte[] byteArray12 = base64_10.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream2, false, 0, byteArray12);
        base32_0.buffer = byteArray12;
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = base32_0.encode(obj15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = base32InputStream1.skip((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        boolean boolean7 = base64_3.isInAlphabet((byte) 1);
        boolean boolean9 = base64_3.isInAlphabet("");
        boolean boolean10 = base64_3.isUrlSafe();
        byte byte11 = base64_3.PAD;
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 61 + "'", byte11 == (byte) 61);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32(10, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray20 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray21 = base64_18.encode(byteArray20);
        base32_16.encode(byteArray21, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream25 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream4, false, 0, byteArray21);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u01ff\uff00\ufffd" + "'", str14, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            base32InputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte byte4 = base64_2.PAD;
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_2.buffer = byteArray6;
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(1, byteArray11, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray11, true);
        boolean boolean18 = base64_2.isInAlphabet(byteArray11, false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str25 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray24);
        int int28 = base64_2.readResults(byteArray24, 0, 64);
        boolean boolean30 = base64_2.isInAlphabet((byte) 61);
        org.apache.commons.codec.binary.Base32 base32_31 = new org.apache.commons.codec.binary.Base32();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream33 = new org.apache.commons.codec.binary.Base32InputStream(inputStream32);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream34 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream33);
        boolean boolean35 = base32InputStream33.markSupported();
        byte[] byteArray39 = null;
        org.apache.commons.codec.binary.Base64 base64_41 = new org.apache.commons.codec.binary.Base64(10, byteArray39, true);
        byte[] byteArray43 = base64_41.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream33, false, 0, byteArray43);
        base32_31.buffer = byteArray43;
        base64_2.encode(byteArray43, 64, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 61 + "'", byte4 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u01ff\uff00\ufffd" + "'", str25, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        boolean boolean3 = base32InputStream1.markSupported();
        byte[] byteArray7 = null;
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(10, byteArray7, true);
        byte[] byteArray11 = base64_9.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream1, false, 0, byteArray11);
        java.lang.String str13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec3 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream2, baseNCodec3, true);
        boolean boolean6 = baseNCodecInputStream5.markSupported();
        byte[] byteArray9 = new byte[] {};
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, false, (int) 'a', byteArray9);
        base64_1.buffer = byteArray9;
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        boolean boolean17 = base64_1.isInAlphabet(byteArray14, false);
        byte[] byteArray19 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray19);
        byte[] byteArray21 = base64_20.buffer;
        byte byte22 = base64_20.PAD;
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_20.buffer = byteArray24;
        byte[] byteArray29 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray29);
        org.apache.commons.codec.binary.Base32 base32_32 = new org.apache.commons.codec.binary.Base32(1, byteArray29, true);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray29, true);
        boolean boolean36 = base64_20.isInAlphabet(byteArray29, false);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str43 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray42);
        int int46 = base64_20.readResults(byteArray42, 0, 64);
        byte[] byteArray48 = null;
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64(10, byteArray48, true);
        byte[] byteArray52 = base64_50.decode("\r\n");
        byte[] byteArray53 = base64_20.decode(byteArray52);
        byte[] byteArray55 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\r\n");
        java.lang.String str56 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray55);
        base64_20.decode(byteArray55, (int) (short) 0, (int) (short) -1);
        boolean boolean61 = base64_1.isInAlphabet(byteArray55, false);
        base64_1.eof = false;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 61 + "'", byte22 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u01ff\uff00\ufffd" + "'", str43, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 13, 0, 10]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u0d00\u0a00" + "'", str56, "\u0d00\u0a00");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream11 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32(10, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray20 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray21 = base64_18.encode(byteArray20);
        base32_16.encode(byteArray21, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream25 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream4, false, 0, byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            base32InputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u01ff\uff00\ufffd" + "'", str14, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte byte4 = base64_2.PAD;
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_2.buffer = byteArray6;
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(1, byteArray11, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray11, true);
        boolean boolean18 = base64_2.isInAlphabet(byteArray11, false);
        int int19 = base64_2.available();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec21 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream23 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream20, baseNCodec21, true);
        boolean boolean24 = baseNCodecInputStream23.markSupported();
        byte[] byteArray27 = new byte[] {};
        java.lang.String str28 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray27);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream29 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream23, false, (int) 'a', byteArray27);
        byte[] byteArray30 = base64_2.encode(byteArray27);
        base64_2.eof = false;
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 61 + "'", byte4 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec3 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream2, baseNCodec3, true);
        boolean boolean6 = baseNCodecInputStream5.markSupported();
        byte[] byteArray9 = new byte[] {};
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, false, (int) 'a', byteArray9);
        base64_1.buffer = byteArray9;
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("hi!");
        // The following exception was thrown during execution in test generation
        try {
            base64_1.decode(byteArray14, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 104, 0, 105, 0, 33]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        // The following exception was thrown during execution in test generation
        try {
            base32InputStream4.mark(76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        int int2 = base64_1.available();
        boolean boolean4 = base64_1.isInAlphabet("");
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray6);
        byte[] byteArray8 = base64_7.buffer;
        byte byte9 = base64_7.PAD;
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_7.buffer = byteArray11;
        byte[] byteArray16 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray16);
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32(1, byteArray16, true);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray16, true);
        boolean boolean23 = base64_7.isInAlphabet(byteArray16, false);
        int int24 = base64_7.available();
        java.io.InputStream inputStream25 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec26 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream28 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream25, baseNCodec26, true);
        boolean boolean29 = baseNCodecInputStream28.markSupported();
        byte[] byteArray32 = new byte[] {};
        java.lang.String str33 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray32);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream34 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream28, false, (int) 'a', byteArray32);
        byte[] byteArray35 = base64_7.encode(byteArray32);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray32, false, false);
        java.math.BigInteger bigInteger39 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = base64_1.encode((java.lang.Object) bigInteger39);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 61 + "'", byte9 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(bigInteger39);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        byte[] byteArray4 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4);
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(1, byteArray4, true);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = base32InputStream1.read(byteArray9, (-1), 8192);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = baseNCodecInputStream3.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        byte[] byteArray3 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3);
        org.apache.commons.codec.binary.Base32 base32_6 = new org.apache.commons.codec.binary.Base32(1, byteArray3, true);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray3, true);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream11, baseNCodec12, true);
        boolean boolean15 = baseNCodecInputStream14.markSupported();
        byte[] byteArray18 = new byte[] {};
        java.lang.String str19 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray18);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream20 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream14, false, (int) 'a', byteArray18);
        base64_10.buffer = byteArray18;
        byte[] byteArray23 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray23);
        boolean boolean26 = base64_10.isInAlphabet(byteArray23, false);
        byte[] byteArray29 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray29);
        org.apache.commons.codec.binary.Base32 base32_31 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray29);
        byte[] byteArray33 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray34 = base32_31.encode(byteArray33);
        byte[] byteArray36 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray36);
        byte[] byteArray38 = base64_37.buffer;
        byte byte39 = base64_37.PAD;
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_37.buffer = byteArray41;
        byte[] byteArray46 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_47 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray46);
        org.apache.commons.codec.binary.Base32 base32_49 = new org.apache.commons.codec.binary.Base32(1, byteArray46, true);
        org.apache.commons.codec.binary.Base64 base64_51 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray46, true);
        boolean boolean53 = base64_37.isInAlphabet(byteArray46, false);
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str60 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray59);
        int int63 = base64_37.readResults(byteArray59, 0, 64);
        byte[] byteArray64 = base32_31.decode(byteArray59);
        byte[] byteArray65 = base64_10.encode(byteArray64);
        base64_8.decode(byteArray65, 64, 0);
        java.lang.String str69 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray65);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 61 + "'", byte39 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u01ff\uff00\ufffd" + "'", str60, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32(10, byteArray6);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray13 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray14 = base64_11.encode(byteArray13);
        base32_9.encode(byteArray14, 0, (int) (byte) 0);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 61 };
        boolean boolean24 = org.apache.commons.codec.binary.Base64.isBase64(byteArray23);
        byte[] byteArray25 = base32_9.encode(byteArray23);
        base32_9.ensureBufferSize((int) (byte) 0);
        byte[] byteArray29 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        boolean boolean31 = base32_9.containsAlphabetOrPad(byteArray29);
        byte[] byteArray32 = new byte[] {};
        java.lang.String str33 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray32);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray32, true, false);
        byte[] byteArray37 = base32_9.decode(byteArray32);
        org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream40 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec41 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream43 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream40, baseNCodec41, true);
        boolean boolean44 = baseNCodecInputStream43.markSupported();
        byte[] byteArray47 = new byte[] {};
        java.lang.String str48 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray47);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream49 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream43, false, (int) 'a', byteArray47);
        base64_39.buffer = byteArray47;
        byte[] byteArray52 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray53 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray52);
        boolean boolean55 = base64_39.isInAlphabet(byteArray52, false);
        byte[] byteArray58 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_59 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray58);
        org.apache.commons.codec.binary.Base32 base32_60 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray58);
        byte[] byteArray62 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray63 = base32_60.encode(byteArray62);
        byte[] byteArray65 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_66 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray65);
        byte[] byteArray67 = base64_66.buffer;
        byte byte68 = base64_66.PAD;
        byte[] byteArray70 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_66.buffer = byteArray70;
        byte[] byteArray75 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_76 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray75);
        org.apache.commons.codec.binary.Base32 base32_78 = new org.apache.commons.codec.binary.Base32(1, byteArray75, true);
        org.apache.commons.codec.binary.Base64 base64_80 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray75, true);
        boolean boolean82 = base64_66.isInAlphabet(byteArray75, false);
        byte[] byteArray88 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str89 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray88);
        int int92 = base64_66.readResults(byteArray88, 0, 64);
        byte[] byteArray93 = base32_60.decode(byteArray88);
        byte[] byteArray94 = base64_39.encode(byteArray93);
        byte[] byteArray96 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray94, true);
        // The following exception was thrown during execution in test generation
        try {
            base32_9.decode(byteArray94, 10, 8192);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u01ff\uff00\ufffd" + "'", str7, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, -1, 100, 1, 61]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[65, 68, 55, 87, 73, 65, 74, 53, -1, 1, 0, -1, 10]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
        org.junit.Assert.assertNull(byteArray67);
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) 61 + "'", byte68 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[]");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "\u01ff\uff00\ufffd" + "'", str89, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray93), "[]");
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray94), "[]");
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray96), "[]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte byte4 = base64_2.PAD;
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_2.buffer = byteArray6;
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(1, byteArray11, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray11, true);
        boolean boolean18 = base64_2.isInAlphabet(byteArray11, false);
        int int19 = base64_2.available();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec21 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream23 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream20, baseNCodec21, true);
        boolean boolean24 = baseNCodecInputStream23.markSupported();
        byte[] byteArray27 = new byte[] {};
        java.lang.String str28 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray27);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream29 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream23, false, (int) 'a', byteArray27);
        byte[] byteArray30 = base64_2.encode(byteArray27);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, false);
        java.lang.String str34 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray33);
        java.lang.String str35 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byteArray33);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 61 + "'", byte4 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec3 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream2, baseNCodec3, true);
        boolean boolean6 = baseNCodecInputStream5.markSupported();
        byte[] byteArray9 = new byte[] {};
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, false, (int) 'a', byteArray9);
        base64_1.buffer = byteArray9;
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        boolean boolean17 = base64_1.isInAlphabet(byteArray14, false);
        byte[] byteArray19 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray19);
        byte[] byteArray21 = base64_20.buffer;
        byte byte22 = base64_20.PAD;
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_20.buffer = byteArray24;
        byte[] byteArray29 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray29);
        org.apache.commons.codec.binary.Base32 base32_32 = new org.apache.commons.codec.binary.Base32(1, byteArray29, true);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray29, true);
        boolean boolean36 = base64_20.isInAlphabet(byteArray29, false);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str43 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray42);
        int int46 = base64_20.readResults(byteArray42, 0, 64);
        byte[] byteArray48 = null;
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64(10, byteArray48, true);
        byte[] byteArray52 = base64_50.decode("\r\n");
        byte[] byteArray53 = base64_20.decode(byteArray52);
        byte[] byteArray55 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\r\n");
        java.lang.String str56 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray55);
        base64_20.decode(byteArray55, (int) (short) 0, (int) (short) -1);
        boolean boolean61 = base64_1.isInAlphabet(byteArray55, false);
        byte[] byteArray63 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_64 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray63);
        byte[] byteArray65 = base64_64.buffer;
        byte byte66 = base64_64.PAD;
        byte[] byteArray68 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_64.buffer = byteArray68;
        byte[] byteArray73 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_74 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray73);
        org.apache.commons.codec.binary.Base32 base32_76 = new org.apache.commons.codec.binary.Base32(1, byteArray73, true);
        org.apache.commons.codec.binary.Base64 base64_78 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray73, true);
        boolean boolean80 = base64_64.isInAlphabet(byteArray73, false);
        byte[] byteArray86 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str87 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray86);
        int int90 = base64_64.readResults(byteArray86, 0, 64);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = base64_1.readResults(byteArray86, 8192, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 61 + "'", byte22 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u01ff\uff00\ufffd" + "'", str43, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 13, 0, 10]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u0d00\u0a00" + "'", str56, "\u0d00\u0a00");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[]");
        org.junit.Assert.assertNull(byteArray65);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 61 + "'", byte66 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "\u01ff\uff00\ufffd" + "'", str87, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream10 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, false);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        byte[] byteArray16 = base64_15.buffer;
        byte byte17 = base64_15.PAD;
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_15.buffer = byteArray19;
        byte[] byteArray24 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray24);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(1, byteArray24, true);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray24, true);
        boolean boolean31 = base64_15.isInAlphabet(byteArray24, false);
        int int32 = base64_15.available();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec34 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream36 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream33, baseNCodec34, true);
        boolean boolean37 = baseNCodecInputStream36.markSupported();
        byte[] byteArray40 = new byte[] {};
        java.lang.String str41 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray40);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream42 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream36, false, (int) 'a', byteArray40);
        byte[] byteArray43 = base64_15.encode(byteArray40);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, false);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream47 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream10, false, 0, byteArray46);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream48 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream47);
        // The following exception was thrown during execution in test generation
        try {
            base64OutputStream48.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 61 + "'", byte17 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        byte[] byteArray4 = base64_3.buffer;
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray6);
        byte[] byteArray8 = base64_3.decode(byteArray6);
        base64_3.pos = (short) -1;
        base64_3.eof = true;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream14, true);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = baseNCodecInputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray19 = base32_16.encode(byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray44);
        int int48 = base64_22.readResults(byteArray44, 0, 64);
        byte[] byteArray49 = base32_16.decode(byteArray44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) (short) 10, byteArray49);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec51 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream53 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec51, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u01ff\uff00\ufffd" + "'", str45, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        byte[] byteArray4 = base64_3.buffer;
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray6);
        byte[] byteArray8 = base64_3.decode(byteArray6);
        base64_3.pos = (short) -1;
        base64_3.eof = true;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream14, true);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = base64InputStream16.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32(10, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray20 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray21 = base64_18.encode(byteArray20);
        base32_16.encode(byteArray21, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream25 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream4, false, 0, byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = base32InputStream25.skip((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u01ff\uff00\ufffd" + "'", str14, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream10 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, false);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        byte[] byteArray16 = base64_15.buffer;
        byte byte17 = base64_15.PAD;
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_15.buffer = byteArray19;
        byte[] byteArray24 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray24);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(1, byteArray24, true);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray24, true);
        boolean boolean31 = base64_15.isInAlphabet(byteArray24, false);
        int int32 = base64_15.available();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec34 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream36 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream33, baseNCodec34, true);
        boolean boolean37 = baseNCodecInputStream36.markSupported();
        byte[] byteArray40 = new byte[] {};
        java.lang.String str41 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray40);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream42 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream36, false, (int) 'a', byteArray40);
        byte[] byteArray43 = base64_15.encode(byteArray40);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, false);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream47 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream10, false, 0, byteArray46);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream48 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream47);
        byte[] byteArray52 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_53 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray52);
        byte[] byteArray54 = base64_53.buffer;
        byte byte55 = base64_53.PAD;
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_53.buffer = byteArray57;
        byte[] byteArray62 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_63 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray62);
        org.apache.commons.codec.binary.Base32 base32_65 = new org.apache.commons.codec.binary.Base32(1, byteArray62, true);
        org.apache.commons.codec.binary.Base64 base64_67 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray62, true);
        boolean boolean69 = base64_53.isInAlphabet(byteArray62, false);
        byte[] byteArray75 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str76 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray75);
        int int79 = base64_53.readResults(byteArray75, 0, 64);
        byte[] byteArray81 = base64_53.decode("\u0a0d");
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream82 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream48, false, 10, byteArray81);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream84 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream48, false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 61 + "'", byte17 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNull(byteArray54);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 61 + "'", byte55 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\u01ff\uff00\ufffd" + "'", str76, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32(10, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray20 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray21 = base64_18.encode(byteArray20);
        base32_16.encode(byteArray21, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream25 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream4, false, 0, byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = base32InputStream4.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u01ff\uff00\ufffd" + "'", str14, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        // The following exception was thrown during execution in test generation
        try {
            base32InputStream3.mark((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        int int6 = base64_3.getDefaultBufferSize();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream8 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream7);
        byte[] byteArray11 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_12 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray11);
        base64OutputStream8.write(byteArray11);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream15 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream8, true);
        byte[] byteArray19 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray19);
        byte[] byteArray21 = base64_20.buffer;
        byte[] byteArray23 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray23);
        byte[] byteArray25 = base64_20.decode(byteArray23);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream26 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream15, true, (int) '4', byteArray25);
        boolean boolean28 = base64_3.isInAlphabet(byteArray25, true);
        java.lang.Class<?> wildcardClass29 = byteArray25.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8192 + "'", int6 == 8192);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            base32InputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.codec.binary.Base32 base32_0 = new org.apache.commons.codec.binary.Base32();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream(inputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2);
        boolean boolean4 = base32InputStream2.markSupported();
        byte[] byteArray8 = null;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(10, byteArray8, true);
        byte[] byteArray12 = base64_10.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream2, false, 0, byteArray12);
        base32_0.buffer = byteArray12;
        byte[] byteArray16 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray16);
        byte[] byteArray18 = base64_17.buffer;
        byte byte19 = base64_17.PAD;
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_17.buffer = byteArray21;
        byte[] byteArray26 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray26);
        org.apache.commons.codec.binary.Base32 base32_29 = new org.apache.commons.codec.binary.Base32(1, byteArray26, true);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray26, true);
        boolean boolean33 = base64_17.isInAlphabet(byteArray26, false);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str40 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray39);
        int int43 = base64_17.readResults(byteArray39, 0, 64);
        byte[] byteArray45 = base64_17.decode("H47T6===");
        base32_0.encode(byteArray45, 0, (-1));
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray50);
        java.lang.String str52 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray50);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = base32_0.readResults(byteArray50, (int) (short) 10, (int) (byte) 61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 61 + "'", byte19 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u01ff\uff00\ufffd" + "'", str40, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[31, -114, -45]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.InputStream inputStream1 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream(inputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2);
        int int4 = base32InputStream2.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream5 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str15 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray14);
        org.apache.commons.codec.binary.Base32 base32_17 = new org.apache.commons.codec.binary.Base32(10, byteArray14);
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray21 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray22 = base64_19.encode(byteArray21);
        base32_17.encode(byteArray22, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream26 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream5, false, 0, byteArray22);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32((int) (byte) -1, byteArray22);
        boolean boolean28 = org.apache.commons.codec.binary.Base64.isBase64(byteArray22);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u01ff\uff00\ufffd" + "'", str15, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream5 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream3, false);
        byte[] byteArray9 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u0a0d");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream3, true, 0, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream10.mark((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[13, 10]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = baseNCodecInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isBase64(byteArray7);
        java.lang.String str11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        java.lang.String str10 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray7);
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2, true);
        boolean boolean5 = base32InputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = base32InputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream10 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, false);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        byte[] byteArray16 = base64_15.buffer;
        byte byte17 = base64_15.PAD;
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_15.buffer = byteArray19;
        byte[] byteArray24 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray24);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(1, byteArray24, true);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray24, true);
        boolean boolean31 = base64_15.isInAlphabet(byteArray24, false);
        int int32 = base64_15.available();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec34 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream36 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream33, baseNCodec34, true);
        boolean boolean37 = baseNCodecInputStream36.markSupported();
        byte[] byteArray40 = new byte[] {};
        java.lang.String str41 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray40);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream42 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream36, false, (int) 'a', byteArray40);
        byte[] byteArray43 = base64_15.encode(byteArray40);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, false);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream47 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream10, false, 0, byteArray46);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream48 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream47);
        base64OutputStream48.write(0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 61 + "'", byte17 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray19 = base32_16.encode(byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray44);
        int int48 = base64_22.readResults(byteArray44, 0, 64);
        byte[] byteArray49 = base32_16.decode(byteArray44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) (short) 10, byteArray49);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream50, true);
        int int53 = base64InputStream52.available();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u01ff\uff00\ufffd" + "'", str45, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray19 = base32_16.encode(byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray44);
        int int48 = base64_22.readResults(byteArray44, 0, 64);
        byte[] byteArray49 = base32_16.decode(byteArray44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) (short) 10, byteArray49);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream50, true);
        byte[] byteArray56 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_57 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray56);
        byte[] byteArray58 = base64_57.buffer;
        byte byte59 = base64_57.PAD;
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_57.buffer = byteArray61;
        byte[] byteArray66 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_67 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray66);
        org.apache.commons.codec.binary.Base32 base32_69 = new org.apache.commons.codec.binary.Base32(1, byteArray66, true);
        org.apache.commons.codec.binary.Base64 base64_71 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray66, true);
        boolean boolean73 = base64_57.isInAlphabet(byteArray66, false);
        int int74 = base64_57.available();
        java.io.InputStream inputStream75 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec76 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream78 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream75, baseNCodec76, true);
        boolean boolean79 = baseNCodecInputStream78.markSupported();
        byte[] byteArray82 = new byte[] {};
        java.lang.String str83 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray82);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream84 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream78, false, (int) 'a', byteArray82);
        byte[] byteArray85 = base64_57.encode(byteArray82);
        byte[] byteArray88 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray82, false, false);
        java.lang.String str89 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray88);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream90 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream52, true, 10, byteArray88);
        // The following exception was thrown during execution in test generation
        try {
            int int91 = base32InputStream90.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u01ff\uff00\ufffd" + "'", str45, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNull(byteArray58);
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 61 + "'", byte59 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[]");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[]");
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[]");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream10 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, false);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        byte[] byteArray16 = base64_15.buffer;
        byte byte17 = base64_15.PAD;
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_15.buffer = byteArray19;
        byte[] byteArray24 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray24);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(1, byteArray24, true);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray24, true);
        boolean boolean31 = base64_15.isInAlphabet(byteArray24, false);
        int int32 = base64_15.available();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec34 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream36 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream33, baseNCodec34, true);
        boolean boolean37 = baseNCodecInputStream36.markSupported();
        byte[] byteArray40 = new byte[] {};
        java.lang.String str41 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray40);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream42 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream36, false, (int) 'a', byteArray40);
        byte[] byteArray43 = base64_15.encode(byteArray40);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, false);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream47 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream10, false, 0, byteArray46);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream48 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream47);
        byte[] byteArray52 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_53 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray52);
        byte[] byteArray54 = base64_53.buffer;
        byte byte55 = base64_53.PAD;
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_53.buffer = byteArray57;
        byte[] byteArray62 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_63 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray62);
        org.apache.commons.codec.binary.Base32 base32_65 = new org.apache.commons.codec.binary.Base32(1, byteArray62, true);
        org.apache.commons.codec.binary.Base64 base64_67 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray62, true);
        boolean boolean69 = base64_53.isInAlphabet(byteArray62, false);
        byte[] byteArray75 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str76 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray75);
        int int79 = base64_53.readResults(byteArray75, 0, 64);
        byte[] byteArray81 = base64_53.decode("\u0a0d");
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream82 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream48, false, 10, byteArray81);
        byte[] byteArray83 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray81);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 61 + "'", byte17 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNull(byteArray54);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 61 + "'", byte55 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\u01ff\uff00\ufffd" + "'", str76, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[]");
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream5 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream3, false);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str13 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32(10, byteArray12);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray19 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray20 = base64_17.encode(byteArray19);
        base32_15.encode(byteArray20, 0, (int) (byte) 0);
        byte[] byteArray27 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray27);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, true, true);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray31, false);
        base64_33.modulus = (byte) 1;
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray39 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray40 = base64_37.encode(byteArray39);
        byte[] byteArray41 = base64_33.encode(byteArray40);
        boolean boolean42 = base32_15.containsAlphabetOrPad(byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = base64InputStream5.read(byteArray41, (int) (short) 10, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u01ff\uff00\ufffd" + "'", str13, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        long long7 = baseNCodecInputStream5.skip(0L);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0, byteArray12);
        java.io.OutputStream outputStream14 = null;
        byte[] byteArray18 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray18);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream20 = new org.apache.commons.codec.binary.Base32OutputStream(outputStream14, true, (int) ' ', byteArray18);
        base64_13.encode(byteArray18, (int) ' ', 0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream24 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream5, true, 100, byteArray18);
        org.apache.commons.codec.binary.Base64 base64_26 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream27 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec28 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream30 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream27, baseNCodec28, true);
        boolean boolean31 = baseNCodecInputStream30.markSupported();
        byte[] byteArray34 = new byte[] {};
        java.lang.String str35 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray34);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream36 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream30, false, (int) 'a', byteArray34);
        base64_26.buffer = byteArray34;
        int int38 = base64_26.lineLength;
        java.io.OutputStream outputStream39 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream40 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream39);
        byte[] byteArray43 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_44 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray43);
        base64OutputStream40.write(byteArray43);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream47 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream40, true);
        byte[] byteArray51 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_52 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray51);
        byte[] byteArray53 = base64_52.buffer;
        byte[] byteArray55 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_56 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray55);
        byte[] byteArray57 = base64_52.decode(byteArray55);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream58 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream47, true, (int) '4', byteArray57);
        byte[] byteArray59 = base64_26.encode(byteArray57);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = baseNCodecInputStream5.read(byteArray57, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 76 + "'", int38 == 76);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNull(byteArray53);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        boolean boolean11 = baseNCodecInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = baseNCodecInputStream3.skip((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        boolean boolean11 = base64InputStream10.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray17 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray18 = base64_15.encode(byteArray17);
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32(1, byteArray18);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = base64InputStream10.read(byteArray18, 255, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2, true);
        byte[] byteArray7 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray7);
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32(1, byteArray7, true);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) base32InputStream2, (org.apache.commons.codec.binary.BaseNCodec) base32_10, false);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = baseNCodecInputStream12.skip((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32(10, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray20 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray21 = base64_18.encode(byteArray20);
        base32_16.encode(byteArray21, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream25 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream4, false, 0, byteArray21);
        byte[] byteArray30 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray30);
        org.apache.commons.codec.binary.Base32 base32_32 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray30);
        byte[] byteArray34 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray35 = base32_32.encode(byteArray34);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream36 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream25, true, 0, byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = base32InputStream25.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u01ff\uff00\ufffd" + "'", str14, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[72, 52, 55, 84, 54, 61, 61, 61]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        boolean boolean3 = base32InputStream1.markSupported();
        boolean boolean4 = base32InputStream1.markSupported();
        int int5 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream6 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = base32InputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray19 = base32_16.encode(byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray44);
        int int48 = base64_22.readResults(byteArray44, 0, 64);
        byte[] byteArray49 = base32_16.decode(byteArray44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) (short) 10, byteArray49);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream50, true);
        byte[] byteArray56 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_57 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray56);
        byte[] byteArray58 = base64_57.buffer;
        byte byte59 = base64_57.PAD;
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_57.buffer = byteArray61;
        byte[] byteArray66 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_67 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray66);
        org.apache.commons.codec.binary.Base32 base32_69 = new org.apache.commons.codec.binary.Base32(1, byteArray66, true);
        org.apache.commons.codec.binary.Base64 base64_71 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray66, true);
        boolean boolean73 = base64_57.isInAlphabet(byteArray66, false);
        int int74 = base64_57.available();
        java.io.InputStream inputStream75 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec76 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream78 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream75, baseNCodec76, true);
        boolean boolean79 = baseNCodecInputStream78.markSupported();
        byte[] byteArray82 = new byte[] {};
        java.lang.String str83 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray82);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream84 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream78, false, (int) 'a', byteArray82);
        byte[] byteArray85 = base64_57.encode(byteArray82);
        byte[] byteArray88 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray82, false, false);
        java.lang.String str89 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray88);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream90 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream52, true, 10, byteArray88);
        // The following exception was thrown during execution in test generation
        try {
            long long92 = base32InputStream90.skip((long) (byte) 61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u01ff\uff00\ufffd" + "'", str45, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNull(byteArray58);
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 61 + "'", byte59 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[]");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[]");
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[]");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream13 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream11, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream13);
        java.lang.Class<?> wildcardClass15 = base64InputStream14.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec3 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream2, baseNCodec3, true);
        boolean boolean6 = baseNCodecInputStream5.markSupported();
        byte[] byteArray9 = new byte[] {};
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, false, (int) 'a', byteArray9);
        base64_1.buffer = byteArray9;
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        boolean boolean17 = base64_1.isInAlphabet(byteArray14, false);
        byte byte18 = base64_1.PAD;
        base64_1.currentLinePos = 64;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 61 + "'", byte18 == (byte) 61);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        base32OutputStream8.write((int) (short) 10);
        byte[] byteArray13 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream14 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream8, false, (int) (short) 1, byteArray13);
        java.io.InputStream inputStream17 = null;
        byte[] byteArray19 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray19);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream22 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream17, (org.apache.commons.codec.binary.BaseNCodec) base64_20, true);
        int int23 = base64_20.getDefaultBufferSize();
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream25 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream24);
        byte[] byteArray28 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_29 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray28);
        base64OutputStream25.write(byteArray28);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream32 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream25, true);
        byte[] byteArray36 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray36);
        byte[] byteArray38 = base64_37.buffer;
        byte[] byteArray40 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_41 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray40);
        byte[] byteArray42 = base64_37.decode(byteArray40);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream43 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream32, true, (int) '4', byteArray42);
        boolean boolean45 = base64_20.isInAlphabet(byteArray42, true);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream46 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream14, true, (int) '4', byteArray42);
        java.lang.String str47 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray42);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8192 + "'", int23 == 8192);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str7 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32(10, byteArray6);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray13 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray14 = base64_11.encode(byteArray13);
        base32_9.encode(byteArray14, 0, (int) (byte) 0);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 61 };
        boolean boolean24 = org.apache.commons.codec.binary.Base64.isBase64(byteArray23);
        byte[] byteArray25 = base32_9.encode(byteArray23);
        int int26 = base32_9.lineLength;
        byte[] byteArray28 = null;
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64(10, byteArray28, true);
        byte[] byteArray32 = base64_30.decode("\r\n");
        long long33 = base32_9.getEncodedLength(byteArray32);
        byte[] byteArray35 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray35);
        byte[] byteArray37 = base64_36.buffer;
        byte byte38 = base64_36.PAD;
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_36.buffer = byteArray40;
        byte[] byteArray45 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_46 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray45);
        org.apache.commons.codec.binary.Base32 base32_48 = new org.apache.commons.codec.binary.Base32(1, byteArray45, true);
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray45, true);
        boolean boolean52 = base64_36.isInAlphabet(byteArray45, false);
        byte[] byteArray58 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str59 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray58);
        int int62 = base64_36.readResults(byteArray58, 0, 64);
        byte[] byteArray64 = base64_36.decode("\u0a0d");
        java.io.InputStream inputStream65 = null;
        byte[] byteArray67 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_68 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray67);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream70 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream65, (org.apache.commons.codec.binary.BaseNCodec) base64_68, true);
        int int71 = base64_68.getDefaultBufferSize();
        java.io.OutputStream outputStream72 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream73 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream72);
        byte[] byteArray76 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_77 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray76);
        base64OutputStream73.write(byteArray76);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream80 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream73, true);
        byte[] byteArray84 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_85 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray84);
        byte[] byteArray86 = base64_85.buffer;
        byte[] byteArray88 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_89 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray88);
        byte[] byteArray90 = base64_85.decode(byteArray88);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream91 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream80, true, (int) '4', byteArray90);
        boolean boolean93 = base64_68.isInAlphabet(byteArray90, true);
        byte[] byteArray94 = base64_36.decode(byteArray90);
        base32_9.decode(byteArray94, 64, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u01ff\uff00\ufffd" + "'", str7, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, -1, 100, 1, 61]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[65, 68, 55, 87, 73, 65, 74, 53, -1, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 61 + "'", byte38 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\u01ff\uff00\ufffd" + "'", str59, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8192 + "'", int71 == 8192);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[]");
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[]");
        org.junit.Assert.assertNull(byteArray86);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[]");
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray90), "[]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray94), "[]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec3 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream2, baseNCodec3, true);
        boolean boolean6 = baseNCodecInputStream5.markSupported();
        byte[] byteArray9 = new byte[] {};
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, false, (int) 'a', byteArray9);
        base64_1.buffer = byteArray9;
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        boolean boolean17 = base64_1.isInAlphabet(byteArray14, false);
        byte byte18 = base64_1.PAD;
        byte[] byteArray20 = base64_1.decode("QUQ3V0lBSjX/AQD/Cg==");
        int int21 = base64_1.lineLength;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 61 + "'", byte18 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[65, 68, 55, 87, 73, 65, 74, 53, -1, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 76 + "'", int21 == 76);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        boolean boolean7 = base64_3.isInAlphabet((byte) 1);
        base64_3.modulus = 8192;
        boolean boolean11 = base64_3.isInAlphabet((byte) 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray2);
        boolean boolean6 = base32_4.isInAlphabet((byte) 0);
        byte[] byteArray9 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray9);
        byte[] byteArray11 = new byte[] {};
        int int14 = base64_10.readResults(byteArray11, (int) '4', (int) ' ');
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray11);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        java.lang.String str17 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray16);
        base32_15.decode(byteArray16, (int) '#', 0);
        java.lang.String str21 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray16);
        base32_4.decode(byteArray16, 0, (int) (short) 1);
        java.io.InputStream inputStream25 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream26 = new org.apache.commons.codec.binary.Base32InputStream(inputStream25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = base32_4.encode((java.lang.Object) inputStream25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[13, 10]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\n" + "'", str17, "\r\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\r\n" + "'", str21, "\r\n");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        int int7 = base64_3.readResults(byteArray4, (int) '4', (int) ' ');
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray4);
        boolean boolean10 = base32_8.isInAlphabet((byte) 10);
        int int11 = base32_8.getDefaultBufferSize();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec13 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream15 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream12, baseNCodec13, true);
        boolean boolean16 = baseNCodecInputStream15.markSupported();
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream22 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream15, true, 100, byteArray21);
        java.lang.String str23 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = base32_8.encode((java.lang.Object) str23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8192 + "'", int11 == 8192);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte byte4 = base64_2.PAD;
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_2.buffer = byteArray6;
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(1, byteArray11, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray11, true);
        boolean boolean18 = base64_2.isInAlphabet(byteArray11, false);
        int int19 = base64_2.available();
        boolean boolean20 = base64_2.isUrlSafe();
        base64_2.currentLinePos = (byte) 0;
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str29 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray28);
        int int33 = base64_2.readResults(byteArray30, 0, (int) (short) 100);
        byte[] byteArray35 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray35);
        byte[] byteArray37 = base64_36.buffer;
        byte byte38 = base64_36.PAD;
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_36.buffer = byteArray40;
        byte[] byteArray45 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_46 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray45);
        org.apache.commons.codec.binary.Base32 base32_48 = new org.apache.commons.codec.binary.Base32(1, byteArray45, true);
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray45, true);
        boolean boolean52 = base64_36.isInAlphabet(byteArray45, false);
        byte[] byteArray58 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str59 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray58);
        int int62 = base64_36.readResults(byteArray58, 0, 64);
        byte[] byteArray64 = base64_36.decode("\u0a0d");
        java.io.InputStream inputStream65 = null;
        byte[] byteArray67 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_68 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray67);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream70 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream65, (org.apache.commons.codec.binary.BaseNCodec) base64_68, true);
        int int71 = base64_68.getDefaultBufferSize();
        java.io.OutputStream outputStream72 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream73 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream72);
        byte[] byteArray76 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_77 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray76);
        base64OutputStream73.write(byteArray76);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream80 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream73, true);
        byte[] byteArray84 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_85 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray84);
        byte[] byteArray86 = base64_85.buffer;
        byte[] byteArray88 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_89 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray88);
        byte[] byteArray90 = base64_85.decode(byteArray88);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream91 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream80, true, (int) '4', byteArray90);
        boolean boolean93 = base64_68.isInAlphabet(byteArray90, true);
        byte[] byteArray94 = base64_36.decode(byteArray90);
        boolean boolean95 = base64_2.containsAlphabetOrPad(byteArray90);
        boolean boolean96 = base64_2.eof;
        byte[] byteArray97 = base64_2.buffer;
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 61 + "'", byte4 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u01ff\uff00\ufffd" + "'", str29, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 61 + "'", byte38 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\u01ff\uff00\ufffd" + "'", str59, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8192 + "'", int71 == 8192);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[]");
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[]");
        org.junit.Assert.assertNull(byteArray86);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[]");
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray90), "[]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray94), "[]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNull(byteArray97);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean4 = base64_2.isInAlphabet("\u01ff\uff00\ufffd");
        boolean boolean5 = base64_2.isUrlSafe();
        boolean boolean7 = base64_2.isInAlphabet((byte) 61);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream(inputStream8);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream10 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream9);
        boolean boolean11 = base32InputStream9.markSupported();
        byte[] byteArray15 = null;
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(10, byteArray15, true);
        byte[] byteArray19 = base64_17.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream20 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream9, false, 0, byteArray19);
        byte[] byteArray22 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray22);
        byte[] byteArray24 = base64_23.buffer;
        byte byte25 = base64_23.PAD;
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_23.buffer = byteArray27;
        byte[] byteArray32 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray32);
        org.apache.commons.codec.binary.Base32 base32_35 = new org.apache.commons.codec.binary.Base32(1, byteArray32, true);
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray32, true);
        boolean boolean39 = base64_23.isInAlphabet(byteArray32, false);
        int int40 = base64_23.available();
        java.io.InputStream inputStream41 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec42 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream44 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream41, baseNCodec42, true);
        boolean boolean45 = baseNCodecInputStream44.markSupported();
        byte[] byteArray48 = new byte[] {};
        java.lang.String str49 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray48);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream50 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream44, false, (int) 'a', byteArray48);
        byte[] byteArray51 = base64_23.encode(byteArray48);
        int int52 = base32InputStream9.read(byteArray48);
        long long53 = base64_2.getEncodedLength(byteArray48);
        byte[] byteArray55 = base64_2.decode("\u01ff\uff00\ufffd");
        org.apache.commons.codec.binary.Base32 base32_57 = new org.apache.commons.codec.binary.Base32(8, byteArray55, false);
        boolean boolean59 = base32_57.isInAlphabet((byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 61 + "'", byte25 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        boolean boolean3 = base32InputStream1.markSupported();
        byte[] byteArray7 = null;
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(10, byteArray7, true);
        byte[] byteArray11 = base64_9.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream1, false, 0, byteArray11);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        byte[] byteArray16 = base64_15.buffer;
        byte byte17 = base64_15.PAD;
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_15.buffer = byteArray19;
        byte[] byteArray24 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray24);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(1, byteArray24, true);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray24, true);
        boolean boolean31 = base64_15.isInAlphabet(byteArray24, false);
        int int32 = base64_15.available();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec34 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream36 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream33, baseNCodec34, true);
        boolean boolean37 = baseNCodecInputStream36.markSupported();
        byte[] byteArray40 = new byte[] {};
        java.lang.String str41 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray40);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream42 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream36, false, (int) 'a', byteArray40);
        byte[] byteArray43 = base64_15.encode(byteArray40);
        int int44 = base32InputStream1.read(byteArray40);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray40);
        java.math.BigInteger bigInteger46 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray40);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 61 + "'", byte17 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(bigInteger46);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream6 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec3 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream2, baseNCodec3, true);
        boolean boolean6 = baseNCodecInputStream5.markSupported();
        byte[] byteArray9 = new byte[] {};
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, false, (int) 'a', byteArray9);
        base64_1.buffer = byteArray9;
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        boolean boolean17 = base64_1.isInAlphabet(byteArray14, false);
        byte byte18 = base64_1.PAD;
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        java.lang.String str20 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray19);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, false, true);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray19, 1, 255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 61 + "'", byte18 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[13, 10]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\r\n" + "'", str20, "\r\n");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[68, 81, 111]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream10 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, false);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str19 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray18);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream20 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream1, false, (int) ' ', byteArray18);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream21 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream1);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str30 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray29);
        java.lang.String str32 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray29);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream33 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true, (int) (short) 0, byteArray29);
        org.apache.commons.codec.binary.Base64 base64_35 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec37 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream39 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream36, baseNCodec37, true);
        boolean boolean40 = baseNCodecInputStream39.markSupported();
        byte[] byteArray43 = new byte[] {};
        java.lang.String str44 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray43);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream45 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream39, false, (int) 'a', byteArray43);
        base64_35.buffer = byteArray43;
        byte[] byteArray48 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray48);
        boolean boolean51 = base64_35.isInAlphabet(byteArray48, false);
        byte[] byteArray54 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_55 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray54);
        org.apache.commons.codec.binary.Base32 base32_56 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray54);
        byte[] byteArray58 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray59 = base32_56.encode(byteArray58);
        byte[] byteArray61 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_62 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray61);
        byte[] byteArray63 = base64_62.buffer;
        byte byte64 = base64_62.PAD;
        byte[] byteArray66 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_62.buffer = byteArray66;
        byte[] byteArray71 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_72 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray71);
        org.apache.commons.codec.binary.Base32 base32_74 = new org.apache.commons.codec.binary.Base32(1, byteArray71, true);
        org.apache.commons.codec.binary.Base64 base64_76 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray71, true);
        boolean boolean78 = base64_62.isInAlphabet(byteArray71, false);
        byte[] byteArray84 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str85 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray84);
        int int88 = base64_62.readResults(byteArray84, 0, 64);
        byte[] byteArray89 = base32_56.decode(byteArray84);
        byte[] byteArray90 = base64_35.encode(byteArray89);
        int int91 = base64_35.getDefaultBufferSize();
        org.apache.commons.codec.binary.BaseNCodecOutputStream baseNCodecOutputStream93 = new org.apache.commons.codec.binary.BaseNCodecOutputStream((java.io.OutputStream) base64OutputStream1, (org.apache.commons.codec.binary.BaseNCodec) base64_35, false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u01ff\uff00\ufffd" + "'", str19, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u01ff\uff00\ufffd" + "'", str30, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\ufffd\001\000\ufffd\n" + "'", str32, "\ufffd\001\000\ufffd\n");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNull(byteArray63);
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 61 + "'", byte64 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "\u01ff\uff00\ufffd" + "'", str85, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[]");
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray90), "[]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 8192 + "'", int91 == 8192);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = baseNCodecInputStream3.read(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        boolean boolean11 = base64InputStream10.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream10);
        long long14 = base64InputStream12.skip((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec3 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream2, baseNCodec3, true);
        boolean boolean6 = baseNCodecInputStream5.markSupported();
        byte[] byteArray9 = new byte[] {};
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, false, (int) 'a', byteArray9);
        base64_1.buffer = byteArray9;
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        boolean boolean17 = base64_1.isInAlphabet(byteArray14, false);
        byte byte18 = base64_1.PAD;
        byte[] byteArray20 = base64_1.decode("QUQ3V0lBSjX/AQD/Cg==");
        boolean boolean22 = base64_1.isInAlphabet((byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 61 + "'", byte18 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[65, 68, 55, 87, 73, 65, 74, 53, -1, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte byte4 = base64_2.PAD;
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_2.buffer = byteArray6;
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(1, byteArray11, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray11, true);
        boolean boolean18 = base64_2.isInAlphabet(byteArray11, false);
        int int19 = base64_2.available();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec21 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream23 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream20, baseNCodec21, true);
        boolean boolean24 = baseNCodecInputStream23.markSupported();
        byte[] byteArray27 = new byte[] {};
        java.lang.String str28 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray27);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream29 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream23, false, (int) 'a', byteArray27);
        byte[] byteArray30 = base64_2.encode(byteArray27);
        java.math.BigInteger bigInteger31 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger31);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 61 + "'", byte4 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream13 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream11, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream13);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str24 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray23);
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(10, byteArray23);
        byte[] byteArray28 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray29 = base32_26.encode(byteArray28);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream30 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream13, false, (int) (short) 100, byteArray29);
        int int31 = base32InputStream13.available();
        byte[] byteArray33 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray33);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray33, true, true, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = base32InputStream13.read(byteArray38, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u01ff\uff00\ufffd" + "'", str24, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream5 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream3, false);
        byte[] byteArray9 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u0a0d");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream3, true, 0, byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream3, true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[13, 10]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.OutputStream outputStream0 = null;
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream4 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream3);
        byte[] byteArray7 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray7);
        base64OutputStream4.write(byteArray7);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream11 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream4, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream13 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream4, false);
        byte[] byteArray17 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray17);
        byte[] byteArray19 = base64_18.buffer;
        byte byte20 = base64_18.PAD;
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_18.buffer = byteArray22;
        byte[] byteArray27 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_28 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray27);
        org.apache.commons.codec.binary.Base32 base32_30 = new org.apache.commons.codec.binary.Base32(1, byteArray27, true);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray27, true);
        boolean boolean34 = base64_18.isInAlphabet(byteArray27, false);
        int int35 = base64_18.available();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec37 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream39 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream36, baseNCodec37, true);
        boolean boolean40 = baseNCodecInputStream39.markSupported();
        byte[] byteArray43 = new byte[] {};
        java.lang.String str44 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray43);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream45 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream39, false, (int) 'a', byteArray43);
        byte[] byteArray46 = base64_18.encode(byteArray43);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray43, false, false);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream50 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream13, false, 0, byteArray49);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream51 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream50);
        byte[] byteArray55 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream56 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream51, false, (-1), byteArray55);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream57 = new org.apache.commons.codec.binary.Base32OutputStream(outputStream0, true, (int) (byte) 0, byteArray55);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 61 + "'", byte20 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.InputStream inputStream1 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream(inputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2);
        int int4 = base32InputStream2.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream5 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str15 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray14);
        org.apache.commons.codec.binary.Base32 base32_17 = new org.apache.commons.codec.binary.Base32(10, byteArray14);
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray21 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray22 = base64_19.encode(byteArray21);
        base32_17.encode(byteArray22, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream26 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream5, false, 0, byteArray22);
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_33 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray31);
        byte[] byteArray35 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray36 = base32_33.encode(byteArray35);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream37 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream26, true, 0, byteArray36);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray36, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain base64 characters: [H47T6===]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u01ff\uff00\ufffd" + "'", str15, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[72, 52, 55, 84, 54, 61, 61, 61]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        boolean boolean10 = baseNCodecInputStream3.markSupported();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = base32InputStream11.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        byte[] byteArray3 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3);
        org.apache.commons.codec.binary.Base32 base32_6 = new org.apache.commons.codec.binary.Base32(1, byteArray3, true);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray3, true);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream11, baseNCodec12, true);
        boolean boolean15 = baseNCodecInputStream14.markSupported();
        byte[] byteArray18 = new byte[] {};
        java.lang.String str19 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray18);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream20 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream14, false, (int) 'a', byteArray18);
        base64_10.buffer = byteArray18;
        byte[] byteArray23 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray23);
        boolean boolean26 = base64_10.isInAlphabet(byteArray23, false);
        byte[] byteArray29 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray29);
        org.apache.commons.codec.binary.Base32 base32_31 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray29);
        byte[] byteArray33 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray34 = base32_31.encode(byteArray33);
        byte[] byteArray36 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray36);
        byte[] byteArray38 = base64_37.buffer;
        byte byte39 = base64_37.PAD;
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_37.buffer = byteArray41;
        byte[] byteArray46 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_47 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray46);
        org.apache.commons.codec.binary.Base32 base32_49 = new org.apache.commons.codec.binary.Base32(1, byteArray46, true);
        org.apache.commons.codec.binary.Base64 base64_51 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray46, true);
        boolean boolean53 = base64_37.isInAlphabet(byteArray46, false);
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str60 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray59);
        int int63 = base64_37.readResults(byteArray59, 0, 64);
        byte[] byteArray64 = base32_31.decode(byteArray59);
        byte[] byteArray65 = base64_10.encode(byteArray64);
        base64_8.decode(byteArray65, 64, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = org.apache.commons.codec.binary.StringUtils.newString(byteArray65, "\307\277\357\274\200\357\277\275");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: C??i???i???: java.io.UnsupportedEncodingException: C??i???i???");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 61 + "'", byte39 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u01ff\uff00\ufffd" + "'", str60, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream10 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, false);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        byte[] byteArray16 = base64_15.buffer;
        byte byte17 = base64_15.PAD;
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_15.buffer = byteArray19;
        byte[] byteArray24 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray24);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(1, byteArray24, true);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray24, true);
        boolean boolean31 = base64_15.isInAlphabet(byteArray24, false);
        int int32 = base64_15.available();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec34 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream36 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream33, baseNCodec34, true);
        boolean boolean37 = baseNCodecInputStream36.markSupported();
        byte[] byteArray40 = new byte[] {};
        java.lang.String str41 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray40);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream42 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream36, false, (int) 'a', byteArray40);
        byte[] byteArray43 = base64_15.encode(byteArray40);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, false);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream47 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream10, false, 0, byteArray46);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream48 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream47);
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str57 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray56);
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray56);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray58, false, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream62 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream47, false, (int) (short) 0, byteArray58);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream64 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream47, false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 61 + "'", byte17 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u01ff\uff00\ufffd" + "'", str57, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[88, 51, 100, 70, 81, 86, 57, 51, 98, 119]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream10 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, false);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        byte[] byteArray16 = base64_15.buffer;
        byte byte17 = base64_15.PAD;
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_15.buffer = byteArray19;
        byte[] byteArray24 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray24);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(1, byteArray24, true);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray24, true);
        boolean boolean31 = base64_15.isInAlphabet(byteArray24, false);
        int int32 = base64_15.available();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec34 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream36 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream33, baseNCodec34, true);
        boolean boolean37 = baseNCodecInputStream36.markSupported();
        byte[] byteArray40 = new byte[] {};
        java.lang.String str41 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray40);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream42 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream36, false, (int) 'a', byteArray40);
        byte[] byteArray43 = base64_15.encode(byteArray40);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, false);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream47 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream10, false, 0, byteArray46);
        byte[] byteArray48 = null;
        // The following exception was thrown during execution in test generation
        try {
            base32OutputStream10.write(byteArray48, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 61 + "'", byte17 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray8 = base64_5.encode(byteArray7);
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32(1, byteArray8);
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        byte[] byteArray13 = base64_12.buffer;
        byte byte14 = base64_12.PAD;
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_12.buffer = byteArray16;
        byte[] byteArray18 = base32_9.decode(byteArray16);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, true, false, (int) (short) 1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream23 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0, false, 0, byteArray22);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 61 + "'", byte14 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec3 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream2, baseNCodec3, true);
        boolean boolean6 = baseNCodecInputStream5.markSupported();
        byte[] byteArray9 = new byte[] {};
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, false, (int) 'a', byteArray9);
        base64_1.buffer = byteArray9;
        java.io.InputStream inputStream13 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream14 = new org.apache.commons.codec.binary.Base32InputStream(inputStream13);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream15 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream14);
        boolean boolean16 = base32InputStream14.markSupported();
        boolean boolean17 = base32InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = base64_1.encode((java.lang.Object) base32InputStream14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream5, baseNCodec6, true);
        boolean boolean9 = baseNCodecInputStream8.markSupported();
        byte[] byteArray12 = new byte[] {};
        java.lang.String str13 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray12);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream14 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream8, false, (int) 'a', byteArray12);
        byte[] byteArray19 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray19);
        org.apache.commons.codec.binary.Base32 base32_21 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray19);
        byte[] byteArray23 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray24 = base32_21.encode(byteArray23);
        byte[] byteArray26 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray26);
        byte[] byteArray28 = base64_27.buffer;
        byte byte29 = base64_27.PAD;
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_27.buffer = byteArray31;
        byte[] byteArray36 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray36);
        org.apache.commons.codec.binary.Base32 base32_39 = new org.apache.commons.codec.binary.Base32(1, byteArray36, true);
        org.apache.commons.codec.binary.Base64 base64_41 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray36, true);
        boolean boolean43 = base64_27.isInAlphabet(byteArray36, false);
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str50 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray49);
        int int53 = base64_27.readResults(byteArray49, 0, 64);
        byte[] byteArray54 = base32_21.decode(byteArray49);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream55 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream8, false, (int) (short) 10, byteArray54);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream55, true);
        byte[] byteArray60 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_61 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray60);
        int int62 = base64InputStream55.read(byteArray60);
        java.lang.String str63 = base32_4.encodeAsString(byteArray60);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 61 + "'", byte29 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u01ff\uff00\ufffd" + "'", str50, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = baseNCodecInputStream5.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream13 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream11, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream13);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str24 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray23);
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(10, byteArray23);
        byte[] byteArray28 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray29 = base32_26.encode(byteArray28);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream30 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream13, false, (int) (short) 100, byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = base32InputStream13.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u01ff\uff00\ufffd" + "'", str24, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.codec.binary.Base32 base32_0 = new org.apache.commons.codec.binary.Base32();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream(inputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2);
        boolean boolean4 = base32InputStream2.markSupported();
        byte[] byteArray8 = null;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(10, byteArray8, true);
        byte[] byteArray12 = base64_10.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream2, false, 0, byteArray12);
        base32_0.buffer = byteArray12;
        byte[] byteArray16 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray16);
        byte[] byteArray18 = base64_17.buffer;
        byte byte19 = base64_17.PAD;
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_17.buffer = byteArray21;
        byte[] byteArray26 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray26);
        org.apache.commons.codec.binary.Base32 base32_29 = new org.apache.commons.codec.binary.Base32(1, byteArray26, true);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray26, true);
        boolean boolean33 = base64_17.isInAlphabet(byteArray26, false);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str40 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray39);
        int int43 = base64_17.readResults(byteArray39, 0, 64);
        byte[] byteArray45 = base64_17.decode("H47T6===");
        base32_0.encode(byteArray45, 0, (-1));
        base32_0.pos = (-1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 61 + "'", byte19 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u01ff\uff00\ufffd" + "'", str40, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[31, -114, -45]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, true);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec15 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream17 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream14, baseNCodec15, true);
        boolean boolean18 = baseNCodecInputStream17.markSupported();
        byte[] byteArray21 = new byte[] {};
        java.lang.String str22 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray21);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream23 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream17, false, (int) 'a', byteArray21);
        base64_13.buffer = byteArray21;
        byte[] byteArray26 = base64_13.decode("AAo9AA");
        // The following exception was thrown during execution in test generation
        try {
            int int27 = baseNCodecInputStream3.read(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 10, 61, 0]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream5 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3);
        byte[] byteArray7 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        int int8 = baseNCodecInputStream3.read(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        boolean boolean11 = base64InputStream10.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream10);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        boolean boolean11 = base64InputStream10.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream13 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec3 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream2, baseNCodec3, true);
        boolean boolean6 = baseNCodecInputStream5.markSupported();
        byte[] byteArray9 = new byte[] {};
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, false, (int) 'a', byteArray9);
        base64_1.buffer = byteArray9;
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        boolean boolean17 = base64_1.isInAlphabet(byteArray14, false);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream19 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream18);
        byte[] byteArray22 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_23 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray22);
        base64OutputStream19.write(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = base64_1.decode((java.lang.Object) base64OutputStream19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = baseNCodecInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray19 = base32_16.encode(byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray44);
        int int48 = base64_22.readResults(byteArray44, 0, 64);
        byte[] byteArray49 = base32_16.decode(byteArray44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) (short) 10, byteArray49);
        byte[] byteArray53 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream54 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream50, true, (int) (byte) 10, byteArray53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u01ff\uff00\ufffd" + "'", str45, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        int int7 = base64_3.readResults(byteArray4, (int) '4', (int) ' ');
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray9);
        base32_8.decode(byteArray9, (int) '#', 0);
        byte[] byteArray15 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray15);
        byte[] byteArray17 = base64_16.buffer;
        byte byte18 = base64_16.PAD;
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_16.buffer = byteArray20;
        base32_8.buffer = byteArray20;
        java.io.InputStream inputStream23 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream24 = new org.apache.commons.codec.binary.Base32InputStream(inputStream23);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream25 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream24);
        int int26 = base32InputStream24.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream27 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream24);
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str37 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray36);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray36);
        org.apache.commons.codec.binary.Base32 base32_39 = new org.apache.commons.codec.binary.Base32(10, byteArray36);
        org.apache.commons.codec.binary.Base64 base64_41 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray43 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray44 = base64_41.encode(byteArray43);
        base32_39.encode(byteArray44, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream48 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream27, false, 0, byteArray44);
        byte[] byteArray53 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_54 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray53);
        org.apache.commons.codec.binary.Base32 base32_55 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray53);
        byte[] byteArray57 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray58 = base32_55.encode(byteArray57);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream59 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream48, true, 0, byteArray58);
        base32_8.buffer = byteArray58;
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[13, 10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 61 + "'", byte18 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u01ff\uff00\ufffd" + "'", str37, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[72, 52, 55, 84, 54, 61, 61, 61]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream6 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32(10, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray20 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray21 = base64_18.encode(byteArray20);
        base32_16.encode(byteArray21, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream25 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream4, false, 0, byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            base32InputStream4.mark(8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u01ff\uff00\ufffd" + "'", str14, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte byte4 = base64_2.PAD;
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_2.buffer = byteArray6;
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(1, byteArray11, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray11, true);
        boolean boolean18 = base64_2.isInAlphabet(byteArray11, false);
        int int19 = base64_2.available();
        boolean boolean20 = base64_2.isUrlSafe();
        base64_2.currentLinePos = (byte) 0;
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str29 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray28);
        int int33 = base64_2.readResults(byteArray30, 0, (int) (short) 100);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec35 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream37 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream34, baseNCodec35, true);
        boolean boolean38 = baseNCodecInputStream37.markSupported();
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream37, true, 100, byteArray43);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream45 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = base64_2.decode((java.lang.Object) base64InputStream44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 61 + "'", byte4 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u01ff\uff00\ufffd" + "'", str29, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream3);
        // The following exception was thrown during execution in test generation
        try {
            base32InputStream3.mark(64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec3 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream2, baseNCodec3, true);
        boolean boolean6 = baseNCodecInputStream5.markSupported();
        byte[] byteArray9 = new byte[] {};
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, false, (int) 'a', byteArray9);
        base64_1.buffer = byteArray9;
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        boolean boolean17 = base64_1.isInAlphabet(byteArray14, false);
        byte byte18 = base64_1.PAD;
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        org.apache.commons.codec.binary.Base32 base32_23 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray21);
        byte[] byteArray25 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray26 = base32_23.encode(byteArray25);
        java.lang.String str27 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray26);
        boolean boolean28 = base64_1.containsAlphabetOrPad(byteArray26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 61 + "'", byte18 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H47T6===" + "'", str27, "H47T6===");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream5 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream3, false);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = base64InputStream5.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte[] byteArray5 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5);
        byte[] byteArray7 = base64_2.decode(byteArray5);
        base64_2.pos = (short) -1;
        base64_2.currentLinePos = (byte) 0;
        int int12 = base64_2.currentLinePos;
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec16 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream18 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream15, baseNCodec16, true);
        boolean boolean19 = baseNCodecInputStream18.markSupported();
        byte[] byteArray22 = new byte[] {};
        java.lang.String str23 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray22);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream24 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream18, false, (int) 'a', byteArray22);
        base64_14.buffer = byteArray22;
        byte[] byteArray26 = base64_2.encode(byteArray22);
        boolean boolean28 = base64_2.isInAlphabet((byte) 100);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        byte[] byteArray3 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3);
        org.apache.commons.codec.binary.Base32 base32_6 = new org.apache.commons.codec.binary.Base32(1, byteArray3, true);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray3, true);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream11, baseNCodec12, true);
        boolean boolean15 = baseNCodecInputStream14.markSupported();
        byte[] byteArray18 = new byte[] {};
        java.lang.String str19 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray18);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream20 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream14, false, (int) 'a', byteArray18);
        base64_10.buffer = byteArray18;
        byte[] byteArray23 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray23);
        boolean boolean26 = base64_10.isInAlphabet(byteArray23, false);
        byte[] byteArray29 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray29);
        org.apache.commons.codec.binary.Base32 base32_31 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray29);
        byte[] byteArray33 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray34 = base32_31.encode(byteArray33);
        byte[] byteArray36 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray36);
        byte[] byteArray38 = base64_37.buffer;
        byte byte39 = base64_37.PAD;
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_37.buffer = byteArray41;
        byte[] byteArray46 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_47 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray46);
        org.apache.commons.codec.binary.Base32 base32_49 = new org.apache.commons.codec.binary.Base32(1, byteArray46, true);
        org.apache.commons.codec.binary.Base64 base64_51 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray46, true);
        boolean boolean53 = base64_37.isInAlphabet(byteArray46, false);
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str60 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray59);
        int int63 = base64_37.readResults(byteArray59, 0, 64);
        byte[] byteArray64 = base32_31.decode(byteArray59);
        byte[] byteArray65 = base64_10.encode(byteArray64);
        base64_8.decode(byteArray65, 64, 0);
        java.math.BigInteger bigInteger69 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray65);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 61 + "'", byte39 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u01ff\uff00\ufffd" + "'", str60, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
        org.junit.Assert.assertNotNull(bigInteger69);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte byte4 = base64_2.PAD;
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_2.buffer = byteArray6;
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(1, byteArray11, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray11, true);
        boolean boolean18 = base64_2.isInAlphabet(byteArray11, false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str25 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray24);
        int int28 = base64_2.readResults(byteArray24, 0, 64);
        byte byte29 = base64_2.PAD;
        byte[] byteArray32 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray32);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray32);
        byte[] byteArray36 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray37 = base32_34.encode(byteArray36);
        byte[] byteArray39 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_40 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray39);
        byte[] byteArray41 = base64_40.buffer;
        byte byte42 = base64_40.PAD;
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_40.buffer = byteArray44;
        byte[] byteArray49 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray49);
        org.apache.commons.codec.binary.Base32 base32_52 = new org.apache.commons.codec.binary.Base32(1, byteArray49, true);
        org.apache.commons.codec.binary.Base64 base64_54 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray49, true);
        boolean boolean56 = base64_40.isInAlphabet(byteArray49, false);
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str63 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray62);
        int int66 = base64_40.readResults(byteArray62, 0, 64);
        byte[] byteArray67 = base32_34.decode(byteArray62);
        java.lang.String str68 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray67);
        byte[] byteArray69 = base64_2.decode(byteArray67);
        org.apache.commons.codec.binary.Base64 base64_71 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream72 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec73 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream75 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream72, baseNCodec73, true);
        boolean boolean76 = baseNCodecInputStream75.markSupported();
        byte[] byteArray79 = new byte[] {};
        java.lang.String str80 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray79);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream81 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream75, false, (int) 'a', byteArray79);
        base64_71.buffer = byteArray79;
        byte[] byteArray84 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray85 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray84);
        boolean boolean87 = base64_71.isInAlphabet(byteArray84, false);
        byte byte88 = base64_71.PAD;
        byte[] byteArray90 = base64_71.decode("QUQ3V0lBSjX/AQD/Cg==");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj91 = base64_2.encode((java.lang.Object) base64_71);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 61 + "'", byte4 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u01ff\uff00\ufffd" + "'", str25, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 61 + "'", byte29 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNull(byteArray41);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 61 + "'", byte42 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u01ff\uff00\ufffd" + "'", str63, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[]");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[]");
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + byte88 + "' != '" + (byte) 61 + "'", byte88 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray90), "[65, 68, 55, 87, 73, 65, 74, 53, -1, 1, 0, -1, 10]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray19 = base32_16.encode(byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray44);
        int int48 = base64_22.readResults(byteArray44, 0, 64);
        byte[] byteArray49 = base32_16.decode(byteArray44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) (short) 10, byteArray49);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream50.mark((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u01ff\uff00\ufffd" + "'", str45, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream9 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream8);
        base32OutputStream8.write(64);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream13 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream8, false);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str22 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray21);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32(10, byteArray21);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray21);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32((int) (short) -1, byteArray25, false);
        org.apache.commons.codec.binary.BaseNCodecOutputStream baseNCodecOutputStream29 = new org.apache.commons.codec.binary.BaseNCodecOutputStream((java.io.OutputStream) base32OutputStream13, (org.apache.commons.codec.binary.BaseNCodec) base32_27, false);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec35 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream37 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream34, baseNCodec35, true);
        boolean boolean38 = baseNCodecInputStream37.markSupported();
        byte[] byteArray41 = new byte[] {};
        java.lang.String str42 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray41);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream43 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream37, false, (int) 'a', byteArray41);
        base64_33.buffer = byteArray41;
        byte[] byteArray46 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray46);
        boolean boolean49 = base64_33.isInAlphabet(byteArray46, false);
        byte[] byteArray51 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_52 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray51);
        byte[] byteArray53 = base64_52.buffer;
        byte byte54 = base64_52.PAD;
        byte[] byteArray56 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_52.buffer = byteArray56;
        byte[] byteArray61 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_62 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray61);
        org.apache.commons.codec.binary.Base32 base32_64 = new org.apache.commons.codec.binary.Base32(1, byteArray61, true);
        org.apache.commons.codec.binary.Base64 base64_66 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray61, true);
        boolean boolean68 = base64_52.isInAlphabet(byteArray61, false);
        byte[] byteArray74 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str75 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray74);
        int int78 = base64_52.readResults(byteArray74, 0, 64);
        byte[] byteArray80 = null;
        org.apache.commons.codec.binary.Base64 base64_82 = new org.apache.commons.codec.binary.Base64(10, byteArray80, true);
        byte[] byteArray84 = base64_82.decode("\r\n");
        byte[] byteArray85 = base64_52.decode(byteArray84);
        byte[] byteArray87 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("\r\n");
        java.lang.String str88 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray87);
        base64_52.decode(byteArray87, (int) (short) 0, (int) (short) -1);
        boolean boolean93 = base64_33.isInAlphabet(byteArray87, false);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream94 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) baseNCodecOutputStream29, true, 100, byteArray87);
        // The following exception was thrown during execution in test generation
        try {
            base32OutputStream94.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u01ff\uff00\ufffd" + "'", str22, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[47, 119, 69, 65, 47, 119, 111, 61, 13, 10]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNull(byteArray53);
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 61 + "'", byte54 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\u01ff\uff00\ufffd" + "'", str75, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[]");
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[]");
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[0, 13, 0, 10]");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\u0d00\u0a00" + "'", str88, "\u0d00\u0a00");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray19 = base32_16.encode(byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray44);
        int int48 = base64_22.readResults(byteArray44, 0, 64);
        byte[] byteArray49 = base32_16.decode(byteArray44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) (short) 10, byteArray49);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream50, true);
        byte[] byteArray55 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_56 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray55);
        int int57 = base64InputStream50.read(byteArray55);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream50.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u01ff\uff00\ufffd" + "'", str45, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte byte4 = base64_2.PAD;
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_2.buffer = byteArray6;
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(1, byteArray11, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray11, true);
        boolean boolean18 = base64_2.isInAlphabet(byteArray11, false);
        int int19 = base64_2.available();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec21 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream23 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream20, baseNCodec21, true);
        boolean boolean24 = baseNCodecInputStream23.markSupported();
        byte[] byteArray27 = new byte[] {};
        java.lang.String str28 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray27);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream29 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream23, false, (int) 'a', byteArray27);
        byte[] byteArray30 = base64_2.encode(byteArray27);
        java.math.BigInteger bigInteger31 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger31);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray32);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 61 + "'", byte4 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        boolean boolean11 = base64InputStream10.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream10, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream5 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream3, false);
        byte[] byteArray9 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le("\u0a0d");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream3, true, 0, byteArray9);
        long long12 = base64InputStream10.skip(0L);
        byte[] byteArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32InputStream base32InputStream16 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10, true, (int) (short) 100, byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineLength 100 > 0, but lineSeparator is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[13, 10]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte byte4 = base64_2.PAD;
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_2.buffer = byteArray6;
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(1, byteArray11, true);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray11, true);
        boolean boolean18 = base64_2.isInAlphabet(byteArray11, false);
        int int19 = base64_2.available();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec21 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream23 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream20, baseNCodec21, true);
        boolean boolean24 = baseNCodecInputStream23.markSupported();
        byte[] byteArray27 = new byte[] {};
        java.lang.String str28 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray27);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream29 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream23, false, (int) 'a', byteArray27);
        byte[] byteArray30 = base64_2.encode(byteArray27);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false, false);
        java.math.BigInteger bigInteger34 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger34);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 61 + "'", byte4 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        boolean boolean11 = base64InputStream10.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream14 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream12, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean3 = base64_1.isInAlphabet("\u01ff\uff00\ufffd");
        boolean boolean4 = base64_1.isUrlSafe();
        boolean boolean6 = base64_1.isInAlphabet((byte) 61);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream8 = new org.apache.commons.codec.binary.Base32InputStream(inputStream7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream8);
        boolean boolean10 = base32InputStream8.markSupported();
        byte[] byteArray14 = null;
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64(10, byteArray14, true);
        byte[] byteArray18 = base64_16.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream19 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream8, false, 0, byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        int int39 = base64_22.available();
        java.io.InputStream inputStream40 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec41 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream43 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream40, baseNCodec41, true);
        boolean boolean44 = baseNCodecInputStream43.markSupported();
        byte[] byteArray47 = new byte[] {};
        java.lang.String str48 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray47);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream49 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream43, false, (int) 'a', byteArray47);
        byte[] byteArray50 = base64_22.encode(byteArray47);
        int int51 = base32InputStream8.read(byteArray47);
        long long52 = base64_1.getEncodedLength(byteArray47);
        byte[] byteArray54 = base64_1.decode("\u01ff\uff00\ufffd");
        boolean boolean56 = base64_1.isInAlphabet("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream(inputStream2);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream3);
        int int5 = base32InputStream3.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream6 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream3);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str16 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray15);
        org.apache.commons.codec.binary.Base32 base32_18 = new org.apache.commons.codec.binary.Base32(10, byteArray15);
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray22 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray23 = base64_20.encode(byteArray22);
        base32_18.encode(byteArray23, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream27 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream6, false, 0, byteArray23);
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32((int) (byte) -1, byteArray23);
        org.apache.commons.codec.binary.Base32 base32_29 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u01ff\uff00\ufffd" + "'", str16, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.io.OutputStream outputStream0 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream(inputStream2);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream3);
        int int5 = base32InputStream3.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream6 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream3);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str16 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray15);
        org.apache.commons.codec.binary.Base32 base32_18 = new org.apache.commons.codec.binary.Base32(10, byteArray15);
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray22 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray23 = base64_20.encode(byteArray22);
        base32_18.encode(byteArray23, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream27 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream6, false, 0, byteArray23);
        java.lang.String str28 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray23);
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64(100, byteArray23, true);
        org.apache.commons.codec.binary.BaseNCodecOutputStream baseNCodecOutputStream32 = new org.apache.commons.codec.binary.BaseNCodecOutputStream(outputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_30, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u01ff\uff00\ufffd" + "'", str16, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream10 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream9);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray14 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray15 = base64_12.encode(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = base32InputStream10.read(byteArray14, 64, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        byte[] byteArray5 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream6 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream2, false, 1, byteArray5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream13 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream11, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream13);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str24 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray23);
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(10, byteArray23);
        byte[] byteArray28 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray29 = base32_26.encode(byteArray28);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream30 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream13, false, (int) (short) 100, byteArray29);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.decodeBase64("H47T6===");
        java.math.BigInteger bigInteger35 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray34);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream30, true, 0, byteArray34);
        int int37 = base32InputStream30.available();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u01ff\uff00\ufffd" + "'", str24, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[31, -114, -45]");
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        boolean boolean3 = base32InputStream1.markSupported();
        boolean boolean4 = base32InputStream1.markSupported();
        int int5 = base32InputStream1.available();
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1, true, (int) '4', byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineLength 52 > 0, but lineSeparator is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) ' ', byteArray2, true);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream7 = new org.apache.commons.codec.binary.Base32InputStream(inputStream6);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream8 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream7);
        boolean boolean9 = base32InputStream7.markSupported();
        byte[] byteArray13 = null;
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(10, byteArray13, true);
        byte[] byteArray17 = base64_15.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream7, false, 0, byteArray17);
        byte[] byteArray20 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray20);
        byte[] byteArray22 = base64_21.buffer;
        byte byte23 = base64_21.PAD;
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_21.buffer = byteArray25;
        byte[] byteArray30 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray30);
        org.apache.commons.codec.binary.Base32 base32_33 = new org.apache.commons.codec.binary.Base32(1, byteArray30, true);
        org.apache.commons.codec.binary.Base64 base64_35 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray30, true);
        boolean boolean37 = base64_21.isInAlphabet(byteArray30, false);
        int int38 = base64_21.available();
        java.io.InputStream inputStream39 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec40 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream42 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream39, baseNCodec40, true);
        boolean boolean43 = baseNCodecInputStream42.markSupported();
        byte[] byteArray46 = new byte[] {};
        java.lang.String str47 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray46);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream48 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream42, false, (int) 'a', byteArray46);
        byte[] byteArray49 = base64_21.encode(byteArray46);
        int int50 = base32InputStream7.read(byteArray46);
        byte[] byteArray51 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray46);
        java.lang.Object obj52 = base32_5.encode((java.lang.Object) byteArray46);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 61 + "'", byte23 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32(10, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray20 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray21 = base64_18.encode(byteArray20);
        base32_16.encode(byteArray21, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream25 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream4, false, 0, byteArray21);
        byte[] byteArray30 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray30);
        org.apache.commons.codec.binary.Base32 base32_32 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray30);
        byte[] byteArray34 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray35 = base32_32.encode(byteArray34);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream36 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream25, true, 0, byteArray35);
        byte[] byteArray38 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("\n\u3d00");
        // The following exception was thrown during execution in test generation
        try {
            int int39 = base32InputStream25.read(byteArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u01ff\uff00\ufffd" + "'", str14, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-2, -1, 0, 10, 61, 0]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream6 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream13 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream11, true);
        int int14 = base32InputStream13.available();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.codec.binary.Base32 base32_0 = new org.apache.commons.codec.binary.Base32();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream(inputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2);
        boolean boolean4 = base32InputStream2.markSupported();
        byte[] byteArray8 = null;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(10, byteArray8, true);
        byte[] byteArray12 = base64_10.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream2, false, 0, byteArray12);
        base32_0.buffer = byteArray12;
        byte[] byteArray16 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray16);
        byte[] byteArray18 = base64_17.buffer;
        byte byte19 = base64_17.PAD;
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_17.buffer = byteArray21;
        byte[] byteArray26 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray26);
        org.apache.commons.codec.binary.Base32 base32_29 = new org.apache.commons.codec.binary.Base32(1, byteArray26, true);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray26, true);
        boolean boolean33 = base64_17.isInAlphabet(byteArray26, false);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str40 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray39);
        int int43 = base64_17.readResults(byteArray39, 0, 64);
        byte[] byteArray45 = base64_17.decode("H47T6===");
        base32_0.encode(byteArray45, 0, (-1));
        boolean boolean50 = base32_0.isInAlphabet((byte) 1);
        byte[] byteArray52 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_53 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray52);
        byte[] byteArray54 = base64_53.buffer;
        byte byte55 = base64_53.PAD;
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_53.buffer = byteArray57;
        byte[] byteArray64 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 61 };
        boolean boolean65 = org.apache.commons.codec.binary.Base64.isBase64(byteArray64);
        byte[] byteArray66 = base64_53.encode(byteArray64);
        base32_0.encode(byteArray64, 0, 64);
        byte[] byteArray72 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_73 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray72);
        base32_0.decode(byteArray72, 0, 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 61 + "'", byte19 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u01ff\uff00\ufffd" + "'", str40, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[31, -114, -45]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNull(byteArray54);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 61 + "'", byte55 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[0, -1, 100, 1, 61]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[65, 80, 57, 107, 65, 84, 48, 61]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray19 = base32_16.encode(byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray44);
        int int48 = base64_22.readResults(byteArray44, 0, 64);
        byte[] byteArray49 = base32_16.decode(byteArray44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) (short) 10, byteArray49);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream50, true);
        byte[] byteArray55 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_56 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray55);
        int int57 = base64InputStream50.read(byteArray55);
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray55);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u01ff\uff00\ufffd" + "'", str45, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.codec.binary.Base32 base32_0 = new org.apache.commons.codec.binary.Base32();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream(inputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2);
        boolean boolean4 = base32InputStream2.markSupported();
        byte[] byteArray8 = null;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(10, byteArray8, true);
        byte[] byteArray12 = base64_10.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream2, false, 0, byteArray12);
        base32_0.buffer = byteArray12;
        byte[] byteArray16 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray16);
        byte[] byteArray18 = base64_17.buffer;
        byte byte19 = base64_17.PAD;
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_17.buffer = byteArray21;
        byte[] byteArray26 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray26);
        org.apache.commons.codec.binary.Base32 base32_29 = new org.apache.commons.codec.binary.Base32(1, byteArray26, true);
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray26, true);
        boolean boolean33 = base64_17.isInAlphabet(byteArray26, false);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str40 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray39);
        int int43 = base64_17.readResults(byteArray39, 0, 64);
        byte[] byteArray45 = base64_17.decode("H47T6===");
        base32_0.encode(byteArray45, 0, (-1));
        java.lang.String str49 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray45);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 61 + "'", byte19 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u01ff\uff00\ufffd" + "'", str40, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[31, -114, -45]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u1f8e\ufffd" + "'", str49, "\u1f8e\ufffd");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32(10, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray20 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray21 = base64_18.encode(byteArray20);
        base32_16.encode(byteArray21, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream25 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream4, false, 0, byteArray21);
        java.lang.String str26 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray21);
        java.lang.String str27 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u01ff\uff00\ufffd" + "'", str14, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int5 = base32InputStream4.available();
        boolean boolean6 = base32InputStream4.markSupported();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        byte[] byteArray3 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3);
        org.apache.commons.codec.binary.Base32 base32_6 = new org.apache.commons.codec.binary.Base32(1, byteArray3, true);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray3, true);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream11, baseNCodec12, true);
        boolean boolean15 = baseNCodecInputStream14.markSupported();
        byte[] byteArray18 = new byte[] {};
        java.lang.String str19 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray18);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream20 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream14, false, (int) 'a', byteArray18);
        base64_10.buffer = byteArray18;
        byte[] byteArray23 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray23);
        boolean boolean26 = base64_10.isInAlphabet(byteArray23, false);
        byte[] byteArray29 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray29);
        org.apache.commons.codec.binary.Base32 base32_31 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray29);
        byte[] byteArray33 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray34 = base32_31.encode(byteArray33);
        byte[] byteArray36 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray36);
        byte[] byteArray38 = base64_37.buffer;
        byte byte39 = base64_37.PAD;
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_37.buffer = byteArray41;
        byte[] byteArray46 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_47 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray46);
        org.apache.commons.codec.binary.Base32 base32_49 = new org.apache.commons.codec.binary.Base32(1, byteArray46, true);
        org.apache.commons.codec.binary.Base64 base64_51 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray46, true);
        boolean boolean53 = base64_37.isInAlphabet(byteArray46, false);
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str60 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray59);
        int int63 = base64_37.readResults(byteArray59, 0, 64);
        byte[] byteArray64 = base32_31.decode(byteArray59);
        byte[] byteArray65 = base64_10.encode(byteArray64);
        base64_8.decode(byteArray65, 64, 0);
        byte[] byteArray70 = base64_8.decode("\r\n");
        byte[] byteArray73 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray73);
        java.lang.String str75 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray73);
        org.apache.commons.codec.binary.Base64 base64_77 = new org.apache.commons.codec.binary.Base64((int) (short) 0, byteArray73, false);
        java.io.InputStream inputStream78 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec79 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream81 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream78, baseNCodec79, true);
        boolean boolean82 = baseNCodecInputStream81.markSupported();
        byte[] byteArray86 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray87 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray86);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream88 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream81, true, 100, byteArray87);
        base64_77.decode(byteArray87, 255, (int) (byte) 0);
        base64_8.decode(byteArray87, (int) ' ', 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 61 + "'", byte39 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u01ff\uff00\ufffd" + "'", str60, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[]");
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec3 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream2, baseNCodec3, true);
        boolean boolean6 = baseNCodecInputStream5.markSupported();
        byte[] byteArray9 = new byte[] {};
        java.lang.String str10 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream5, false, (int) 'a', byteArray9);
        base64_1.buffer = byteArray9;
        int int13 = base64_1.lineLength;
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream15 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream14);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray18);
        base64OutputStream15.write(byteArray18);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream22 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream15, true);
        byte[] byteArray26 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray26);
        byte[] byteArray28 = base64_27.buffer;
        byte[] byteArray30 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_31 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray30);
        byte[] byteArray32 = base64_27.decode(byteArray30);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream33 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream22, true, (int) '4', byteArray32);
        byte[] byteArray34 = base64_1.encode(byteArray32);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray34);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray34, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 76 + "'", int13 == 76);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.io.InputStream inputStream1 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec2 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream4 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream1, baseNCodec2, true);
        boolean boolean5 = baseNCodecInputStream4.markSupported();
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream11 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream4, true, 100, byteArray10);
        org.apache.commons.codec.binary.Base32 base32_12 = new org.apache.commons.codec.binary.Base32((int) (byte) 61, byteArray10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream13 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream11, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream13);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str24 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray23);
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(10, byteArray23);
        byte[] byteArray28 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray29 = base32_26.encode(byteArray28);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream30 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream13, false, (int) (short) 100, byteArray29);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.decodeBase64("H47T6===");
        java.math.BigInteger bigInteger35 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray34);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream30, true, 0, byteArray34);
        java.io.InputStream inputStream37 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec38 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream40 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream37, baseNCodec38, true);
        boolean boolean41 = baseNCodecInputStream40.markSupported();
        byte[] byteArray44 = new byte[] {};
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray44);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream46 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream40, false, (int) 'a', byteArray44);
        byte[] byteArray51 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_52 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray51);
        org.apache.commons.codec.binary.Base32 base32_53 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray51);
        byte[] byteArray55 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray56 = base32_53.encode(byteArray55);
        byte[] byteArray58 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_59 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray58);
        byte[] byteArray60 = base64_59.buffer;
        byte byte61 = base64_59.PAD;
        byte[] byteArray63 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_59.buffer = byteArray63;
        byte[] byteArray68 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_69 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray68);
        org.apache.commons.codec.binary.Base32 base32_71 = new org.apache.commons.codec.binary.Base32(1, byteArray68, true);
        org.apache.commons.codec.binary.Base64 base64_73 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray68, true);
        boolean boolean75 = base64_59.isInAlphabet(byteArray68, false);
        byte[] byteArray81 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str82 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray81);
        int int85 = base64_59.readResults(byteArray81, 0, 64);
        byte[] byteArray86 = base32_53.decode(byteArray81);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream87 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream40, false, (int) (short) 10, byteArray86);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream89 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream87, true);
        byte[] byteArray92 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_93 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray92);
        int int94 = base64InputStream87.read(byteArray92);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = base32InputStream30.read(byteArray92, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u01ff\uff00\ufffd" + "'", str24, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[31, -114, -45]");
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNull(byteArray60);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 61 + "'", byte61 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\u01ff\uff00\ufffd" + "'", str82, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[]");
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray92), "[]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray14);
        boolean boolean18 = base32_16.isInAlphabet((byte) 0);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        org.apache.commons.codec.binary.Base32 base32_23 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray21);
        byte[] byteArray25 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray26 = base32_23.encode(byteArray25);
        long long27 = base32_16.getEncodedLength(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32InputStream base32InputStream28 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) (byte) 100, byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain Base32 characters: [H47T6===]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 16L + "'", long27 == 16L);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream13 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream11, true);
        int int14 = base32InputStream13.available();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream13, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream10 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, false);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        byte[] byteArray16 = base64_15.buffer;
        byte byte17 = base64_15.PAD;
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_15.buffer = byteArray19;
        byte[] byteArray24 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray24);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(1, byteArray24, true);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray24, true);
        boolean boolean31 = base64_15.isInAlphabet(byteArray24, false);
        int int32 = base64_15.available();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec34 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream36 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream33, baseNCodec34, true);
        boolean boolean37 = baseNCodecInputStream36.markSupported();
        byte[] byteArray40 = new byte[] {};
        java.lang.String str41 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray40);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream42 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream36, false, (int) 'a', byteArray40);
        byte[] byteArray43 = base64_15.encode(byteArray40);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, false);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream47 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream10, false, 0, byteArray46);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream48 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream47);
        byte[] byteArray52 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_53 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray52);
        byte[] byteArray54 = base64_53.buffer;
        byte byte55 = base64_53.PAD;
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_53.buffer = byteArray57;
        byte[] byteArray62 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_63 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray62);
        org.apache.commons.codec.binary.Base32 base32_65 = new org.apache.commons.codec.binary.Base32(1, byteArray62, true);
        org.apache.commons.codec.binary.Base64 base64_67 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray62, true);
        boolean boolean69 = base64_53.isInAlphabet(byteArray62, false);
        byte[] byteArray75 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str76 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray75);
        int int79 = base64_53.readResults(byteArray75, 0, 64);
        byte[] byteArray81 = base64_53.decode("\u0a0d");
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream82 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream48, false, 10, byteArray81);
        boolean boolean83 = org.apache.commons.codec.binary.Base64.isBase64(byteArray81);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 61 + "'", byte17 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNull(byteArray54);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 61 + "'", byte55 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\u01ff\uff00\ufffd" + "'", str76, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray2);
        byte[] byteArray6 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray7 = base32_4.encode(byteArray6);
        boolean boolean8 = base32_4.eof;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream11, baseNCodec12, true);
        boolean boolean15 = baseNCodecInputStream14.markSupported();
        byte[] byteArray18 = new byte[] {};
        java.lang.String str19 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray18);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream20 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream14, false, (int) 'a', byteArray18);
        base64_10.buffer = byteArray18;
        byte[] byteArray23 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray23);
        boolean boolean26 = base64_10.isInAlphabet(byteArray23, false);
        byte byte27 = base64_10.PAD;
        byte[] byteArray29 = base64_10.decode("QUQ3V0lBSjX/AQD/Cg==");
        boolean boolean30 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray29);
        boolean boolean31 = base32_4.containsAlphabetOrPad(byteArray29);
        java.lang.String str32 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray29);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 61 + "'", byte27 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[65, 68, 55, 87, 73, 65, 74, 53, -1, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4144\u3757\u4941\u4a35\uff01\377\ufffd" + "'", str32, "\u4144\u3757\u4941\u4a35\uff01\377\ufffd");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte[] byteArray5 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5);
        byte[] byteArray7 = base64_2.decode(byteArray5);
        base64_2.pos = (short) -1;
        base64_2.currentLinePos = (byte) 0;
        int int12 = base64_2.currentLinePos;
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec16 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream18 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream15, baseNCodec16, true);
        boolean boolean19 = baseNCodecInputStream18.markSupported();
        byte[] byteArray22 = new byte[] {};
        java.lang.String str23 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray22);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream24 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream18, false, (int) 'a', byteArray22);
        base64_14.buffer = byteArray22;
        byte[] byteArray26 = base64_2.encode(byteArray22);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray31 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray32 = base64_29.encode(byteArray31);
        org.apache.commons.codec.binary.Base32 base32_33 = new org.apache.commons.codec.binary.Base32(1, byteArray32);
        java.lang.String str34 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray32);
        byte[] byteArray35 = base64_2.encode(byteArray32);
        java.lang.String str36 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray32);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream9.markSupported();
        byte[] byteArray13 = new byte[] {};
        java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray13);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream15 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream9, false, (int) 'a', byteArray13);
        base64_5.buffer = byteArray13;
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray18);
        boolean boolean21 = base64_5.isInAlphabet(byteArray18, false);
        byte[] byteArray24 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray24);
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray24);
        byte[] byteArray28 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray29 = base32_26.encode(byteArray28);
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        byte[] byteArray33 = base64_32.buffer;
        byte byte34 = base64_32.PAD;
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_32.buffer = byteArray36;
        byte[] byteArray41 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_42 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray41);
        org.apache.commons.codec.binary.Base32 base32_44 = new org.apache.commons.codec.binary.Base32(1, byteArray41, true);
        org.apache.commons.codec.binary.Base64 base64_46 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray41, true);
        boolean boolean48 = base64_32.isInAlphabet(byteArray41, false);
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str55 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray54);
        int int58 = base64_32.readResults(byteArray54, 0, 64);
        byte[] byteArray59 = base32_26.decode(byteArray54);
        byte[] byteArray60 = base64_5.encode(byteArray59);
        int int61 = base64_5.getDefaultBufferSize();
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream63 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) base32InputStream3, (org.apache.commons.codec.binary.BaseNCodec) base64_5, true);
        byte[] byteArray67 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray68 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray67);
        java.lang.String str69 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(byteArray67);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream70 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream3, false, 8, byteArray67);
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray67, false, false, 8192);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNull(byteArray33);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 61 + "'", byte34 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u01ff\uff00\ufffd" + "'", str55, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 8192 + "'", int61 == 8192);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.io.InputStream inputStream1 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec2 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream4 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream1, baseNCodec2, true);
        boolean boolean5 = baseNCodecInputStream4.markSupported();
        byte[] byteArray8 = new byte[] {};
        java.lang.String str9 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray8);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream10 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream4, false, (int) 'a', byteArray8);
        byte[] byteArray15 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray15);
        org.apache.commons.codec.binary.Base32 base32_17 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray15);
        byte[] byteArray19 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray20 = base32_17.encode(byteArray19);
        byte[] byteArray22 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray22);
        byte[] byteArray24 = base64_23.buffer;
        byte byte25 = base64_23.PAD;
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_23.buffer = byteArray27;
        byte[] byteArray32 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray32);
        org.apache.commons.codec.binary.Base32 base32_35 = new org.apache.commons.codec.binary.Base32(1, byteArray32, true);
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray32, true);
        boolean boolean39 = base64_23.isInAlphabet(byteArray32, false);
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str46 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray45);
        int int49 = base64_23.readResults(byteArray45, 0, 64);
        byte[] byteArray50 = base32_17.decode(byteArray45);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream51 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream4, false, (int) (short) 10, byteArray50);
        org.apache.commons.codec.binary.Base32 base32_52 = new org.apache.commons.codec.binary.Base32((int) (byte) 61, byteArray50);
        java.lang.String str53 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 61 + "'", byte25 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\u01ff\uff00\ufffd" + "'", str46, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        org.apache.commons.codec.binary.Base32 base32_13 = new org.apache.commons.codec.binary.Base32(10, byteArray10);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray17 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray18 = base64_15.encode(byteArray17);
        base32_13.encode(byteArray18, 0, (int) (byte) 0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 61 };
        boolean boolean28 = org.apache.commons.codec.binary.Base64.isBase64(byteArray27);
        byte[] byteArray29 = base32_13.encode(byteArray27);
        int int30 = base32_13.lineLength;
        byte[] byteArray32 = null;
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(10, byteArray32, true);
        byte[] byteArray36 = base64_34.decode("\r\n");
        long long37 = base32_13.getEncodedLength(byteArray36);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = base32InputStream1.read(byteArray36, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u01ff\uff00\ufffd" + "'", str11, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, -1, 100, 1, 61]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[65, 68, 55, 87, 73, 65, 74, 53, -1, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream13 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream11, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream13);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str24 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray23);
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(10, byteArray23);
        byte[] byteArray28 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray29 = base32_26.encode(byteArray28);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream30 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream13, false, (int) (short) 100, byteArray29);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.decodeBase64("H47T6===");
        java.math.BigInteger bigInteger35 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray34);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream30, true, 0, byteArray34);
        java.io.InputStream inputStream40 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream41 = new org.apache.commons.codec.binary.Base32InputStream(inputStream40);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream42 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream41);
        int int43 = base32InputStream41.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream44 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream41);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str54 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray53);
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray53);
        org.apache.commons.codec.binary.Base32 base32_56 = new org.apache.commons.codec.binary.Base32(10, byteArray53);
        org.apache.commons.codec.binary.Base64 base64_58 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray60 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray61 = base64_58.encode(byteArray60);
        base32_56.encode(byteArray61, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream65 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream44, false, 0, byteArray61);
        org.apache.commons.codec.binary.Base32 base32_66 = new org.apache.commons.codec.binary.Base32((int) (byte) -1, byteArray61);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream67 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream36, false, (int) (byte) 10, byteArray61);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u01ff\uff00\ufffd" + "'", str24, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[31, -114, -45]");
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\u01ff\uff00\ufffd" + "'", str54, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.codec.binary.Base32 base32_0 = new org.apache.commons.codec.binary.Base32();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream(inputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream3 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2);
        boolean boolean4 = base32InputStream2.markSupported();
        byte[] byteArray8 = null;
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(10, byteArray8, true);
        byte[] byteArray12 = base64_10.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream2, false, 0, byteArray12);
        base32_0.buffer = byteArray12;
        boolean boolean16 = base32_0.isInAlphabet("_wEA_wo");
        int int17 = base32_0.available();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        byte[] byteArray1 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray1);
        byte[] byteArray3 = base64_2.buffer;
        byte[] byteArray5 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5);
        byte[] byteArray7 = base64_2.decode(byteArray5);
        base64_2.pos = (short) -1;
        base64_2.eof = true;
        boolean boolean13 = base64_2.isInAlphabet("\u0d00\u0a00");
        int int14 = base64_2.pos;
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (byte) 61);
        byte[] byteArray18 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray18);
        byte[] byteArray20 = base64_19.buffer;
        byte byte21 = base64_19.PAD;
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_19.buffer = byteArray23;
        byte[] byteArray28 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray28);
        org.apache.commons.codec.binary.Base32 base32_31 = new org.apache.commons.codec.binary.Base32(1, byteArray28, true);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray28, true);
        boolean boolean35 = base64_19.isInAlphabet(byteArray28, false);
        int int36 = base64_19.available();
        java.io.InputStream inputStream37 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec38 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream40 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream37, baseNCodec38, true);
        boolean boolean41 = baseNCodecInputStream40.markSupported();
        byte[] byteArray44 = new byte[] {};
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray44);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream46 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream40, false, (int) 'a', byteArray44);
        byte[] byteArray47 = base64_19.encode(byteArray44);
        byte[] byteArray50 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray44, false, false);
        java.lang.String str51 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byteArray50);
        byte[] byteArray52 = base64_16.decode(byteArray50);
        byte[] byteArray53 = base64_2.decode(byteArray52);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 61 + "'", byte21 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        byte[] byteArray4 = base64_3.buffer;
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray6);
        byte[] byteArray8 = base64_3.decode(byteArray6);
        boolean boolean9 = base64_3.hasData();
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        byte[] byteArray13 = base64_12.buffer;
        byte byte14 = base64_12.PAD;
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_12.buffer = byteArray16;
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32(1, byteArray21, true);
        org.apache.commons.codec.binary.Base64 base64_26 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray21, true);
        boolean boolean28 = base64_12.isInAlphabet(byteArray21, false);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str35 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray34);
        int int38 = base64_12.readResults(byteArray34, 0, 64);
        byte[] byteArray40 = base64_12.decode("\u0a0d");
        java.io.InputStream inputStream41 = null;
        byte[] byteArray43 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_44 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray43);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream46 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream41, (org.apache.commons.codec.binary.BaseNCodec) base64_44, true);
        int int47 = base64_44.getDefaultBufferSize();
        java.io.OutputStream outputStream48 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream49 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream48);
        byte[] byteArray52 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_53 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray52);
        base64OutputStream49.write(byteArray52);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream56 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream49, true);
        byte[] byteArray60 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_61 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray60);
        byte[] byteArray62 = base64_61.buffer;
        byte[] byteArray64 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_65 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray64);
        byte[] byteArray66 = base64_61.decode(byteArray64);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream67 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream56, true, (int) '4', byteArray66);
        boolean boolean69 = base64_44.isInAlphabet(byteArray66, true);
        byte[] byteArray70 = base64_12.decode(byteArray66);
        boolean boolean72 = base64_3.isInAlphabet(byteArray70, false);
        org.apache.commons.codec.binary.Base32 base32_73 = new org.apache.commons.codec.binary.Base32((int) (short) -1, byteArray70);
        java.lang.String str74 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray70);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 61 + "'", byte14 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u01ff\uff00\ufffd" + "'", str35, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8192 + "'", int47 == 8192);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertNull(byteArray62);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean3 = base64_1.isInAlphabet("\u01ff\uff00\ufffd");
        boolean boolean4 = base64_1.isUrlSafe();
        boolean boolean6 = base64_1.isInAlphabet((byte) 61);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream8 = new org.apache.commons.codec.binary.Base32InputStream(inputStream7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream8);
        boolean boolean10 = base32InputStream8.markSupported();
        byte[] byteArray14 = null;
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64(10, byteArray14, true);
        byte[] byteArray18 = base64_16.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream19 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream8, false, 0, byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        int int39 = base64_22.available();
        java.io.InputStream inputStream40 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec41 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream43 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream40, baseNCodec41, true);
        boolean boolean44 = baseNCodecInputStream43.markSupported();
        byte[] byteArray47 = new byte[] {};
        java.lang.String str48 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray47);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream49 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream43, false, (int) 'a', byteArray47);
        byte[] byteArray50 = base64_22.encode(byteArray47);
        int int51 = base32InputStream8.read(byteArray47);
        long long52 = base64_1.getEncodedLength(byteArray47);
        java.io.OutputStream outputStream53 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream54 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream53);
        byte[] byteArray57 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_58 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray57);
        base64OutputStream54.write(byteArray57);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream61 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream54, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream62 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream61);
        byte[] byteArray67 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_68 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray67);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream69 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream61, false, 100, byteArray67);
        byte[] byteArray70 = base64_1.decode(byteArray67);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[]");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(10, byteArray1, true);
        byte[] byteArray5 = base64_3.decode("\r\n");
        base64_3.pos = 0;
        base64_3.pos = 1;
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec13 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream15 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream12, baseNCodec13, true);
        boolean boolean16 = baseNCodecInputStream15.markSupported();
        byte[] byteArray19 = new byte[] {};
        java.lang.String str20 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray19);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream21 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream15, false, (int) 'a', byteArray19);
        base64_11.buffer = byteArray19;
        int int23 = base64_11.lineLength;
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream25 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream24);
        byte[] byteArray28 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_29 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray28);
        base64OutputStream25.write(byteArray28);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream32 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream25, true);
        byte[] byteArray36 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray36);
        byte[] byteArray38 = base64_37.buffer;
        byte[] byteArray40 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_41 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray40);
        byte[] byteArray42 = base64_37.decode(byteArray40);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream43 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream32, true, (int) '4', byteArray42);
        byte[] byteArray44 = base64_11.encode(byteArray42);
        base64_3.encode(byteArray44, 8, (int) (byte) 0);
        java.lang.Object obj49 = base64_3.decode((java.lang.Object) "\n\u3d00");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 76 + "'", int23 == 76);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        boolean boolean3 = base32InputStream1.markSupported();
        int int4 = base32InputStream1.available();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream9 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream8);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream11 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream9, true);
        base32OutputStream9.write((int) '4');
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream14 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream9);
        byte[] byteArray18 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray18);
        byte[] byteArray20 = base64_19.buffer;
        byte byte21 = base64_19.PAD;
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_19.buffer = byteArray23;
        byte[] byteArray28 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray28);
        org.apache.commons.codec.binary.Base32 base32_31 = new org.apache.commons.codec.binary.Base32(1, byteArray28, true);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray28, true);
        boolean boolean35 = base64_19.isInAlphabet(byteArray28, false);
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str42 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray41);
        int int45 = base64_19.readResults(byteArray41, 0, 64);
        boolean boolean47 = base64_19.isInAlphabet((byte) 61);
        java.io.InputStream inputStream48 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream49 = new org.apache.commons.codec.binary.Base32InputStream(inputStream48);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream50 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream49);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream52 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream50, true);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray54);
        int int56 = base32InputStream52.read(byteArray54);
        boolean boolean57 = org.apache.commons.codec.binary.Base64.isBase64(byteArray54);
        boolean boolean59 = base64_19.isInAlphabet(byteArray54, false);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream60 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream9, true, 0, byteArray54);
        // The following exception was thrown during execution in test generation
        try {
            base32OutputStream9.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 61 + "'", byte21 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u01ff\uff00\ufffd" + "'", str42, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        boolean boolean3 = base32InputStream1.markSupported();
        boolean boolean4 = base32InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream5 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream1);
        // The following exception was thrown during execution in test generation
        try {
            base32InputStream1.mark(64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        boolean boolean7 = base64_3.isInAlphabet((byte) 1);
        base64_3.modulus = (byte) -1;
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean3 = base64_1.isInAlphabet("\u01ff\uff00\ufffd");
        boolean boolean4 = base64_1.isUrlSafe();
        boolean boolean6 = base64_1.isInAlphabet((byte) 61);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream8 = new org.apache.commons.codec.binary.Base32InputStream(inputStream7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream8);
        boolean boolean10 = base32InputStream8.markSupported();
        byte[] byteArray14 = null;
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64(10, byteArray14, true);
        byte[] byteArray18 = base64_16.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream19 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream8, false, 0, byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        int int39 = base64_22.available();
        java.io.InputStream inputStream40 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec41 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream43 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream40, baseNCodec41, true);
        boolean boolean44 = baseNCodecInputStream43.markSupported();
        byte[] byteArray47 = new byte[] {};
        java.lang.String str48 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray47);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream49 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream43, false, (int) 'a', byteArray47);
        byte[] byteArray50 = base64_22.encode(byteArray47);
        int int51 = base32InputStream8.read(byteArray47);
        long long52 = base64_1.getEncodedLength(byteArray47);
        base64_1.currentLinePos = (short) -1;
        byte[] byteArray56 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray56);
        java.lang.String str58 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byteArray57);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray57);
        base64_1.buffer = byteArray59;
        boolean boolean62 = base64_1.isInAlphabet("\377\001\000\377\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2, true);
        byte[] byteArray7 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray7);
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32(1, byteArray7, true);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) base32InputStream2, (org.apache.commons.codec.binary.BaseNCodec) base32_10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream12, true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream10 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, false);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        byte[] byteArray16 = base64_15.buffer;
        byte byte17 = base64_15.PAD;
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_15.buffer = byteArray19;
        byte[] byteArray24 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray24);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(1, byteArray24, true);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray24, true);
        boolean boolean31 = base64_15.isInAlphabet(byteArray24, false);
        int int32 = base64_15.available();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec34 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream36 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream33, baseNCodec34, true);
        boolean boolean37 = baseNCodecInputStream36.markSupported();
        byte[] byteArray40 = new byte[] {};
        java.lang.String str41 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray40);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream42 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream36, false, (int) 'a', byteArray40);
        byte[] byteArray43 = base64_15.encode(byteArray40);
        byte[] byteArray46 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray40, false, false);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream47 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream10, false, 0, byteArray46);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream48 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream47);
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str57 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray56);
        byte[] byteArray58 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray56);
        byte[] byteArray61 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray58, false, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream62 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream47, false, (int) (short) 0, byteArray58);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream64 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream62, false);
        base32OutputStream62.write(8);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 61 + "'", byte17 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u01ff\uff00\ufffd" + "'", str57, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[88, 51, 100, 70, 81, 86, 57, 51, 98, 119]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base64InputStream10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream13 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream11, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream13);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str22 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray21);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32(10, byteArray21);
        byte[] byteArray26 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16("");
        byte[] byteArray27 = base32_24.encode(byteArray26);
        boolean boolean29 = base32_24.isInAlphabet((byte) 61);
        base32_24.eof = true;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream33 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) base64InputStream14, (org.apache.commons.codec.binary.BaseNCodec) base32_24, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u01ff\uff00\ufffd" + "'", str22, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean3 = base64_1.isInAlphabet("\u01ff\uff00\ufffd");
        boolean boolean4 = base64_1.isUrlSafe();
        boolean boolean6 = base64_1.isInAlphabet((byte) 61);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream8 = new org.apache.commons.codec.binary.Base32InputStream(inputStream7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream8);
        boolean boolean10 = base32InputStream8.markSupported();
        byte[] byteArray14 = null;
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64(10, byteArray14, true);
        byte[] byteArray18 = base64_16.decode("\r\n");
        org.apache.commons.codec.binary.Base64InputStream base64InputStream19 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream8, false, 0, byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        int int39 = base64_22.available();
        java.io.InputStream inputStream40 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec41 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream43 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream40, baseNCodec41, true);
        boolean boolean44 = baseNCodecInputStream43.markSupported();
        byte[] byteArray47 = new byte[] {};
        java.lang.String str48 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray47);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream49 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream43, false, (int) 'a', byteArray47);
        byte[] byteArray50 = base64_22.encode(byteArray47);
        int int51 = base32InputStream8.read(byteArray47);
        long long52 = base64_1.getEncodedLength(byteArray47);
        byte[] byteArray54 = base64_1.decode("\u01ff\uff00\ufffd");
        base64_1.eof = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray19 = base32_16.encode(byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray44);
        int int48 = base64_22.readResults(byteArray44, 0, 64);
        byte[] byteArray49 = base32_16.decode(byteArray44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) (short) 10, byteArray49);
        boolean boolean51 = baseNCodecInputStream3.markSupported();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u01ff\uff00\ufffd" + "'", str45, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray2);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, (org.apache.commons.codec.binary.BaseNCodec) base64_3, true);
        boolean boolean7 = base64_3.isInAlphabet((byte) 1);
        byte[] byteArray9 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("org.apache.commons.codec.DecoderException: ");
        java.lang.String str10 = base64_3.encodeAsString(byteArray9);
        boolean boolean12 = base64_3.isInAlphabet((byte) 61);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 111, 0, 114, 0, 103, 0, 46, 0, 97, 0, 112, 0, 97, 0, 99, 0, 104, 0, 101, 0, 46, 0, 99, 0, 111, 0, 109, 0, 109, 0, 111, 0, 110, 0, 115, 0, 46, 0, 99, 0, 111, 0, 100, 0, 101, 0, 99, 0, 46, 0, 68, 0, 101, 0, 99, 0, 111, 0, 100, 0, 101, 0, 114, 0, 69, 0, 120, 0, 99, 0, 101, 0, 112, 0, 116, 0, 105, 0, 111, 0, 110, 0, 58, 0, 32]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AG8AcgBnAC4AYQBwAGEAYwBoAGUALgBjAG8AbQBtAG8AbgBzAC4AYwBvAGQAZQBjAC4ARABlAGMAbwBkAGUAcgBFAHgAYwBlAHAAdABpAG8AbgA6ACA=" + "'", str10, "AG8AcgBnAC4AYQBwAGEAYwBoAGUALgBjAG8AbQBtAG8AbgBzAC4AYwBvAGQAZQBjAC4ARABlAGMAbwBkAGUAcgBFAHgAYwBlAHAAdABpAG8AbgA6ACA=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11);
        boolean boolean13 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray11);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, true);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = baseNCodecInputStream3.read(byteArray11, 100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream1 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream0);
        byte[] byteArray4 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray4);
        base64OutputStream1.write(byteArray4);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream8 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream1, true);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream9 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream8);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream11 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream9, true);
        base32OutputStream9.write((int) '4');
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream14 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream9);
        byte[] byteArray18 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray18);
        byte[] byteArray20 = base64_19.buffer;
        byte byte21 = base64_19.PAD;
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_19.buffer = byteArray23;
        byte[] byteArray28 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray28);
        org.apache.commons.codec.binary.Base32 base32_31 = new org.apache.commons.codec.binary.Base32(1, byteArray28, true);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray28, true);
        boolean boolean35 = base64_19.isInAlphabet(byteArray28, false);
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str42 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray41);
        int int45 = base64_19.readResults(byteArray41, 0, 64);
        boolean boolean47 = base64_19.isInAlphabet((byte) 61);
        java.io.InputStream inputStream48 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream49 = new org.apache.commons.codec.binary.Base32InputStream(inputStream48);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream50 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream49);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream52 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream50, true);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray55 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray54);
        int int56 = base32InputStream52.read(byteArray54);
        boolean boolean57 = org.apache.commons.codec.binary.Base64.isBase64(byteArray54);
        boolean boolean59 = base64_19.isInAlphabet(byteArray54, false);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream60 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base32OutputStream9, true, 0, byteArray54);
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.decodeBase64("_wEA_wo");
        java.math.BigInteger bigInteger65 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray64);
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream66 = new org.apache.commons.codec.binary.Base64OutputStream((java.io.OutputStream) base64OutputStream60, false, (int) (byte) -1, byteArray64);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 61 + "'", byte21 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u01ff\uff00\ufffd" + "'", str42, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertNotNull(bigInteger65);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(10, byteArray1, true);
        byte[] byteArray5 = base64_3.decode("\r\n");
        base64_3.pos = 0;
        base64_3.pos = 1;
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec13 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream15 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream12, baseNCodec13, true);
        boolean boolean16 = baseNCodecInputStream15.markSupported();
        byte[] byteArray19 = new byte[] {};
        java.lang.String str20 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray19);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream21 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream15, false, (int) 'a', byteArray19);
        base64_11.buffer = byteArray19;
        int int23 = base64_11.lineLength;
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.codec.binary.Base64OutputStream base64OutputStream25 = new org.apache.commons.codec.binary.Base64OutputStream(outputStream24);
        byte[] byteArray28 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("");
        org.apache.commons.codec.binary.Base32 base32_29 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray28);
        base64OutputStream25.write(byteArray28);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream32 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base64OutputStream25, true);
        byte[] byteArray36 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray36);
        byte[] byteArray38 = base64_37.buffer;
        byte[] byteArray40 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_41 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray40);
        byte[] byteArray42 = base64_37.decode(byteArray40);
        org.apache.commons.codec.binary.Base32OutputStream base32OutputStream43 = new org.apache.commons.codec.binary.Base32OutputStream((java.io.OutputStream) base32OutputStream32, true, (int) '4', byteArray42);
        byte[] byteArray44 = base64_11.encode(byteArray42);
        base64_3.encode(byteArray44, 8, (int) (byte) 0);
        boolean boolean49 = base64_3.isInAlphabet((byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 76 + "'", int23 == 76);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        boolean boolean5 = base32InputStream1.markSupported();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream11 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream11, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream3, baseNCodec4, true);
        boolean boolean7 = baseNCodecInputStream6.markSupported();
        byte[] byteArray10 = new byte[] {};
        java.lang.String str11 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray10);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream12 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream6, false, (int) 'a', byteArray10);
        base64_2.buffer = byteArray10;
        byte[] byteArray15 = base64_2.decode("AAo9AA");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64(255, byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain base64 characters: [??=?]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 10, 61, 0]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray7 = new byte[] {};
        java.lang.String str8 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(byteArray7);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream9 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) 'a', byteArray7);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (byte) 1, byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1("\u01ff\uff00\ufffd");
        byte[] byteArray19 = base32_16.encode(byteArray18);
        byte[] byteArray21 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray21);
        byte[] byteArray23 = base64_22.buffer;
        byte byte24 = base64_22.PAD;
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_22.buffer = byteArray26;
        byte[] byteArray31 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray31);
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32(1, byteArray31, true);
        org.apache.commons.codec.binary.Base64 base64_36 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray31, true);
        boolean boolean38 = base64_22.isInAlphabet(byteArray31, false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str45 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray44);
        int int48 = base64_22.readResults(byteArray44, 0, 64);
        byte[] byteArray49 = base32_16.decode(byteArray44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, false, (int) (short) 10, byteArray49);
        byte[] byteArray53 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream54 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream50, true, (int) (byte) -1, byteArray53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[63, 63, 63]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[72, 52, 55, 84, 54, 61, 61, 61]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 61 + "'", byte24 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u01ff\uff00\ufffd" + "'", str45, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        int int3 = base32InputStream1.available();
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.lang.String str14 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32(10, byteArray13);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray20 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be("");
        byte[] byteArray21 = base64_18.encode(byteArray20);
        base32_16.encode(byteArray21, 0, (int) (byte) 0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream25 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream4, false, 0, byteArray21);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream27 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base32InputStream25, false);
        // The following exception was thrown during execution in test generation
        try {
            base32InputStream25.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 0, -1, 10]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u01ff\uff00\ufffd" + "'", str14, "\u01ff\uff00\ufffd");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[95, 119, 69, 65, 95, 119, 111]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) baseNCodecInputStream3, true, 100, byteArray9);
        boolean boolean11 = base64InputStream10.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = base64InputStream12.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base32InputStream base32InputStream1 = new org.apache.commons.codec.binary.Base32InputStream(inputStream0);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream2 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream1);
        org.apache.commons.codec.binary.Base32InputStream base32InputStream4 = new org.apache.commons.codec.binary.Base32InputStream((java.io.InputStream) base32InputStream2, true);
        boolean boolean5 = base32InputStream2.markSupported();
        byte[] byteArray7 = new byte[] {};
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray7);
        byte[] byteArray9 = base64_8.buffer;
        byte byte10 = base64_8.PAD;
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        base64_8.buffer = byteArray12;
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 61 };
        boolean boolean20 = org.apache.commons.codec.binary.Base64.isBase64(byteArray19);
        byte[] byteArray21 = base64_8.encode(byteArray19);
        boolean boolean23 = base64_8.isInAlphabet((byte) 61);
        boolean boolean25 = base64_8.isInAlphabet((byte) 10);
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream27 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) base32InputStream2, (org.apache.commons.codec.binary.BaseNCodec) base64_8, true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 61 + "'", byte10 == (byte) 61);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, -1, 100, 1, 61]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[65, 80, 57, 107, 65, 84, 48, 61]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }
}

