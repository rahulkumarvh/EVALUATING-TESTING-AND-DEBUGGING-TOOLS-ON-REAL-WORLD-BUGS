package org.apache.commons.codec.language;

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
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        java.lang.String str3 = soundex1.encode("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(172);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str5 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        int int8 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "O000");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O", "");
        java.lang.String str13 = soundex0.encode("org.apache.commons.codec.EncoderException: O000");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str16 = soundex14.encode("");
        java.lang.String str18 = soundex14.encode("01230120022455012623010202");
        int int19 = soundex14.getMaxLength();
        java.lang.String str21 = soundex14.soundex("01230120022455012623010202");
        java.lang.Object obj22 = soundex0.encode((java.lang.Object) str21);
        java.lang.String str24 = soundex0.encode("org.apache.commons.codec.EncoderException: HI");
        org.junit.Assert.assertNotNull(soundex0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "O621" + "'", str24, "O621");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int6 = soundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = soundex0.getMaxLength();
        java.lang.Throwable throwable9 = null;
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("", throwable9);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException10);
        java.lang.Throwable throwable13 = null;
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("", throwable13);
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        java.lang.Throwable[] throwableArray16 = encoderException15.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException15);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException15);
        encoderException10.addSuppressed((java.lang.Throwable) encoderException15);
        java.lang.Throwable[] throwableArray20 = encoderException10.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex0.encode((java.lang.Object) encoderException10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        char[] charArray4 = new char[] { '#', '#', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(4);
        int int8 = soundex5.getMaxLength();
        java.lang.Throwable throwable12 = null;
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("", throwable12);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException13);
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("OOCO", (java.lang.Throwable) encoderException15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex5.encode((java.lang.Object) "OOCO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.soundex("");
        java.lang.String str7 = soundex0.encode("org.apache.commons.codec.EncoderException: HI");
        int int10 = soundex0.difference("", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.Throwable throwable13 = null;
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("", throwable13);
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        java.lang.Throwable[] throwableArray16 = encoderException15.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException15);
        java.lang.Throwable[] throwableArray18 = encoderException15.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException15);
        java.lang.Throwable throwable22 = null;
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("", throwable22);
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException23);
        java.lang.Throwable[] throwableArray25 = encoderException24.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException24);
        java.lang.Throwable[] throwableArray27 = encoderException26.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException26);
        encoderException15.addSuppressed((java.lang.Throwable) encoderException28);
        java.lang.Throwable[] throwableArray30 = encoderException28.getSuppressed();
        java.lang.Throwable throwable34 = null;
        org.apache.commons.codec.EncoderException encoderException35 = new org.apache.commons.codec.EncoderException("", throwable34);
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException35);
        java.lang.Throwable[] throwableArray37 = encoderException36.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException38 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException36);
        java.lang.Throwable[] throwableArray39 = encoderException36.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException36);
        org.apache.commons.codec.EncoderException encoderException41 = new org.apache.commons.codec.EncoderException("O621", (java.lang.Throwable) encoderException40);
        java.lang.Throwable[] throwableArray42 = encoderException40.getSuppressed();
        encoderException28.addSuppressed((java.lang.Throwable) encoderException40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = soundex0.encode((java.lang.Object) encoderException40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O621" + "'", str7, "O621");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex10, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "org.apache.commons.codec.EncoderException: Hh00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , 4, #,  ]");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("H");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("O000");
        soundex1.setMaxLength((int) (short) 10);
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str14 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O621" + "'", str14, "O621");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength(2);
        int int4 = soundex1.getMaxLength();
        int int5 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) '4');
        java.lang.String str5 = soundex1.soundex("");
        int int6 = soundex1.getMaxLength();
        int int7 = soundex1.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex1.soundex("org.apache.commons.codec.EncoderException: Hh00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTION", "hi!");
        int int9 = soundex1.difference("Hh00", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex1.setMaxLength((int) (byte) 1);
        soundex1.setMaxLength(32);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int16 = soundex15.getMaxLength();
        java.lang.String str18 = soundex15.encode("Hh00");
        java.lang.String str20 = soundex15.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: O000");
        java.lang.Object obj23 = soundex15.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: O000");
        java.lang.Object obj24 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: O000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Osao" + "'", str20, "Osao");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "Osao" + "'", obj23, "Osao");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "Osao" + "'", obj24, "Osao");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("Osao");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str9 = soundex1.encode("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O.om" + "'", str3, "O.om");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Osao" + "'", str7, "Osao");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Class<?> wildcardClass2 = soundex1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) ' ');
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        int int9 = soundex1.getMaxLength();
        int int10 = soundex1.getMaxLength();
        int int13 = soundex1.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONO", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONO");
        java.lang.String str15 = soundex1.soundex("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        soundex7.setMaxLength((int) (byte) 1);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str13 = soundex11.encode("Osao");
        java.lang.String str15 = soundex11.encode("01230120022455012623010202");
        java.lang.String str17 = soundex11.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str19 = soundex11.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex7.encode((java.lang.Object) soundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O.om" + "'", str13, "O.om");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Osao" + "'", str17, "Osao");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str5 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.Throwable throwable9 = null;
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("", throwable9);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException10);
        java.lang.Throwable[] throwableArray12 = encoderException11.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException11);
        java.lang.Throwable[] throwableArray14 = encoderException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = encoderException13.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException13);
        java.lang.Throwable[] throwableArray17 = encoderException13.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException13);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex0.encode((java.lang.Object) encoderException13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str8 = soundex0.encode("HI");
        int int11 = soundex0.difference("O.om", "O000");
        soundex0.setMaxLength((int) (byte) 10);
        java.lang.String str15 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O621" + "'", str15, "O621");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex1.setMaxLength((int) (short) -1);
        java.lang.String str7 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str9 = soundex1.soundex("HH");
        java.lang.String str11 = soundex1.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("Osao");
        java.lang.Throwable throwable16 = null;
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("", throwable16);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException17);
        java.lang.Throwable[] throwableArray19 = encoderException18.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException18);
        java.lang.Throwable[] throwableArray21 = encoderException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = encoderException20.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException20);
        encoderException13.addSuppressed((java.lang.Throwable) encoderException23);
        java.lang.Throwable[] throwableArray25 = encoderException13.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex1.encode((java.lang.Object) encoderException13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Osao" + "'", str7, "Osao");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Osao" + "'", str11, "Osao");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.String str9 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        soundex0.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O621" + "'", str9, "O621");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) '4');
        java.lang.String str5 = soundex1.soundex("");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "", "");
        soundex1.setMaxLength((int) (byte) 0);
        int int11 = soundex1.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = soundex1.difference("org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: OOCO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str4 = soundex0.soundex("O200");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("OOCO");
        int int10 = soundex0.getMaxLength();
        java.lang.Throwable throwable14 = null;
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("", throwable14);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", throwable14);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("", throwable19);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException20);
        java.lang.Throwable throwable24 = null;
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("", throwable24);
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException25);
        java.lang.Throwable[] throwableArray27 = encoderException26.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException26);
        encoderException21.addSuppressed((java.lang.Throwable) encoderException26);
        java.lang.Throwable throwable31 = null;
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException("", throwable31);
        org.apache.commons.codec.EncoderException encoderException33 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException32);
        java.lang.Throwable[] throwableArray34 = encoderException33.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException35 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException33);
        encoderException21.addSuppressed((java.lang.Throwable) encoderException35);
        org.apache.commons.codec.EncoderException encoderException37 = new org.apache.commons.codec.EncoderException("O200", (java.lang.Throwable) encoderException35);
        java.lang.Throwable throwable39 = null;
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException("", throwable39);
        org.apache.commons.codec.EncoderException encoderException41 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException40);
        java.lang.Throwable[] throwableArray42 = encoderException41.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException43 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException41);
        java.lang.Throwable[] throwableArray44 = encoderException41.getSuppressed();
        java.lang.Throwable throwable46 = null;
        org.apache.commons.codec.EncoderException encoderException47 = new org.apache.commons.codec.EncoderException("", throwable46);
        org.apache.commons.codec.EncoderException encoderException48 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException47);
        java.lang.Throwable throwable51 = null;
        org.apache.commons.codec.EncoderException encoderException52 = new org.apache.commons.codec.EncoderException("", throwable51);
        org.apache.commons.codec.EncoderException encoderException53 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException52);
        java.lang.Throwable[] throwableArray54 = encoderException53.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException55 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException53);
        encoderException48.addSuppressed((java.lang.Throwable) encoderException53);
        encoderException41.addSuppressed((java.lang.Throwable) encoderException53);
        org.apache.commons.codec.EncoderException encoderException58 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException41);
        org.apache.commons.codec.EncoderException encoderException59 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException41);
        encoderException37.addSuppressed((java.lang.Throwable) encoderException41);
        encoderException16.addSuppressed((java.lang.Throwable) encoderException41);
        org.apache.commons.codec.EncoderException encoderException62 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = soundex0.encode((java.lang.Object) encoderException62);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O200" + "'", str9, "O200");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str12 = soundex1.soundex("H000");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException", "01230120022455012623010202");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "", "O");
        soundex1.setMaxLength(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int9 = soundex1.getMaxLength();
        java.lang.String str11 = soundex1.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: O.om");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Osao" + "'", str11, "Osao");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        char[] charArray4 = new char[] { '#', '#', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength(2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #,  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str10 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str12 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Osao" + "'", str12, "Osao");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("O621");
        soundex1.setMaxLength((int) (byte) -1);
        int int4 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.Throwable throwable5 = null;
        org.apache.commons.codec.EncoderException encoderException6 = new org.apache.commons.codec.EncoderException("", throwable5);
        org.apache.commons.codec.EncoderException encoderException7 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException6);
        java.lang.Throwable[] throwableArray8 = encoderException7.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException7);
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException7);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException7);
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex0.encode((java.lang.Object) encoderException11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex8, "OO", "org.apache.commons.codec.EncoderException: O");
        java.lang.Object obj12 = soundex1.encode((java.lang.Object) "OO");
        soundex1.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "O000" + "'", obj12, "O000");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("O200");
        java.lang.String str6 = soundex1.soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        char[] charArray13 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        soundex14.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex1.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , 4, #,  ]");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex1.setMaxLength((int) (short) -1);
        soundex1.setMaxLength((int) '4');
        java.lang.String str9 = soundex1.soundex("O.om");
        soundex1.setMaxLength((int) (short) -1);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.Class<?> wildcardClass14 = soundex13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex1.encode((java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Oo00" + "'", str9, "Oo00");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = soundex8.encode((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , 4, #,  ]");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: O.om", "O");
        java.lang.String str8 = soundex1.soundex("");
        java.lang.String str10 = soundex1.encode("O500");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OOCO" + "'", str3, "OOCO");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O000" + "'", str10, "O000");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str4 = soundex0.soundex("O200");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("");
        int int8 = soundex0.getMaxLength();
        java.lang.Throwable throwable12 = null;
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("", throwable12);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException13);
        java.lang.Throwable[] throwableArray15 = encoderException14.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", (java.lang.Throwable) encoderException18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex0.encode((java.lang.Object) encoderException18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int6 = soundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = soundex0.encode("Oo00");
        int int11 = soundex0.difference("", "01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O000" + "'", str8, "O000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) '4');
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) (byte) 1);
        org.apache.commons.codec.language.SoundexUtils soundexUtils8 = new org.apache.commons.codec.language.SoundexUtils();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = soundex1.encode((java.lang.Object) soundexUtils8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) ' ');
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str8 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex12.setMaxLength((int) 'a');
        int int15 = soundex12.getMaxLength();
        soundex12.setMaxLength((int) ' ');
        java.lang.String str19 = soundex12.encode("");
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex21.setMaxLength((int) 'a');
        int int24 = soundex21.getMaxLength();
        soundex21.setMaxLength((int) ' ');
        java.lang.String str28 = soundex21.encode("");
        int int31 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex21, "", "org.apache.commons.codec.EncoderException: hi!");
        java.lang.Object obj32 = soundex12.encode((java.lang.Object) "");
        int int33 = soundex12.getMaxLength();
        soundex12.setMaxLength((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex0.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O621" + "'", str8, "O621");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.encode("");
        java.lang.String str7 = soundex1.soundex("");
        java.lang.String str9 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O621" + "'", str9, "O621");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        int int9 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "O.om");
        java.lang.String str11 = soundex1.encode("H000");
        soundex1.setMaxLength(0);
        java.lang.String str15 = soundex1.encode("HI");
        java.lang.String str17 = soundex1.encode("org.apache.commons.codec.EncoderException: OOCO");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hh00" + "'", str15, "Hh00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Osao" + "'", str17, "Osao");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        int int11 = soundex0.difference("Osao", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O", "O.om");
        java.lang.String str9 = soundex0.soundex("O200");
        java.lang.Class<?> wildcardClass10 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O000" + "'", str9, "O000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("org.apache.commons.codec.EncoderException: O.om");
        java.lang.String str13 = soundex0.encode("org.apache.commons.codec.EncoderException: O.om");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str5 = soundex3.encode("01230120022455012623010202");
        soundex3.setMaxLength(0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str5 = soundex0.soundex("");
        java.lang.String str7 = soundex0.encode("O621");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "O000");
        int int11 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        java.lang.Object obj5 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = soundex1.soundex("H000");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Osao" + "'", obj5, "Osao");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int4 = soundex1.getMaxLength();
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "HI", "");
        java.lang.Object obj9 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex1.encode(obj10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "Hh00" + "'", obj9, "Hh00");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength((int) (byte) 100);
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O000", "Hh00");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int4 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "OO", "org.apache.commons.codec.EncoderException: O");
        int int5 = soundex1.getMaxLength();
        java.lang.String str7 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOCO");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OOCO" + "'", str7, "OOCO");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str12 = soundex1.soundex("H000");
        java.lang.String str14 = soundex1.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.Throwable throwable17 = null;
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("", throwable17);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException18);
        java.lang.Throwable[] throwableArray20 = encoderException19.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex1.encode((java.lang.Object) encoderException21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Osao" + "'", str14, "Osao");
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("OSAO");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = soundex1.difference("OOM", "org.apache.commons.codec.EncoderException: Hh00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        java.lang.Object obj5 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = soundex1.encode("O200");
        int int10 = soundex1.difference("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "OM00");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Osao" + "'", obj5, "Osao");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str3 = soundex1.encode("Hh00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int9 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '4');
        java.lang.String str13 = soundex1.encode("Osao");
        java.lang.String str15 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int16 = soundex1.getMaxLength();
        int int17 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O.om" + "'", str13, "O.om");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Osao" + "'", str15, "Osao");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str5 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        int int8 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "O000");
        java.lang.String str10 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str12 = soundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertNotNull(soundex0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O621" + "'", str10, "O621");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex1.setMaxLength((int) (short) -1);
        soundex1.setMaxLength((int) '4');
        int int8 = soundex1.getMaxLength();
        java.lang.String str10 = soundex1.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.String str12 = soundex1.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.Throwable throwable15 = null;
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("", throwable15);
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException16);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("hi!", throwable19);
        encoderException17.addSuppressed((java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", (java.lang.Throwable) encoderException20);
        java.lang.Object obj23 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Osao" + "'", str12, "Osao");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "Osao" + "'", obj23, "Osao");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray6);
        int int11 = soundex10.getMaxLength();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , 4, #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str5 = soundex3.encode("01230120022455012623010202");
        soundex3.setMaxLength((int) (short) 0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength((int) (byte) 100);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray12 = encoderException11.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("");
        encoderException11.addSuppressed((java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException11);
        java.lang.Object obj17 = soundex0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex0.encode(obj18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "O621" + "'", obj17, "O621");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Object obj6 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex1.setMaxLength((int) '#');
        int int9 = soundex1.getMaxLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "O621" + "'", obj6, "O621");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.encode("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTION", "hi!");
        soundex1.setMaxLength(2);
        int int11 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "Hh00");
        java.lang.String str13 = soundex1.encode("org.apache.commons.codec.EncoderException: Hh00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Osao" + "'", str13, "Osao");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        soundex0.setMaxLength((int) '4');
        org.junit.Assert.assertNotNull(soundex0);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        int int2 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        java.lang.Object obj5 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.Soundex soundex6 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int7 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) (byte) -1);
        java.lang.String str11 = soundex6.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        java.lang.Object obj12 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        java.lang.String str14 = soundex1.soundex("OOM");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Osao" + "'", obj5, "Osao");
        org.junit.Assert.assertNotNull(soundex6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "Osao" + "'", obj12, "Osao");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Oo00" + "'", str14, "Oo00");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex1.setMaxLength(100);
        java.lang.String str7 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O621" + "'", str7, "O621");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.soundex("HI");
        java.lang.String str12 = soundex1.soundex("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hh00" + "'", str10, "Hh00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str5 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int8 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM", "org.apache.commons.codec.EncoderException: O.om");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.String str13 = soundex0.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertNotNull(soundex0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("HI");
        java.lang.String str9 = soundex0.soundex("O");
        int int12 = soundex0.difference("OSAO", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: O.om");
        org.junit.Assert.assertNotNull(soundex0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 43 + "'", int5 == 43);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O000" + "'", str9, "O000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str10 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength(4);
        java.lang.String str14 = soundex0.encode("O200");
        java.lang.String str16 = soundex0.soundex("O200");
        soundex0.setMaxLength(43);
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: O", "O200");
        java.lang.String str23 = soundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.Throwable throwable25 = null;
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("hi!", throwable25);
        java.lang.Throwable throwable28 = null;
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException("", throwable28);
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException29);
        java.lang.Throwable[] throwableArray31 = encoderException30.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException30);
        java.lang.Throwable[] throwableArray33 = encoderException30.getSuppressed();
        java.lang.Throwable throwable35 = null;
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException("", throwable35);
        org.apache.commons.codec.EncoderException encoderException37 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException36);
        java.lang.Throwable throwable40 = null;
        org.apache.commons.codec.EncoderException encoderException41 = new org.apache.commons.codec.EncoderException("", throwable40);
        org.apache.commons.codec.EncoderException encoderException42 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException41);
        java.lang.Throwable[] throwableArray43 = encoderException42.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException44 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException42);
        encoderException37.addSuppressed((java.lang.Throwable) encoderException42);
        encoderException30.addSuppressed((java.lang.Throwable) encoderException42);
        org.apache.commons.codec.EncoderException encoderException49 = new org.apache.commons.codec.EncoderException("O621");
        org.apache.commons.codec.EncoderException encoderException50 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException49);
        org.apache.commons.codec.EncoderException encoderException51 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException50);
        java.lang.Throwable throwable54 = null;
        org.apache.commons.codec.EncoderException encoderException55 = new org.apache.commons.codec.EncoderException("", throwable54);
        org.apache.commons.codec.EncoderException encoderException56 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException55);
        org.apache.commons.codec.EncoderException encoderException57 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException56);
        org.apache.commons.codec.EncoderException encoderException58 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException57);
        java.lang.Throwable throwable61 = null;
        org.apache.commons.codec.EncoderException encoderException62 = new org.apache.commons.codec.EncoderException("", throwable61);
        org.apache.commons.codec.EncoderException encoderException63 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException62);
        java.lang.Throwable[] throwableArray64 = encoderException63.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException65 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException63);
        encoderException58.addSuppressed((java.lang.Throwable) encoderException65);
        encoderException50.addSuppressed((java.lang.Throwable) encoderException58);
        java.lang.Throwable[] throwableArray68 = encoderException58.getSuppressed();
        java.lang.Throwable[] throwableArray69 = encoderException58.getSuppressed();
        encoderException42.addSuppressed((java.lang.Throwable) encoderException58);
        encoderException26.addSuppressed((java.lang.Throwable) encoderException42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = soundex0.encode((java.lang.Object) encoderException26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O621" + "'", str10, "O621");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O000" + "'", str14, "O000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O000" + "'", str16, "O000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O621" + "'", str23, "O621");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.soundex("HI");
        int int13 = soundex1.difference("", "Osao");
        java.lang.String str15 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hh00" + "'", str10, "Hh00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Osao" + "'", str15, "Osao");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) 0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex6.setMaxLength((int) 'a');
        java.lang.Object obj10 = soundex6.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj11 = soundex0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.Class<?> wildcardClass12 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "Osao" + "'", obj10, "Osao");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "O621" + "'", obj11, "O621");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        org.apache.commons.codec.EncoderException encoderException6 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: Hh00");
        java.lang.Object obj7 = soundex0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: Hh00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "O621" + "'", obj7, "O621");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("Osao");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException");
        int int10 = soundex1.getMaxLength();
        java.lang.String str12 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O.om" + "'", str3, "O.om");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Osao" + "'", str7, "Osao");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Osao" + "'", str9, "Osao");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Osao" + "'", str12, "Osao");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str5 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: O.om", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str12 = soundex10.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str14 = soundex10.soundex("org.apache.commons.codec.EncoderException: ");
        soundex10.setMaxLength((int) (byte) 0);
        java.lang.String str18 = soundex10.encode("");
        java.lang.Object obj19 = soundex0.encode((java.lang.Object) "");
        int int20 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O621" + "'", str12, "O621");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O621" + "'", str14, "O621");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 43 + "'", int20 == 43);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O", "O.om");
        java.lang.String str9 = soundex0.soundex("O200");
        java.lang.Throwable throwable11 = null;
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException("", throwable11);
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException12);
        java.lang.Throwable[] throwableArray14 = encoderException13.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException13);
        java.lang.Throwable[] throwableArray16 = encoderException15.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex0.encode((java.lang.Object) encoderException15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O000" + "'", str9, "O000");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str4 = soundex0.soundex("O200");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("");
        int int8 = soundex0.getMaxLength();
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: O.om", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.String str13 = soundex0.soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 43 + "'", int5 == 43);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 43 + "'", int8 == 43);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = soundex14.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , 4, #,  ]");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex1.setMaxLength((int) (short) -1);
        soundex1.setMaxLength((int) '4');
        int int8 = soundex1.getMaxLength();
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.Throwable[] throwableArray11 = encoderException10.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex1.encode((java.lang.Object) encoderException10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex8, "OO", "org.apache.commons.codec.EncoderException: O");
        java.lang.Object obj12 = soundex1.encode((java.lang.Object) "OO");
        int int15 = soundex1.difference("OOCO", "O000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "O000" + "'", obj12, "O000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str3 = soundex1.encode("O");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O000" + "'", str3, "O000");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int4 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        java.lang.String str8 = soundex0.soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O621" + "'", str8, "O621");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("O621");
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = soundex1.encode(obj2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("O200");
        int int5 = soundex1.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str9 = soundex7.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int10 = soundex7.getMaxLength();
        int int11 = soundex7.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex1.encode((java.lang.Object) soundex7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OOCO" + "'", str9, "OOCO");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("");
        java.lang.String str3 = soundex1.soundex("");
        java.lang.String str5 = soundex1.encode("");
        java.lang.Throwable throwable7 = null;
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("", throwable7);
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException8);
        java.lang.Throwable throwable12 = null;
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("", throwable12);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException13);
        java.lang.Throwable[] throwableArray15 = encoderException14.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException14);
        encoderException9.addSuppressed((java.lang.Throwable) encoderException14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex1.encode((java.lang.Object) encoderException9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str10 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength(4);
        java.lang.String str14 = soundex0.encode("O200");
        java.lang.String str16 = soundex0.soundex("O200");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: OSAO", "H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O621" + "'", str10, "O621");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O000" + "'", str14, "O000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O000" + "'", str16, "O000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.soundex("org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O621" + "'", str4, "O621");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("O200");
        int int5 = soundex1.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex7.setMaxLength((int) 'a');
        int int10 = soundex7.getMaxLength();
        soundex7.setMaxLength((int) ' ');
        java.lang.String str14 = soundex7.encode("01230120022455012623010202");
        java.lang.String str16 = soundex7.encode("");
        int int19 = soundex7.difference("Hh00", "");
        java.lang.String str21 = soundex7.encode("HI");
        java.lang.Object obj22 = soundex1.encode((java.lang.Object) "HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hh00" + "'", str21, "Hh00");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "Hh00" + "'", obj22, "Hh00");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O", "O.om");
        java.lang.String str9 = soundex0.soundex("O200");
        int int12 = soundex0.difference("H", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("O621");
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex0.encode((java.lang.Object) encoderException14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O000" + "'", str9, "O000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("HH", "01230120022455012623010202");
        int int16 = soundex0.getMaxLength();
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: O", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        soundex0.setMaxLength(0);
        java.lang.String str8 = soundex0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str5 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: O.om", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str10 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str14 = soundex12.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str16 = soundex12.encode("01230120022455012623010202");
        java.lang.String str18 = soundex12.encode("O000");
        java.lang.Object obj19 = soundex0.encode((java.lang.Object) str18);
        java.lang.String str21 = soundex0.encode("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O621" + "'", str14, "O621");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "O000" + "'", str18, "O000");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "O000" + "'", obj19, "O000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        int int9 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "O.om");
        java.lang.String str11 = soundex1.encode("H000");
        int int14 = soundex1.difference("org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = soundex1.encode("O621");
        java.lang.Throwable throwable19 = null;
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("", throwable19);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException20);
        java.lang.Throwable[] throwableArray22 = encoderException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = encoderException21.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException21);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException24);
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex1.encode((java.lang.Object) encoderException25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O000" + "'", str16, "O000");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("O.om");
        soundex1.setMaxLength(10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = soundex1.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "Osao");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "");
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex7.setMaxLength((int) '4');
        java.lang.String str11 = soundex7.soundex("");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex7, "", "");
        soundex7.setMaxLength((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex1.encode((java.lang.Object) soundex7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int4 = soundex0.getMaxLength();
        org.apache.commons.codec.EncoderException encoderException7 = new org.apache.commons.codec.EncoderException("O621");
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException7);
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException8);
        java.lang.Throwable throwable12 = null;
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("", throwable12);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException13);
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException15);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("", throwable19);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException20);
        java.lang.Throwable[] throwableArray22 = encoderException21.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException21);
        encoderException16.addSuppressed((java.lang.Throwable) encoderException23);
        encoderException8.addSuppressed((java.lang.Throwable) encoderException16);
        java.lang.Throwable[] throwableArray26 = encoderException16.getSuppressed();
        java.lang.Throwable throwable30 = null;
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException("", throwable30);
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException31);
        java.lang.Throwable[] throwableArray33 = encoderException32.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException34 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException32);
        java.lang.Throwable[] throwableArray35 = encoderException32.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException32);
        java.lang.Throwable throwable39 = null;
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException("", throwable39);
        org.apache.commons.codec.EncoderException encoderException41 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException40);
        java.lang.Throwable[] throwableArray42 = encoderException41.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException43 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException41);
        java.lang.Throwable[] throwableArray44 = encoderException43.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException45 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException43);
        encoderException32.addSuppressed((java.lang.Throwable) encoderException45);
        org.apache.commons.codec.EncoderException encoderException47 = new org.apache.commons.codec.EncoderException("O", (java.lang.Throwable) encoderException32);
        encoderException16.addSuppressed((java.lang.Throwable) encoderException32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = soundex0.encode((java.lang.Object) encoderException16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) ' ');
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("org.apache.commons.codec.EncoderException");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str14 = soundex12.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str16 = soundex12.encode("01230120022455012623010202");
        java.lang.String str18 = soundex12.encode("O000");
        soundex12.setMaxLength((int) (short) 10);
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex12, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj24 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O621" + "'", str14, "O621");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "O000" + "'", str18, "O000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "Osao" + "'", obj24, "Osao");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str3 = soundex1.soundex("OOM");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Oo00" + "'", str3, "Oo00");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int4 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        java.lang.String str8 = soundex0.soundex("H");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("HI");
        int int10 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONO", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int13 = soundex0.difference("HH", "");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str4 = soundex0.soundex("O200");
        int int7 = soundex0.difference("org.apache.commons.codec.EncoderException: Hh00", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) '4');
        java.lang.String str5 = soundex1.soundex("");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "", "");
        soundex1.setMaxLength((int) (byte) 0);
        int int11 = soundex1.getMaxLength();
        java.lang.Throwable throwable14 = null;
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("", throwable14);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException15);
        java.lang.Throwable[] throwableArray17 = encoderException16.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException16);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException16);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException16);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException16);
        java.lang.Object obj22 = soundex1.encode((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O", "O.om");
        soundex0.setMaxLength(4);
        java.lang.Throwable throwable12 = null;
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("", throwable12);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException13);
        java.lang.Throwable[] throwableArray15 = encoderException14.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("O", (java.lang.Throwable) encoderException14);
        java.lang.Throwable[] throwableArray19 = encoderException18.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex0.encode((java.lang.Object) encoderException18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOCO");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int9 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '4');
        java.lang.String str13 = soundex1.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Osao" + "'", str13, "Osao");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) ' ');
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        int int9 = soundex1.getMaxLength();
        java.lang.Throwable throwable13 = null;
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("", throwable13);
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("hi!", throwable13);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", throwable13);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("", throwable19);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException20);
        java.lang.Throwable[] throwableArray22 = encoderException21.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException21);
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("HI", (java.lang.Throwable) encoderException21);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException21);
        encoderException16.addSuppressed((java.lang.Throwable) encoderException25);
        java.lang.Throwable[] throwableArray27 = encoderException25.getSuppressed();
        java.lang.Throwable[] throwableArray28 = encoderException25.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex1.encode((java.lang.Object) throwableArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str3 = soundex1.soundex("");
        java.lang.String str5 = soundex1.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str8 = soundex6.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str10 = soundex6.encode("Osao");
        soundex6.setMaxLength(0);
        java.lang.Class<?> wildcardClass13 = soundex6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex1.encode((java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OOCO" + "'", str5, "OOCO");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O621" + "'", str8, "O621");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O200" + "'", str10, "O200");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("O000");
        java.lang.String str9 = soundex1.encode("OSAO");
        java.lang.String str11 = soundex1.soundex("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O200" + "'", str9, "O200");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str4 = soundex0.soundex("O200");
        int int5 = soundex0.getMaxLength();
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O.om", "01230120022455012623010202");
        java.lang.String str13 = soundex0.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex1.setMaxLength(100);
        java.lang.String str7 = soundex1.encode("Hh00");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex9.setMaxLength((int) 'a');
        int int12 = soundex9.getMaxLength();
        soundex9.setMaxLength((int) ' ');
        java.lang.String str16 = soundex9.encode("01230120022455012623010202");
        java.lang.String str18 = soundex9.encode("");
        int int21 = soundex9.difference("Hh00", "");
        soundex9.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex1.encode((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int4 = soundex0.getMaxLength();
        soundex0.setMaxLength(100);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str3 = soundex1.soundex("");
        soundex1.setMaxLength(52);
        org.apache.commons.codec.language.Soundex soundex6 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex6, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str11 = soundex6.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex1.encode((java.lang.Object) soundex6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(soundex6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str3 = soundex1.encode("Oo00");
        java.lang.String str5 = soundex1.encode("org.apache.commons.codec.EncoderException: O200");
        java.lang.Throwable throwable8 = null;
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException("", throwable8);
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException9);
        java.lang.Throwable throwable13 = null;
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("", throwable13);
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        java.lang.Throwable[] throwableArray16 = encoderException15.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException15);
        encoderException10.addSuppressed((java.lang.Throwable) encoderException15);
        java.lang.Throwable throwable20 = null;
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("", throwable20);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException21);
        java.lang.Throwable[] throwableArray23 = encoderException22.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException22);
        encoderException10.addSuppressed((java.lang.Throwable) encoderException24);
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException10);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("H000", (java.lang.Throwable) encoderException26);
        java.lang.Throwable[] throwableArray28 = encoderException27.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex1.encode((java.lang.Object) encoderException27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O000" + "'", str3, "O000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OOCO" + "'", str5, "OOCO");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str7 = soundex5.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str9 = soundex5.encode("");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Object obj12 = soundex5.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex1.encode(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O621" + "'", str7, "O621");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "O621" + "'", obj12, "O621");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str10 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.soundex("HI");
        int int13 = soundex1.difference("", "Osao");
        int int16 = soundex1.difference("01230120022455012623010202", "OSAO");
        java.lang.String str18 = soundex1.soundex("org.apache.commons.codec.EncoderException: Osao");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hh00" + "'", str10, "Hh00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Osao" + "'", str18, "Osao");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((int) '4');
        java.lang.String str8 = soundex0.soundex("org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O621" + "'", str8, "O621");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str10 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength(4);
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O621" + "'", str10, "O621");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        char[] charArray4 = new char[] { '#', '#', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(4);
        int int8 = soundex5.getMaxLength();
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Throwable throwable13 = null;
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("", throwable13);
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", throwable13);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("", throwable18);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException19);
        java.lang.Throwable throwable23 = null;
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("", throwable23);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException24);
        java.lang.Throwable[] throwableArray26 = encoderException25.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException25);
        encoderException20.addSuppressed((java.lang.Throwable) encoderException25);
        java.lang.Throwable throwable30 = null;
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException("", throwable30);
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException31);
        java.lang.Throwable[] throwableArray33 = encoderException32.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException34 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException32);
        encoderException20.addSuppressed((java.lang.Throwable) encoderException34);
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException("O200", (java.lang.Throwable) encoderException34);
        java.lang.Throwable throwable38 = null;
        org.apache.commons.codec.EncoderException encoderException39 = new org.apache.commons.codec.EncoderException("", throwable38);
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException39);
        java.lang.Throwable[] throwableArray41 = encoderException40.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException42 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException40);
        java.lang.Throwable[] throwableArray43 = encoderException40.getSuppressed();
        java.lang.Throwable throwable45 = null;
        org.apache.commons.codec.EncoderException encoderException46 = new org.apache.commons.codec.EncoderException("", throwable45);
        org.apache.commons.codec.EncoderException encoderException47 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException46);
        java.lang.Throwable throwable50 = null;
        org.apache.commons.codec.EncoderException encoderException51 = new org.apache.commons.codec.EncoderException("", throwable50);
        org.apache.commons.codec.EncoderException encoderException52 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException51);
        java.lang.Throwable[] throwableArray53 = encoderException52.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException54 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException52);
        encoderException47.addSuppressed((java.lang.Throwable) encoderException52);
        encoderException40.addSuppressed((java.lang.Throwable) encoderException52);
        org.apache.commons.codec.EncoderException encoderException57 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException40);
        org.apache.commons.codec.EncoderException encoderException58 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException40);
        encoderException36.addSuppressed((java.lang.Throwable) encoderException40);
        encoderException15.addSuppressed((java.lang.Throwable) encoderException40);
        org.apache.commons.codec.EncoderException encoderException62 = new org.apache.commons.codec.EncoderException("Osao");
        java.lang.Throwable throwable65 = null;
        org.apache.commons.codec.EncoderException encoderException66 = new org.apache.commons.codec.EncoderException("", throwable65);
        org.apache.commons.codec.EncoderException encoderException67 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException66);
        java.lang.Throwable[] throwableArray68 = encoderException67.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException69 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException67);
        java.lang.Throwable[] throwableArray70 = encoderException69.getSuppressed();
        java.lang.Throwable[] throwableArray71 = encoderException69.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException72 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException69);
        encoderException62.addSuppressed((java.lang.Throwable) encoderException72);
        java.lang.Throwable[] throwableArray74 = encoderException62.getSuppressed();
        encoderException15.addSuppressed((java.lang.Throwable) encoderException62);
        encoderException10.addSuppressed((java.lang.Throwable) encoderException62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj77 = soundex5.encode((java.lang.Object) encoderException10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray74);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex8, "OO", "org.apache.commons.codec.EncoderException: O");
        java.lang.Object obj12 = soundex1.encode((java.lang.Object) "OO");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex1.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "O000" + "'", obj12, "O000");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTION", "hi!");
        soundex1.setMaxLength(2);
        soundex1.setMaxLength(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        int int9 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "O.om");
        java.lang.String str11 = soundex1.encode("H000");
        int int14 = soundex1.difference("org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength(43);
        int int19 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Osao" + "'", str16, "Osao");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 43 + "'", int19 == 43);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("O200");
        java.lang.String str6 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) ' ');
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        int int9 = soundex1.getMaxLength();
        java.lang.String str11 = soundex1.encode("OO");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O000" + "'", str11, "O000");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.encode("O.om");
        java.lang.Throwable throwable9 = null;
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("", throwable9);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException10);
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException11);
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException11);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException11);
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("H000");
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", (java.lang.Throwable) encoderException17);
        encoderException11.addSuppressed((java.lang.Throwable) encoderException17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex0.encode((java.lang.Object) encoderException17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O500" + "'", str6, "O500");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str10 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str12 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Osao" + "'", str12, "Osao");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("O200");
        java.lang.String str6 = soundex1.soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = soundex1.getMaxLength();
        java.lang.Object obj9 = soundex1.encode((java.lang.Object) "Hh00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H000" + "'", obj9, "H000");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) ' ');
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: hi!", "");
        java.lang.Throwable throwable17 = null;
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("", throwable17);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", throwable17);
        java.lang.Throwable throwable23 = null;
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("", throwable23);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException24);
        java.lang.Throwable[] throwableArray26 = encoderException25.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException("HI", (java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException("HI", (java.lang.Throwable) encoderException29);
        encoderException19.addSuppressed((java.lang.Throwable) encoderException30);
        java.lang.Throwable[] throwableArray32 = encoderException30.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException33 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException30);
        java.lang.Object obj34 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "Osao" + "'", obj34, "Osao");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int4 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = soundex1.difference("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        java.lang.String str9 = soundex1.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: OOCO", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OOCO" + "'", str9, "OOCO");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str8 = soundex0.encode("HI");
        int int11 = soundex0.difference("O.om", "O000");
        java.lang.String str13 = soundex0.soundex("org.apache.commons.codec.EncoderException: O.om");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.soundex("O500");
        org.apache.commons.codec.EncoderException encoderException5 = new org.apache.commons.codec.EncoderException("Osao");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = soundex1.encode((java.lang.Object) encoderException5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O000" + "'", str3, "O000");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int10 = soundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: O.om", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str10 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength(4);
        java.lang.String str14 = soundex0.encode("O200");
        java.lang.String str16 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: HI", "org.apache.commons.codec.EncoderException: hi!");
        int int22 = soundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONO");
        java.lang.String str24 = soundex0.encode("H");
        java.lang.Class<?> wildcardClass25 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O621" + "'", str10, "O621");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O000" + "'", str14, "O000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O621" + "'", str16, "O621");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H000" + "'", str24, "H000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        char[] charArray4 = new char[] { ' ', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(43);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " #44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " #44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , #, 4, 4]");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("HH", "01230120022455012623010202");
        int int16 = soundex0.getMaxLength();
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int20 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: hi!");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int8 = soundex1.getMaxLength();
        int int11 = soundex1.difference("", "Hh00");
        java.lang.String str13 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Osao" + "'", str13, "Osao");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("HI");
        java.lang.String str9 = soundex0.encode("org.apache.commons.codec.EncoderException: OOCO");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O621" + "'", str9, "O621");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: O.om", "O");
        java.lang.String str8 = soundex1.soundex("");
        soundex1.setMaxLength((int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OOCO" + "'", str3, "OOCO");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("HH", "01230120022455012623010202");
        java.lang.String str17 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        soundex0.setMaxLength(97);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O621" + "'", str17, "O621");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.soundex("org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex1.encode("");
        int int12 = soundex1.difference("H", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("O.om");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "");
        java.lang.Throwable throwable8 = null;
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException("", throwable8);
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException9);
        java.lang.Throwable[] throwableArray11 = encoderException10.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException10);
        java.lang.Throwable[] throwableArray13 = encoderException10.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException10);
        java.lang.Throwable throwable17 = null;
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("", throwable17);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException18);
        java.lang.Throwable[] throwableArray20 = encoderException19.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException19);
        java.lang.Throwable[] throwableArray22 = encoderException21.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException21);
        encoderException10.addSuppressed((java.lang.Throwable) encoderException23);
        java.lang.Throwable[] throwableArray25 = encoderException23.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException23);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex0.encode((java.lang.Object) encoderException27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O500" + "'", str2, "O500");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONO");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("OO");
        java.lang.String str3 = soundex1.soundex("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((-1));
        soundex1.setMaxLength((int) (byte) 100);
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: O", "OO");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("");
        java.lang.String str4 = soundex0.encode("org.apache.commons.codec.EncoderException: O.om");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O621" + "'", str4, "O621");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("OOCO");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex1.setMaxLength((int) (short) -1);
        soundex1.setMaxLength((int) '4');
        java.lang.String str9 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int12 = soundex1.difference("org.apache.commons.codec.EncoderException: OSAO", "Osao");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Osao" + "'", str9, "Osao");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str12 = soundex1.soundex("H000");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "OO");
        int int18 = soundex1.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTION", "hi!");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex8.setMaxLength((int) 'a');
        int int11 = soundex8.getMaxLength();
        soundex8.setMaxLength((int) ' ');
        java.lang.String str15 = soundex8.encode("01230120022455012623010202");
        java.lang.Object obj16 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.Throwable throwable21 = null;
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("HI", throwable21);
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("", throwable21);
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException(throwable21);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("O200", (java.lang.Throwable) encoderException24);
        java.lang.Throwable throwable28 = null;
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException("", throwable28);
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", throwable28);
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException30);
        java.lang.Throwable throwable34 = null;
        org.apache.commons.codec.EncoderException encoderException35 = new org.apache.commons.codec.EncoderException("", throwable34);
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException35);
        java.lang.Throwable[] throwableArray37 = encoderException36.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException38 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException36);
        org.apache.commons.codec.EncoderException encoderException39 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException36);
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException("O", (java.lang.Throwable) encoderException36);
        encoderException30.addSuppressed((java.lang.Throwable) encoderException40);
        encoderException24.addSuppressed((java.lang.Throwable) encoderException40);
        org.apache.commons.codec.EncoderException encoderException43 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = soundex1.encode((java.lang.Object) encoderException24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("O200");
        int int5 = soundex1.getMaxLength();
        java.lang.String str7 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int9 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '4');
        java.lang.String str13 = soundex1.encode("Osao");
        soundex1.setMaxLength(10);
        java.lang.String str17 = soundex1.encode("O000");
        int int20 = soundex1.difference("", "org.apache.commons.codec.EncoderException: Osao");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O.om" + "'", str13, "O.om");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O000" + "'", str17, "O000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str10 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength(4);
        java.lang.String str14 = soundex0.encode("O200");
        java.lang.String str16 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) -1);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: O200");
        java.lang.Object obj21 = soundex0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: O200");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O621" + "'", str10, "O621");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O000" + "'", str14, "O000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O621" + "'", str16, "O621");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "O621" + "'", obj21, "O621");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("O200");
        java.lang.String str6 = soundex1.soundex("OO");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex8.setMaxLength((int) 'a');
        int int13 = soundex8.difference("HI", "01230120022455012623010202");
        int int16 = soundex8.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "O.om");
        java.lang.String str18 = soundex8.encode("H000");
        soundex8.setMaxLength(0);
        java.lang.String str22 = soundex8.encode("HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex1.encode((java.lang.Object) soundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hh00" + "'", str22, "Hh00");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        char[] charArray5 = new char[] { ' ', ' ', ' ', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , a, a]");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str10 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: ");
        int int16 = soundex0.difference("O.om", "H");
        java.lang.Throwable throwable18 = null;
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("", throwable18);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException19);
        java.lang.Throwable[] throwableArray21 = encoderException20.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException20);
        java.lang.Throwable[] throwableArray23 = encoderException22.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("O621");
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException26);
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException27);
        java.lang.Throwable throwable31 = null;
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException("", throwable31);
        org.apache.commons.codec.EncoderException encoderException33 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException32);
        org.apache.commons.codec.EncoderException encoderException34 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException33);
        org.apache.commons.codec.EncoderException encoderException35 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException34);
        java.lang.Throwable throwable38 = null;
        org.apache.commons.codec.EncoderException encoderException39 = new org.apache.commons.codec.EncoderException("", throwable38);
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException39);
        java.lang.Throwable[] throwableArray41 = encoderException40.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException42 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException40);
        encoderException35.addSuppressed((java.lang.Throwable) encoderException42);
        encoderException27.addSuppressed((java.lang.Throwable) encoderException35);
        encoderException22.addSuppressed((java.lang.Throwable) encoderException27);
        java.lang.Throwable[] throwableArray46 = encoderException22.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = soundex0.encode((java.lang.Object) encoderException22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O621" + "'", str10, "O621");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray46);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int4 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "OO", "org.apache.commons.codec.EncoderException: O");
        java.lang.Class<?> wildcardClass5 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: hi!");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int8 = soundex1.getMaxLength();
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "O.om");
        int int12 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int9 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '4');
        java.lang.String str13 = soundex1.encode("Osao");
        java.lang.String str15 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str17 = soundex1.soundex("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O.om" + "'", str13, "O.om");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Osao" + "'", str15, "Osao");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.encode("");
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str9 = soundex7.encode("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Object obj12 = soundex7.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Object obj13 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O621" + "'", str9, "O621");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "O621" + "'", obj12, "O621");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "O621" + "'", obj13, "O621");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.encode("O.om");
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: hi!");
        int int10 = soundex7.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int13 = soundex7.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.Object obj14 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.String str16 = soundex1.encode("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O500" + "'", str5, "O500");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "O621" + "'", obj14, "O621");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str5 = soundex0.soundex("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str7 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNotNull(soundex0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O621" + "'", str7, "O621");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass4 = soundex1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.soundex("org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) (byte) 0);
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        char[] charArray17 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray17);
        soundex21.setMaxLength((int) '4');
        java.lang.Class<?> wildcardClass24 = soundex21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex1.encode((java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4,  , 4, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        char[] charArray4 = new char[] { '#', '#', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str7 = soundex5.encode("");
        soundex5.setMaxLength((int) ' ');
        soundex5.setMaxLength(0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #,  ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: HI", "");
        java.lang.Object obj6 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        int int7 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "Osao" + "'", obj6, "Osao");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.soundex("");
        java.lang.String str7 = soundex0.encode("O.om");
        soundex0.setMaxLength((int) (short) -1);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O500" + "'", str7, "O500");
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str8 = soundex0.encode("HI");
        int int11 = soundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "OM00");
        java.lang.String str13 = soundex0.encode("OM00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O500" + "'", str13, "O500");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex5.setMaxLength((int) '4');
        java.lang.String str9 = soundex5.soundex("");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "", "");
        soundex5.setMaxLength((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex1.encode((java.lang.Object) soundex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int4 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex6.setMaxLength((int) 'a');
        int int9 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) ' ');
        java.lang.String str13 = soundex6.encode("01230120022455012623010202");
        int int14 = soundex6.getMaxLength();
        int int15 = soundex6.getMaxLength();
        int int18 = soundex6.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONO", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONO");
        java.lang.Object obj19 = soundex0.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONO");
        java.lang.String str21 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "O621" + "'", obj19, "O621");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "O621" + "'", str21, "O621");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: hi!");
        int int4 = soundex1.difference("HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str6 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.Soundex soundex7 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int8 = soundex7.getMaxLength();
        int int11 = soundex7.difference("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex1.encode((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertNotNull(soundex7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: HI", "");
        java.lang.String str6 = soundex1.soundex("org.apache.commons.codec.EncoderException: O.om");
        soundex1.setMaxLength(10);
        java.lang.String str10 = soundex1.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        soundex1.setMaxLength(100);
        java.lang.String str5 = soundex1.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        int int4 = soundex1.difference("O000", "org.apache.commons.codec.EncoderException: O");
        java.lang.String str6 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        java.lang.Object obj5 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = soundex1.encode("O200");
        int int8 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) (short) 0);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str14 = soundex12.encode("Osao");
        soundex12.setMaxLength((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = soundex12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex1.encode((java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Osao" + "'", obj5, "Osao");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O.om" + "'", str14, "O.om");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        java.lang.Object obj5 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = soundex1.encode("O200");
        int int8 = soundex1.getMaxLength();
        java.lang.String str10 = soundex1.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.String str12 = soundex1.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Osao" + "'", obj5, "Osao");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Osao" + "'", str12, "Osao");
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.encode("org.apache.commons.codec.EncoderException");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OOCO" + "'", str3, "OOCO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OOCO" + "'", str5, "OOCO");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int6 = soundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.Object obj10 = soundex0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int11 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "O621" + "'", obj10, "O621");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: O");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("OO");
        java.lang.Throwable throwable4 = null;
        org.apache.commons.codec.EncoderException encoderException5 = new org.apache.commons.codec.EncoderException("", throwable4);
        org.apache.commons.codec.EncoderException encoderException6 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException5);
        java.lang.Throwable[] throwableArray7 = encoderException6.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException6);
        java.lang.Throwable[] throwableArray9 = encoderException8.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex1.encode((java.lang.Object) encoderException8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "01230120022455012623010202");
        soundex1.setMaxLength((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        char[] charArray4 = new char[] { ' ', '#', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.EncoderException encoderException7 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: HI");
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        encoderException7.addSuppressed((java.lang.Throwable) encoderException9);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex5.encode((java.lang.Object) encoderException11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " #44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " #44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , #, 4, 4]");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int3 = soundex0.getMaxLength();
        int int4 = soundex0.getMaxLength();
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("OM00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O500" + "'", str7, "O500");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: HI", "");
        java.lang.String str6 = soundex1.soundex("org.apache.commons.codec.EncoderException: O.om");
        java.lang.String str8 = soundex1.soundex("O000");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "hi!", "org.apache.commons.codec.EncoderException: HI");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O000" + "'", str8, "O000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        char[] charArray4 = new char[] { '#', '#', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str7 = soundex5.encode("");
        soundex5.setMaxLength((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "", "org.apache.commons.codec.EncoderException: OOCO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #,  ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int9 = soundex1.getMaxLength();
        java.lang.Class<?> wildcardClass10 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.encode("O.om");
        int int6 = soundex1.getMaxLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O500" + "'", str5, "O500");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int9 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '4');
        java.lang.String str13 = soundex1.encode("Osao");
        soundex1.setMaxLength(10);
        java.lang.String str17 = soundex1.encode("O000");
        int int18 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O.om" + "'", str13, "O.om");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O000" + "'", str17, "O000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("");
        soundex1.setMaxLength(100);
        soundex1.setMaxLength(4);
        soundex1.setMaxLength(3);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: HI", "");
        java.lang.String str6 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = soundex1.encode("org.apache.commons.codec.EncoderException: O200");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.soundex("org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) (byte) 0);
        int int8 = soundex1.getMaxLength();
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: Hh00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int4 = soundex1.getMaxLength();
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: O200", "O500");
        int int10 = soundex1.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        java.lang.String str7 = soundex0.encode("");
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str11 = soundex9.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str13 = soundex9.encode("01230120022455012623010202");
        java.lang.String str15 = soundex9.encode("O000");
        soundex9.setMaxLength((int) (short) 10);
        java.lang.String str19 = soundex9.soundex("org.apache.commons.codec.EncoderException: O");
        java.lang.Object obj20 = soundex0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: O");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O000" + "'", str15, "O000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O621" + "'", str19, "O621");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "O621" + "'", obj20, "O621");
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HH", "Osao");
        int int6 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str4 = soundex0.soundex("O200");
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = soundex0.encode(obj5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        java.lang.Throwable throwable7 = null;
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("", throwable7);
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException8);
        java.lang.Throwable throwable11 = null;
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException("hi!", throwable11);
        encoderException9.addSuppressed((java.lang.Throwable) encoderException12);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTION", (java.lang.Throwable) encoderException9);
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("O000", (java.lang.Throwable) encoderException9);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("", throwable19);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException20);
        java.lang.Throwable[] throwableArray22 = encoderException21.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException21);
        java.lang.Throwable[] throwableArray24 = encoderException21.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException21);
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("O621", (java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException25);
        encoderException15.addSuppressed((java.lang.Throwable) encoderException25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex1.encode((java.lang.Object) encoderException25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        java.lang.String str9 = soundex7.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex7.encode("org.apache.commons.codec.EncoderException: Hh00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str5 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        int int8 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "O000");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O", "");
        java.lang.String str13 = soundex0.encode("org.apache.commons.codec.EncoderException: O000");
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str16 = soundex14.encode("");
        java.lang.String str18 = soundex14.encode("01230120022455012623010202");
        int int19 = soundex14.getMaxLength();
        java.lang.String str21 = soundex14.soundex("01230120022455012623010202");
        java.lang.Object obj22 = soundex0.encode((java.lang.Object) str21);
        java.lang.String str24 = soundex0.encode("org.apache.commons.codec.EncoderException: Osao");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "O621" + "'", str24, "O621");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        int int8 = soundex1.difference("HH", "org.apache.commons.codec.EncoderException: O200");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "", "OOM");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str5 = soundex1.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.Class<?> wildcardClass6 = soundex1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) ' ');
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        int int9 = soundex1.getMaxLength();
        int int10 = soundex1.getMaxLength();
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex1.encode((java.lang.Object) encoderException12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONO");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.encode("O500");
        java.lang.String str6 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OOCO" + "'", str6, "OOCO");
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: HI", "");
        java.lang.Object obj6 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        java.lang.String str8 = soundex1.encode("org.apache.commons.codec.EncoderException: O000");
        soundex1.setMaxLength((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "Osao" + "'", obj6, "Osao");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: O.om");
        java.lang.String str3 = soundex1.soundex("");
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str7 = soundex5.encode("01230120022455012623010202");
        java.lang.String str9 = soundex5.encode("O.om");
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: hi!");
        int int14 = soundex11.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int17 = soundex11.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.Object obj18 = soundex5.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex1.encode((java.lang.Object) soundex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O500" + "'", str9, "O500");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "O621" + "'", obj18, "O621");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int9 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '4');
        java.lang.String str13 = soundex1.encode("Osao");
        soundex1.setMaxLength(10);
        java.lang.String str17 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O.om" + "'", str13, "O.om");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength((int) (byte) 100);
        int int9 = soundex0.getMaxLength();
        int int12 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj15 = soundex0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "O621" + "'", obj15, "O621");
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.soundex("H000");
        java.lang.String str11 = soundex0.encode("org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        int int9 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "O.om");
        java.lang.String str11 = soundex1.encode("H000");
        int int12 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int11 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("O000");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "Oo00", "org.apache.commons.codec.EncoderException: HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOSAO");
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "O", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex1.setMaxLength((int) (short) -1);
        java.lang.String str7 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.Soundex soundex8 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int9 = soundex8.getMaxLength();
        int int12 = soundex8.difference("", "hi!");
        java.lang.String str14 = soundex8.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex8.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex1.encode((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Osao" + "'", str7, "Osao");
        org.junit.Assert.assertNotNull(soundex8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O621" + "'", str14, "O621");
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str5 = soundex0.encode("H000");
        int int6 = soundex0.getMaxLength();
        int int9 = soundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str6 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOCO");
        int int9 = soundex1.difference("", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Osao" + "'", str4, "Osao");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str5 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int8 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM", "org.apache.commons.codec.EncoderException: O.om");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.String str13 = soundex0.encode("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        char[] charArray4 = new char[] { '#', '#', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex8.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #,  ]");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        java.lang.String str6 = soundex0.encode("org.apache.commons.codec.EncoderException: ");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "OO", "HI");
        java.lang.String str11 = soundex0.soundex("org.apache.commons.codec.EncoderException: Osao");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.soundex("");
        java.lang.String str7 = soundex0.encode("org.apache.commons.codec.EncoderException: HI");
        int int10 = soundex0.difference("", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.String str12 = soundex0.encode("org.apache.commons.codec.EncoderException: O.om");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O621" + "'", str7, "O621");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O621" + "'", str12, "O621");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex15 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int16 = soundex15.getMaxLength();
        int int19 = soundex15.difference("", "hi!");
        java.lang.String str21 = soundex15.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex15.setMaxLength((int) (byte) 100);
        java.lang.String str25 = soundex15.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex14.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , 4, #,  ]");
        org.junit.Assert.assertNotNull(soundex15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "O621" + "'", str21, "O621");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "O621" + "'", str25, "O621");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = soundex2.encode("O621");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) ' ');
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("");
        soundex1.setMaxLength(0);
        int int13 = soundex1.getMaxLength();
        java.lang.String str15 = soundex1.encode("org.apache.commons.codec.EncoderException: O000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Osao" + "'", str15, "Osao");
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        char[] charArray4 = new char[] { '#', '#', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        soundex5.setMaxLength(4);
        soundex5.setMaxLength(43);
        soundex5.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex5.soundex("org.apache.commons.codec.EncoderException: O.om");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #,  ]");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        soundex0.setMaxLength(3);
        int int10 = soundex0.difference("O000", "01230120022455012623010202");
        java.lang.String str12 = soundex0.soundex("org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O621" + "'", str12, "O621");
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength(3);
        int int8 = soundex0.difference("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        int int9 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str5 = soundex1.soundex("org.apache.commons.codec.EncoderException: HI");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: O.om");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str12 = soundex1.soundex("H000");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex17.setMaxLength((int) 'a');
        int int20 = soundex17.getMaxLength();
        soundex17.setMaxLength((int) ' ');
        java.lang.String str24 = soundex17.encode("01230120022455012623010202");
        java.lang.String str26 = soundex17.encode("");
        int int27 = soundex17.getMaxLength();
        int int28 = soundex17.getMaxLength();
        java.lang.String str30 = soundex17.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.Object obj31 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Osao" + "'", str30, "Osao");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "Osao" + "'", obj31, "Osao");
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int4 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = soundex1.difference("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException", "org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.encode("O.om");
        java.lang.Throwable throwable9 = null;
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("", throwable9);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException10);
        java.lang.Throwable throwable13 = null;
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("hi!", throwable13);
        encoderException11.addSuppressed((java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException14);
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O500" + "'", str6, "O500");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "O621" + "'", obj18, "O621");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "Osao");
        java.lang.String str8 = soundex1.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str12 = soundex10.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int13 = soundex10.getMaxLength();
        soundex10.setMaxLength((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex1.encode((java.lang.Object) soundex10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OOCO" + "'", str12, "OOCO");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex1.setMaxLength((int) (short) -1);
        soundex1.setMaxLength((int) '4');
        int int8 = soundex1.getMaxLength();
        java.lang.String str10 = soundex1.soundex("org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str14 = soundex12.encode("01230120022455012623010202");
        java.lang.String str16 = soundex12.encode("OSAO");
        soundex12.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex1.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O200" + "'", str16, "O200");
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str5 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        int int8 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "O000");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O", "");
        java.lang.String str13 = soundex0.encode("");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int17 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        int int3 = soundex1.getMaxLength();
        int int6 = soundex1.difference("O.om", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int4 = soundex1.getMaxLength();
        java.lang.String str6 = soundex1.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OOCO" + "'", str3, "OOCO");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OOCO" + "'", str6, "OOCO");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O", "O.om");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "H", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int11 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: HI", "");
        java.lang.String str6 = soundex1.soundex("org.apache.commons.codec.EncoderException: O.om");
        java.lang.String str8 = soundex1.soundex("O000");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: O000");
        soundex1.setMaxLength(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O000" + "'", str8, "O000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        int int9 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: HI", "");
        java.lang.Object obj6 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        java.lang.String str8 = soundex1.encode("org.apache.commons.codec.EncoderException: O000");
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("O621");
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException11);
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException12);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("", throwable16);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException17);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException18);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException19);
        java.lang.Throwable throwable23 = null;
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("", throwable23);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException24);
        java.lang.Throwable[] throwableArray26 = encoderException25.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException25);
        encoderException20.addSuppressed((java.lang.Throwable) encoderException27);
        encoderException12.addSuppressed((java.lang.Throwable) encoderException20);
        java.lang.Throwable[] throwableArray30 = encoderException20.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = soundex1.encode((java.lang.Object) encoderException20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "Osao" + "'", obj6, "Osao");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("HH", "01230120022455012623010202");
        java.lang.String str17 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.String str19 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        int int20 = soundex0.getMaxLength();
        java.lang.String str22 = soundex0.soundex("OO");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O621" + "'", str17, "O621");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O621" + "'", str19, "O621");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "O000" + "'", str22, "O000");
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("O621");
        java.lang.String str3 = soundex1.encode("");
        java.lang.Class<?> wildcardClass4 = soundex1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("O200");
        java.lang.String str6 = soundex1.soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str11 = soundex1.soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Throwable throwable14 = null;
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("", throwable14);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException15);
        java.lang.Throwable[] throwableArray17 = encoderException16.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException16);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("HI", (java.lang.Throwable) encoderException16);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex1.encode((java.lang.Object) encoderException20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Osao" + "'", str9, "Osao");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Osao" + "'", str11, "Osao");
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.String str3 = soundex1.soundex("OOM");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OM00" + "'", str3, "OM00");
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength((int) (byte) 100);
        java.lang.String str10 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength(4);
        int int15 = soundex0.difference("org.apache.commons.codec.EncoderException: HI", "OSAO");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str20 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        org.junit.Assert.assertNotNull(soundex0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O621" + "'", str10, "O621");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "O621" + "'", str20, "O621");
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        soundex0.setMaxLength(4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex1.setMaxLength((int) (short) -1);
        java.lang.String str7 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str9 = soundex1.soundex("HH");
        java.lang.String str11 = soundex1.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.Class<?> wildcardClass12 = soundex1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Osao" + "'", str7, "Osao");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Osao" + "'", str11, "Osao");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int4 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) ' ');
        soundex0.setMaxLength(100);
        int int9 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) '4');
        java.lang.String str5 = soundex1.soundex("");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "", "");
        soundex1.setMaxLength((int) (byte) 0);
        int int11 = soundex1.getMaxLength();
        java.lang.Throwable throwable13 = null;
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("", throwable13);
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        java.lang.Throwable[] throwableArray16 = encoderException15.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex1.encode((java.lang.Object) throwableArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        int int9 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "O.om");
        java.lang.String str11 = soundex1.encode("H000");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("01230120022455012623010202");
        java.lang.String str5 = soundex1.encode("OSAO");
        java.lang.String str7 = soundex1.soundex("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        char[] charArray4 = new char[] { '#', '#', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int8 = soundex5.difference("", "");
        java.lang.Throwable throwable11 = null;
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException("", throwable11);
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException12);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException13);
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException13);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex5.encode((java.lang.Object) encoderException13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) 0);
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("O000");
        java.lang.Throwable throwable9 = null;
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("", throwable9);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException10);
        java.lang.Throwable[] throwableArray12 = encoderException11.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException11);
        java.lang.Throwable[] throwableArray14 = encoderException13.getSuppressed();
        java.lang.Throwable throwable17 = null;
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("", throwable17);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException18);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException19);
        encoderException13.addSuppressed((java.lang.Throwable) encoderException19);
        java.lang.Throwable throwable25 = null;
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("", throwable25);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException26);
        java.lang.Throwable[] throwableArray28 = encoderException26.getSuppressed();
        java.lang.Throwable[] throwableArray29 = encoderException26.getSuppressed();
        encoderException19.addSuppressed((java.lang.Throwable) encoderException26);
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex0.encode((java.lang.Object) encoderException19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "01230120022455012623010202");
        java.lang.String str13 = soundex1.encode("org.apache.commons.codec.EncoderException: OOCO");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Osao" + "'", str13, "Osao");
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: HI", "");
        java.lang.Object obj6 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        int int9 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength(52);
        java.lang.String str13 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "Osao" + "'", obj6, "Osao");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Osao" + "'", str13, "Osao");
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        char[] charArray5 = new char[] { ' ', ' ', ' ', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , a, a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("Osao");
        soundex1.setMaxLength((int) (byte) 100);
        java.lang.String str7 = soundex1.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O.om" + "'", str3, "O.om");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Osao" + "'", str7, "Osao");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Osao" + "'", str9, "Osao");
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        java.lang.Object obj5 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.Soundex soundex6 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int7 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) (byte) -1);
        java.lang.String str11 = soundex6.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        java.lang.Object obj12 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        java.lang.Throwable throwable14 = null;
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("O000", throwable14);
        java.lang.Object obj16 = soundex1.encode((java.lang.Object) "O000");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Osao" + "'", obj5, "Osao");
        org.junit.Assert.assertNotNull(soundex6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "Osao" + "'", obj12, "Osao");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "O000" + "'", obj16, "O000");
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: hi!");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str6 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex0.setMaxLength(3);
        int int8 = soundex0.difference("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        java.lang.Class<?> wildcardClass9 = soundex0.getClass();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        char[] charArray4 = new char[] { '#', '#', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int9 = soundex8.getMaxLength();
        java.lang.Throwable throwable12 = null;
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("", throwable12);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException13);
        java.lang.Throwable[] throwableArray15 = encoderException14.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTION", (java.lang.Throwable) encoderException17);
        java.lang.Throwable throwable20 = null;
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("hi!", throwable20);
        encoderException18.addSuppressed((java.lang.Throwable) encoderException21);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray26 = encoderException25.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException("HI");
        encoderException25.addSuppressed((java.lang.Throwable) encoderException28);
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException("OOCO", (java.lang.Throwable) encoderException25);
        encoderException21.addSuppressed((java.lang.Throwable) encoderException30);
        java.lang.Throwable[] throwableArray32 = encoderException21.getSuppressed();
        java.lang.Throwable[] throwableArray33 = encoderException21.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex8.encode((java.lang.Object) encoderException21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str8 = soundex0.encode("HI");
        java.lang.String str10 = soundex0.encode("O621");
        soundex0.setMaxLength(43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O000" + "'", str10, "O000");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("Osao");
        int int4 = soundex1.getMaxLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O.om" + "'", str3, "O.om");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        soundex0.setMaxLength((int) (short) 10);
        java.lang.String str9 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O621" + "'", str9, "O621");
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("Osao");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException");
        int int10 = soundex1.getMaxLength();
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "HI", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O.om" + "'", str3, "O.om");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Osao" + "'", str7, "Osao");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Osao" + "'", str9, "Osao");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int6 = soundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = soundex0.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOCO");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O621" + "'", str8, "O621");
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        java.lang.String str3 = soundex1.encode("");
        soundex1.setMaxLength((int) 'a');
        soundex1.setMaxLength((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "", "O000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , 4, #,  ]");
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        soundex0.setMaxLength(0);
        int int7 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = soundex9.encode("org.apache.commons.codec.EncoderException: hi!");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex9, "ORGAPACHECOMMONSCODECENCODEREXCEPTION", "hi!");
        java.lang.Object obj15 = soundex0.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str17 = soundex0.encode("org.apache.commons.codec.EncoderException");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Osao" + "'", str11, "Osao");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "O621" + "'", obj15, "O621");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O621" + "'", str17, "O621");
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("Osao");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str9 = soundex1.encode("01230120022455012623010202");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM", "01230120022455012623010202");
        soundex1.setMaxLength((-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O.om" + "'", str3, "O.om");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Osao" + "'", str7, "Osao");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) ' ');
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: hi!", "");
        java.lang.String str15 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("O200");
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex1.encode((java.lang.Object) encoderException18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Osao" + "'", str15, "Osao");
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: hi!");
        int int2 = soundex1.getMaxLength();
        int int3 = soundex1.getMaxLength();
        java.lang.String str5 = soundex1.soundex("org.apache.commons.codec.EncoderException: O");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Osao" + "'", str5, "Osao");
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str5 = soundex0.soundex("");
        java.lang.String str7 = soundex0.encode("O621");
        java.lang.String str9 = soundex0.encode("org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O621" + "'", str9, "O621");
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int10 = soundex0.difference("org.apache.commons.codec.EncoderException: O200", "org.apache.commons.codec.EncoderException: O200");
        java.lang.Class<?> wildcardClass11 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int10 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOCO", "");
        char[] charArray16 = new char[] { ' ', ' ', ' ', 'a', 'a' };
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        int int18 = soundex17.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex0.encode((java.lang.Object) soundex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "   aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "   aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  ,  , a, a]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTION", "hi!");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex8.setMaxLength((int) 'a');
        int int11 = soundex8.getMaxLength();
        soundex8.setMaxLength((int) ' ');
        java.lang.String str15 = soundex8.encode("01230120022455012623010202");
        java.lang.Object obj16 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str18 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Osao" + "'", str18, "Osao");
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.encode("Oo00");
        int int6 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O000" + "'", str5, "O000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "O", "H000");
        java.lang.String str9 = soundex1.encode("hi!");
        soundex1.setMaxLength((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Osao" + "'", str4, "Osao");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hh00" + "'", str9, "Hh00");
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str5 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int8 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM", "org.apache.commons.codec.EncoderException: O.om");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "H000", "org.apache.commons.codec.EncoderException: O");
        java.lang.String str13 = soundex0.encode("HI");
        int int14 = soundex0.getMaxLength();
        java.lang.String str16 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONO");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O621" + "'", str16, "O621");
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("");
        soundex1.setMaxLength(100);
        java.lang.Throwable throwable7 = null;
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("", throwable7);
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException8);
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException9);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("H000", (java.lang.Throwable) encoderException10);
        java.lang.Throwable[] throwableArray12 = encoderException10.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex1.encode((java.lang.Object) encoderException10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        java.lang.Object obj5 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = soundex1.soundex("H000");
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: O.om");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Osao" + "'", obj5, "Osao");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Osao" + "'", str9, "Osao");
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "O", "H000");
        java.lang.String str9 = soundex1.encode("hi!");
        int int12 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: O");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Osao" + "'", str4, "Osao");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hh00" + "'", str9, "Hh00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str12 = soundex1.soundex("H000");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "OO");
        int int16 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex3.setMaxLength((int) 'a');
        int int6 = soundex3.getMaxLength();
        java.lang.String str8 = soundex3.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int11 = soundex3.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        int int14 = soundex3.difference("hi!", "");
        java.lang.Object obj15 = soundex1.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "H000" + "'", obj15, "H000");
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        soundex0.setMaxLength(0);
        int int7 = soundex0.getMaxLength();
        int int10 = soundex0.difference("org.apache.commons.codec.EncoderException: HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        soundex0.setMaxLength(10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.soundex("O500");
        java.lang.String str5 = soundex1.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOCO");
        java.lang.String str7 = soundex1.encode("Hh00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O000" + "'", str3, "O000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Osao" + "'", str5, "Osao");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str5 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        int int8 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "O000");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "O", "");
        java.lang.String str13 = soundex0.encode("org.apache.commons.codec.EncoderException: O000");
        java.lang.String str15 = soundex0.soundex("org.apache.commons.codec.EncoderException: O.om");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O621" + "'", str15, "O621");
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("Osao");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str9 = soundex1.encode("01230120022455012623010202");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex13 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int14 = soundex13.getMaxLength();
        int int17 = soundex13.difference("", "hi!");
        java.lang.String str19 = soundex13.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex13.setMaxLength((int) (byte) 100);
        java.lang.String str23 = soundex13.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex13.setMaxLength(4);
        java.lang.String str27 = soundex13.encode("O200");
        int int28 = soundex13.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = soundex1.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O.om" + "'", str3, "O.om");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Osao" + "'", str7, "Osao");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(soundex13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O621" + "'", str19, "O621");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O621" + "'", str23, "O621");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "O000" + "'", str27, "O000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int6 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OOCO" + "'", str3, "OOCO");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "O200");
        java.lang.String str17 = soundex0.soundex("org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O621" + "'", str17, "O621");
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONO");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.encode("O500");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str9 = soundex1.encode("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("O.om");
        soundex1.setMaxLength(10);
        java.lang.Throwable throwable7 = null;
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("HI", throwable7);
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException("", throwable7);
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException(throwable7);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("O200", (java.lang.Throwable) encoderException10);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("", throwable14);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", throwable14);
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException16);
        java.lang.Throwable throwable20 = null;
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("", throwable20);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException21);
        java.lang.Throwable[] throwableArray23 = encoderException22.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException22);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException22);
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("O", (java.lang.Throwable) encoderException22);
        encoderException16.addSuppressed((java.lang.Throwable) encoderException26);
        encoderException10.addSuppressed((java.lang.Throwable) encoderException26);
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex1.encode((java.lang.Object) encoderException26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        java.lang.String str9 = soundex7.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex7.difference("OOCO", "org.apache.commons.codec.EncoderException: O");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("");
        soundex1.setMaxLength(100);
        soundex1.setMaxLength(4);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = soundex1.encode(obj6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        java.lang.String str9 = soundex7.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex7.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int9 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '4');
        java.lang.String str13 = soundex1.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        java.lang.String str15 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Osao" + "'", str13, "Osao");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Osao" + "'", str15, "Osao");
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("");
        java.lang.String str4 = soundex0.encode("01230120022455012623010202");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int10 = soundex0.difference("org.apache.commons.codec.EncoderException: O200", "org.apache.commons.codec.EncoderException: O200");
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("O.om", (java.lang.Throwable) encoderException13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex0.encode((java.lang.Object) encoderException14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str12 = soundex1.soundex("H000");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "OO");
        java.lang.String str17 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Osao" + "'", str17, "Osao");
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: HI", "");
        java.lang.String str6 = soundex1.soundex("org.apache.commons.codec.EncoderException: O.om");
        soundex1.setMaxLength(10);
        java.lang.String str10 = soundex1.soundex("O");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O000" + "'", str10, "O000");
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str5 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int8 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM", "org.apache.commons.codec.EncoderException: O.om");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "H000", "org.apache.commons.codec.EncoderException: O");
        java.lang.String str13 = soundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOCO");
        java.lang.Object obj16 = soundex0.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOCO");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "O621" + "'", obj16, "O621");
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "O");
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str14 = soundex12.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex12.setMaxLength((int) (byte) 0);
        java.lang.String str18 = soundex12.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str20 = soundex12.encode("HI");
        int int23 = soundex12.difference("O.om", "O000");
        java.lang.Object obj24 = soundex1.encode((java.lang.Object) "O.om");
        int int25 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Osao" + "'", str8, "Osao");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O621" + "'", str14, "O621");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "O621" + "'", str18, "O621");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "Oo00" + "'", obj24, "Oo00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        java.lang.String str5 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        int int8 = soundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", "O000");
        soundex0.setMaxLength(32);
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "ORGAPACHECOMMONSCODECENCODEREXCEPTION", "OO");
        int int16 = soundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "HI");
        int int17 = soundex0.getMaxLength();
        int int18 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.encode("Osao");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str9 = soundex0.encode("01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("HH", "01230120022455012623010202");
        int int16 = soundex0.getMaxLength();
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O200" + "'", str5, "O200");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        int int4 = soundex0.difference("", "hi!");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("HI");
        java.lang.String str9 = soundex0.soundex("O");
        soundex0.setMaxLength(1);
        org.apache.commons.codec.language.Soundex soundex12 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int13 = soundex12.getMaxLength();
        java.lang.String str15 = soundex12.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str17 = soundex12.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex12, "org.apache.commons.codec.EncoderException: O.om", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str24 = soundex22.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str26 = soundex22.soundex("org.apache.commons.codec.EncoderException: ");
        soundex22.setMaxLength((int) (byte) 0);
        java.lang.String str30 = soundex22.encode("");
        java.lang.Object obj31 = soundex12.encode((java.lang.Object) "");
        java.lang.Object obj32 = soundex0.encode(obj31);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O000" + "'", str9, "O000");
        org.junit.Assert.assertNotNull(soundex12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O621" + "'", str15, "O621");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O621" + "'", str17, "O621");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "O621" + "'", str24, "O621");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "O621" + "'", str26, "O621");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) 0);
        java.lang.String str6 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        java.lang.String str8 = soundex0.encode("HI");
        int int11 = soundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "OM00");
        int int12 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str4 = soundex0.soundex("O200");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("");
        java.lang.String str9 = soundex0.encode("OOCO");
        int int10 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) '#');
        java.lang.String str14 = soundex0.soundex("H");
        int int15 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O200" + "'", str9, "O200");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex8, "OO", "org.apache.commons.codec.EncoderException: O");
        java.lang.Object obj12 = soundex1.encode((java.lang.Object) "OO");
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str15 = soundex13.encode("");
        java.lang.String str17 = soundex13.encode("01230120022455012623010202");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex13, "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int23 = soundex13.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOCO", "");
        java.lang.Object obj24 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOCO");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "O000" + "'", obj12, "O000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "Osao" + "'", obj24, "Osao");
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        char[] charArray4 = new char[] { '#', '#', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray4);
        int int8 = soundex5.difference("", "");
        int int9 = soundex5.getMaxLength();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "### ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        java.lang.Object obj5 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = soundex1.encode("O200");
        int int8 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) (short) 0);
        char[] charArray15 = new char[] { '#', '#', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        java.lang.Class<?> wildcardClass17 = soundex16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex1.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Osao" + "'", obj5, "Osao");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "### ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "### ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, #, #,  ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) ' ');
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("");
        int int13 = soundex1.difference("Hh00", "");
        int int14 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        int int6 = soundex1.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "Osao");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "O.om", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int10 = soundex1.getMaxLength();
        java.lang.Throwable throwable16 = null;
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("", throwable16);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("hi!", throwable16);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", throwable16);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex1.encode((java.lang.Object) encoderException22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Osao" + "'", str3, "Osao");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) -1);
        int int4 = soundex0.getMaxLength();
        int int5 = soundex0.getMaxLength();
        int int6 = soundex0.getMaxLength();
        java.lang.String str8 = soundex0.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOCO");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O621" + "'", str8, "O621");
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (short) -1);
        soundex0.setMaxLength((int) '4');
        java.lang.Class<?> wildcardClass7 = soundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("");
        soundex1.setMaxLength(100);
        soundex1.setMaxLength(4);
        soundex1.setMaxLength((int) (short) -1);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = soundex9.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex9.setMaxLength((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = soundex9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex1.encode((java.lang.Object) soundex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Osao" + "'", str11, "Osao");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        soundex0.setMaxLength(0);
        int int7 = soundex0.getMaxLength();
        java.lang.String str9 = soundex0.soundex("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.Class<?> wildcardClass5 = soundex1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Osao" + "'", str4, "Osao");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.soundex("org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) (byte) 0);
        int int8 = soundex1.getMaxLength();
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str13 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("O200");
        java.lang.String str6 = soundex1.soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = soundex1.encode(obj7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int1 = soundex0.getMaxLength();
        java.lang.String str3 = soundex0.soundex("org.apache.commons.codec.EncoderException: HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "01230120022455012623010202", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int9 = soundex0.difference("HI", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.Soundex soundex10 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int11 = soundex10.getMaxLength();
        int int14 = soundex10.difference("", "hi!");
        java.lang.String str16 = soundex10.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex10.setMaxLength((int) (byte) 100);
        java.lang.String str20 = soundex10.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex10, "org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: ");
        int int26 = soundex10.difference("O.om", "H");
        java.lang.Object obj27 = soundex0.encode((java.lang.Object) "H");
        int int30 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "OO", "H");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(soundex10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O621" + "'", str16, "O621");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "O621" + "'", str20, "O621");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H000" + "'", obj27, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("O");
        int int2 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HH", "Osao");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: O200", "");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "ORGAPACHECOMMONSCODECENCODEREXCEPTION", "O000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (byte) 0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex6.setMaxLength((int) 'a');
        java.lang.Object obj10 = soundex6.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj11 = soundex0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str13 = soundex0.soundex("O000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "Osao" + "'", obj10, "Osao");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "O621" + "'", obj11, "O621");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O000" + "'", str13, "O000");
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("O000");
        int int8 = soundex1.getMaxLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: O.om");
        org.apache.commons.codec.language.Soundex soundex2 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex2.getMaxLength();
        java.lang.String str5 = soundex2.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj6 = soundex1.encode((java.lang.Object) str5);
        org.junit.Assert.assertNotNull(soundex2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O621" + "'", str5, "O621");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "O000" + "'", obj6, "O000");
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '#', ' ' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray6);
        int int13 = soundex12.getMaxLength();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , 4, #,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("hi!");
        soundex1.setMaxLength((int) '4');
        soundex1.setMaxLength(0);
        soundex1.setMaxLength((int) (byte) 1);
        java.lang.String str9 = soundex1.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "O.om", "org.apache.commons.codec.EncoderException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("");
        java.lang.String str3 = soundex1.soundex("");
        java.lang.String str5 = soundex1.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = soundex1.encode("org.apache.commons.codec.EncoderException: OSAO");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str3 = soundex1.encode("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: hi!");
        int int4 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex1.setMaxLength(2);
        java.lang.Throwable throwable9 = null;
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("", throwable9);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException10);
        java.lang.Throwable[] throwableArray12 = encoderException11.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException11);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException11);
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException11);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException15);
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException15);
        java.lang.Throwable throwable20 = null;
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("", throwable20);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException21);
        java.lang.Throwable[] throwableArray23 = encoderException22.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException22);
        java.lang.Throwable[] throwableArray25 = encoderException24.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException24);
        encoderException15.addSuppressed((java.lang.Throwable) encoderException24);
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        encoderException24.addSuppressed((java.lang.Throwable) encoderException29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = soundex1.encode((java.lang.Object) encoderException29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("01230120022455012623010202");
        java.lang.String str3 = soundex1.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex1.setMaxLength(4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O621" + "'", str3, "O621");
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("O000");
        int int2 = soundex1.getMaxLength();
        java.lang.Throwable throwable4 = null;
        org.apache.commons.codec.EncoderException encoderException5 = new org.apache.commons.codec.EncoderException("", throwable4);
        org.apache.commons.codec.EncoderException encoderException6 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException5);
        java.lang.Throwable[] throwableArray7 = encoderException6.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException6);
        java.lang.Throwable[] throwableArray9 = encoderException6.getSuppressed();
        java.lang.Throwable throwable11 = null;
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException("", throwable11);
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException12);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("", throwable16);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException17);
        java.lang.Throwable[] throwableArray19 = encoderException18.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException18);
        encoderException13.addSuppressed((java.lang.Throwable) encoderException18);
        encoderException6.addSuppressed((java.lang.Throwable) encoderException18);
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex1.encode((java.lang.Object) encoderException23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        soundex0.setMaxLength(0);
        int int7 = soundex0.getMaxLength();
        int int10 = soundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "");
        java.lang.String str12 = soundex0.encode("H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "HI", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str5 = soundex0.soundex("");
        java.lang.String str7 = soundex0.encode("org.apache.commons.codec.EncoderException: HI");
        int int10 = soundex0.difference("", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        java.lang.String str12 = soundex0.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: OOCO");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O621" + "'", str7, "O621");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O621" + "'", str12, "O621");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        int int6 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str8 = soundex1.encode("01230120022455012623010202");
        java.lang.String str10 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str12 = soundex1.encode("O");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Osao" + "'", str10, "Osao");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O000" + "'", str12, "O000");
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str4 = soundex0.encode("Osao");
        soundex0.setMaxLength(100);
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "org.apache.commons.codec.EncoderException: O000", "Oo00");
        java.lang.String str11 = soundex0.encode("OOM");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O200" + "'", str4, "O200");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O500" + "'", str11, "O500");
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        char[] charArray5 = new char[] { '#', '#', '4', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #, 4, 4, 4]");
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.soundex("org.apache.commons.codec.EncoderException: OSAO");
        java.lang.String str6 = soundex1.encode("org.apache.commons.codec.EncoderException: O200");
        java.lang.Throwable throwable9 = null;
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("HI", throwable9);
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("", throwable9);
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException(throwable9);
        java.lang.Throwable[] throwableArray13 = encoderException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = encoderException12.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex1.encode((java.lang.Object) encoderException12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Osao" + "'", str4, "Osao");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.encode("Hh00");
        java.lang.String str6 = soundex1.encode("org.apache.commons.codec.EncoderException: HI");
        soundex1.setMaxLength(97);
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "OO", "");
        int int12 = soundex1.getMaxLength();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Osao" + "'", str6, "Osao");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str3 = soundex1.encode("Osao");
        java.lang.String str5 = soundex1.encode("01230120022455012623010202");
        java.lang.String str7 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str9 = soundex1.encode("01230120022455012623010202");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM", "01230120022455012623010202");
        java.lang.String str14 = soundex1.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O.om" + "'", str3, "O.om");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Osao" + "'", str7, "Osao");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Osao" + "'", str14, "Osao");
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength((int) (short) -1);
        java.lang.String str6 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONOOM");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O621" + "'", str2, "O621");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O621" + "'", str6, "O621");
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength((int) 'a');
        java.lang.Object obj5 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = soundex1.encode("O200");
        java.lang.Throwable throwable10 = null;
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("", throwable10);
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException11);
        java.lang.Throwable[] throwableArray13 = encoderException12.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException12);
        java.lang.Throwable[] throwableArray15 = encoderException14.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("O621");
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException18);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException19);
        java.lang.Throwable throwable23 = null;
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("", throwable23);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException24);
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException26);
        java.lang.Throwable throwable30 = null;
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException("", throwable30);
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException31);
        java.lang.Throwable[] throwableArray33 = encoderException32.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException34 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException32);
        encoderException27.addSuppressed((java.lang.Throwable) encoderException34);
        encoderException19.addSuppressed((java.lang.Throwable) encoderException27);
        encoderException14.addSuppressed((java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException38 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        java.lang.Throwable[] throwableArray39 = encoderException38.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI", (java.lang.Throwable) encoderException38);
        java.lang.Object obj41 = soundex1.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONHI");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Osao" + "'", obj5, "Osao");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O000" + "'", str7, "O000");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "Osao" + "'", obj41, "Osao");
    }
}
