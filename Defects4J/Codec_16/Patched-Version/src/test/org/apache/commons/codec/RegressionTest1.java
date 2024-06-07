package org.apache.commons.codec.language;

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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: A", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        java.lang.String str10 = doubleMetaphone0.encode("");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray17 = encoderException16.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException16);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException16);
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("");
        encoderException23.addSuppressed((java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException25);
        encoderException19.addSuppressed((java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException19);
        java.lang.Throwable[] throwableArray32 = encoderException31.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = doubleMetaphone0.encode((java.lang.Object) encoderException31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual(" H#", "");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException16);
        java.lang.Throwable[] throwableArray18 = encoderException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = encoderException17.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray23 = encoderException22.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException22);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException22);
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException("");
        encoderException29.addSuppressed((java.lang.Throwable) encoderException31);
        org.apache.commons.codec.EncoderException encoderException33 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException31);
        org.apache.commons.codec.EncoderException encoderException34 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException31);
        encoderException25.addSuppressed((java.lang.Throwable) encoderException31);
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException31);
        org.apache.commons.codec.EncoderException encoderException37 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException36);
        encoderException17.addSuppressed((java.lang.Throwable) encoderException36);
        org.apache.commons.codec.EncoderException encoderException39 = new org.apache.commons.codec.EncoderException("ARKPKSKM", (java.lang.Throwable) encoderException17);
        java.lang.Throwable[] throwableArray40 = encoderException17.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = doubleMetaphone0.encode((java.lang.Object) encoderException17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("ARKPXKMNSKTKNKTRKSPXN", "org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.append('#');
        doubleMetaphoneResult7.appendAlternate("\000");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('#');
        doubleMetaphoneResult7.appendPrimary(" Ha#");
        doubleMetaphoneResult7.appendPrimary("org.apache");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append('a', ' ');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: a ", "ARKPXKMNSK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str16 = doubleMetaphone14.doubleMetaphone("");
        doubleMetaphone14.setMaxCodeLen((int) (byte) 10);
        int int19 = doubleMetaphone14.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone14.new DoubleMetaphoneResult(10);
        boolean boolean22 = doubleMetaphoneResult21.isComplete();
        java.lang.String str23 = doubleMetaphoneResult21.getPrimary();
        doubleMetaphoneResult21.appendAlternate("ARKPXKMNSK");
        java.lang.String str26 = doubleMetaphoneResult21.getAlternate();
        doubleMetaphoneResult21.appendPrimary(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ARKPXKMNSK" + "'", str26, "ARKPXKMNSK");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendPrimary(" ");
        doubleMetaphoneResult7.appendAlternate("ARKPX");
        java.lang.String str26 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " HHA " + "'", str26, " HHA ");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.appendAlternate("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.maxCodeLen;
        char char11 = doubleMetaphone0.charAt("  ", (int) 'E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual(" H#", "");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int14 = doubleMetaphone13.maxCodeLen;
        java.lang.String str16 = doubleMetaphone13.doubleMetaphone("H");
        char char19 = doubleMetaphone13.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone13.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str23 = doubleMetaphone13.encode("");
        int int24 = doubleMetaphone13.getMaxCodeLen();
        java.lang.String str27 = doubleMetaphone13.doubleMetaphone("RKPK", true);
        doubleMetaphone13.maxCodeLen = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RKPK" + "'", str27, "RKPK");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.lang.String[] strArray13 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) 'A', 4, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: ARKPX", 4, (-1), strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendAlternate("  #");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        int int11 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("ARKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ARKP" + "'", str17, "ARKP");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append("org.apache.commons.codec.EncoderException:  ");
        doubleMetaphoneResult10.appendPrimary('o');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('\000', 'A');
        doubleMetaphoneResult7.append("ARKPKSKMNS");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        java.lang.String str18 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000AARKPKSKM" + "'", str18, "\000AARKPKSKM");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.lang.String[] strArray16 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) 'a', 4, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKMNSK", 10, 1, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj8 = doubleMetaphone0.encode((java.lang.Object) "#org.apach");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "RKPK" + "'", obj8, "RKPK");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "org.apache", false);
        java.lang.String str7 = doubleMetaphone0.encode("a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str10 = doubleMetaphone8.doubleMetaphone("");
        doubleMetaphone8.setMaxCodeLen((int) (byte) 10);
        int int13 = doubleMetaphone8.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone8.new DoubleMetaphoneResult(10);
        boolean boolean16 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendPrimary(' ');
        doubleMetaphoneResult15.appendPrimary("H");
        doubleMetaphoneResult15.append("", "");
        doubleMetaphoneResult15.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult15.appendPrimary("#org.apach");
        doubleMetaphoneResult15.appendPrimary(" ");
        java.lang.String str30 = doubleMetaphoneResult15.getPrimary();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " Horg.apac" + "'", str30, " Horg.apac");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        char char14 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 1);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSKTKNKTRKSPXN", true);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual(" H#", "org.apache.commons.codec.EncoderException: ", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'r' + "'", char14 == 'r');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append('\000');
        java.lang.String str23 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " HHAa\000" + "'", str23, " HHAa\000");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.append('A');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.appendPrimary('#');
        doubleMetaphoneResult7.append(' ');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str23 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str24 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "  " + "'", str22, "  ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " H# " + "'", str23, " H# ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " H# " + "'", str24, " H# ");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('\000', 'A');
        doubleMetaphoneResult7.append("ARKPKSKMNS");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str19 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary(" Horg.apac");
        boolean boolean22 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('r', 'a');
        doubleMetaphoneResult7.appendAlternate('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000AARKPKSKM" + "'", str19, "\000AARKPKSKM");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 'a';
        doubleMetaphone0.maxCodeLen = 'e';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str12 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str13 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache" + "'", str11, "org.apache");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.append('\000', 'a');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: A", "ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN");
        boolean boolean25 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.appendPrimary('#');
        doubleMetaphoneResult7.append(' ');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str23 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate(' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "  " + "'", str22, "  ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " H# " + "'", str23, " H# ");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.encode("RKPK");
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK", true);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("");
        encoderException22.addSuppressed((java.lang.Throwable) encoderException24);
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException24);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException26);
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException("ARKP", (java.lang.Throwable) encoderException26);
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException(" ", (java.lang.Throwable) encoderException28);
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException(" ", (java.lang.Throwable) encoderException29);
        org.apache.commons.codec.EncoderException encoderException33 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray34 = encoderException33.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException35 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException33);
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException33);
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException42 = new org.apache.commons.codec.EncoderException("");
        encoderException40.addSuppressed((java.lang.Throwable) encoderException42);
        org.apache.commons.codec.EncoderException encoderException44 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException42);
        org.apache.commons.codec.EncoderException encoderException45 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException42);
        encoderException36.addSuppressed((java.lang.Throwable) encoderException42);
        encoderException29.addSuppressed((java.lang.Throwable) encoderException42);
        java.lang.Throwable[] throwableArray48 = encoderException29.getSuppressed();
        java.lang.Throwable[] throwableArray49 = encoderException29.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = doubleMetaphone0.encode((java.lang.Object) throwableArray49);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RKPK" + "'", str10, "RKPK");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ARKP" + "'", str15, "ARKP");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char14 = doubleMetaphone0.charAt("org.apache", (-1));
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("Aar", false);
        java.lang.String str19 = doubleMetaphone0.encode(" ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AR" + "'", str17, "AR");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.append("ARKP");
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HARKP" + "'", str15, "HARKP");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt(" ", (int) 'a');
        doubleMetaphone0.maxCodeLen = 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.lang.String[] strArray10 = new java.lang.String[] { "ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN", "HAorg.apac", "aorg.apach", "RKPK" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains(" org.apach", (int) (byte) -1, (int) '#', strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKSKM", (int) '#', 0, strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        char char11 = doubleMetaphone0.charAt("", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult13.appendPrimary("ARKP");
        doubleMetaphoneResult13.append("ARKPK", "\000AARKPKSKM");
        java.lang.String str19 = doubleMetaphoneResult13.getPrimary();
        boolean boolean20 = doubleMetaphoneResult13.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPARKPK" + "'", str19, "ARKPARKPK");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("ARKPXKMNSKTKNKTRKSPXN", "org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.appendPrimary('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache", true);
        java.lang.String str9 = doubleMetaphone0.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        java.lang.String str11 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        char char14 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'r' + "'", char14 == 'r');
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str10 = doubleMetaphone0.encode(" H# ");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone(" HHA");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult7.getAlternate();
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("\000");
        doubleMetaphoneResult7.append('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPX", "ARKPKSKMNS", true);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ARKPKSKMN", "ARKPKS", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str20 = doubleMetaphone18.doubleMetaphone("");
        doubleMetaphone18.setMaxCodeLen((int) (byte) 10);
        int int23 = doubleMetaphone18.getMaxCodeLen();
        int int24 = doubleMetaphone18.getMaxCodeLen();
        int int25 = doubleMetaphone18.getMaxCodeLen();
        char char28 = doubleMetaphone18.charAt("ARKP", (int) (byte) -1);
        java.lang.String str30 = doubleMetaphone18.doubleMetaphone("org.apache");
        int int31 = doubleMetaphone18.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone18.new DoubleMetaphoneResult(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ARKPX" + "'", str30, "ARKPX");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj8 = doubleMetaphone0.encode((java.lang.Object) "#org.apach");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNS", "Aar", false);
        char char15 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: a", (int) 'r');
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray19 = encoderException18.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException18);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException18);
        java.lang.Throwable[] throwableArray22 = encoderException18.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) encoderException18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "RKPK" + "'", obj8, "RKPK");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult8.appendAlternate("\000AARKPKSKM");
        doubleMetaphoneResult8.appendPrimary('.');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "ARKPXKMNSKTKNKTRKSPXN", false);
        int int15 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary(' ');
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('T', 'H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone11.new DoubleMetaphoneResult(10);
        boolean boolean19 = doubleMetaphoneResult18.isComplete();
        doubleMetaphoneResult18.append("");
        doubleMetaphoneResult18.append('a', '#');
        doubleMetaphoneResult18.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult18.appendAlternate("");
        doubleMetaphoneResult18.appendPrimary("a");
        java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) "a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'r');
        doubleMetaphoneResult33.appendPrimary('o');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.setMaxCodeLen(0);
        int int15 = doubleMetaphone0.maxCodeLen;
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("#org.apach", "ARKPX");
        int int19 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append("\000", "org.apache.commons.codec.EncoderException: a");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult9.append("org.apache.commons.codec.EncoderException:   #\000");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual(" org.apach", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", false);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!org.apa", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.setMaxCodeLen((int) 'A');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str8 = doubleMetaphone6.encode("hi!");
        char char11 = doubleMetaphone6.charAt("", 100);
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone6.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult16.append(' ', '4');
        doubleMetaphoneResult16.append("ARKPKSKMNS");
        doubleMetaphoneResult16.appendAlternate('.');
        doubleMetaphoneResult16.append("ARKP", "");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ARKP" + "'", str3, "ARKP");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj7 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str9 = doubleMetaphone0.encode("  #\000");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache", "org.apache.commons.codec.EncoderException: H");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "H" + "'", obj7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        java.lang.String str12 = doubleMetaphone0.encode("ARKPX");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPKS" + "'", str12, "ARKPKS");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.encode("Aa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 'a';
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) " H#");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000AARKPKSKM");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary("#org.apach");
        doubleMetaphoneResult7.appendPrimary(" ");
        doubleMetaphoneResult7.append('\000');
        doubleMetaphoneResult7.appendAlternate("HRKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone10.encode("hi!");
        char char15 = doubleMetaphone10.charAt("", 100);
        java.lang.String str17 = doubleMetaphone10.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone10.maxCodeLen = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ARKP" + "'", str17, "ARKP");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult9.append(" org.apach");
        java.lang.String str12 = doubleMetaphoneResult9.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " org.apach" + "'", str12, " org.apach");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.lang.String[] strArray16 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache", (int) '\000', (int) (short) 100, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKSKM", 0, (int) 'o', strArray16);
        java.lang.Class<?> wildcardClass21 = strArray16.getClass();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException:   #\000");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        doubleMetaphone0.maxCodeLen = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        doubleMetaphone0.maxCodeLen = 'A';
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass13 = doubleMetaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.append('e');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.lang.String[] strArray10 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: hi!org.apa", (int) (short) 1, (int) ' ', strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('a', ' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("ARKPKMNSK", "ARKPARKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('#');
        java.lang.String str13 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#" + "'", str14, "#");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('.', 'a');
        doubleMetaphoneResult7.append('a', 'A');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " H\000" + "'", str17, " H\000");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult5.append('a', ' ');
        boolean boolean9 = doubleMetaphoneResult5.isComplete();
        java.lang.String str10 = doubleMetaphoneResult5.getPrimary();
        doubleMetaphoneResult5.append('#', 'r');
        doubleMetaphoneResult5.append('R');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str18 = doubleMetaphone0.encode("ARKPKSKMNS");
        doubleMetaphone0.maxCodeLen = '.';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKPKSKMNS" + "'", str18, "ARKPKSKMNS");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        java.lang.String str9 = doubleMetaphone0.encode("#org.apach");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("#org.apach");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!.", "org.apache.commons.codec.EncoderException: ARKPX", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RKPK" + "'", str9, "RKPK");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RKPK" + "'", str11, "RKPK");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException:  ");
        doubleMetaphoneResult7.append('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str12 = doubleMetaphone0.encode("a");
        java.lang.String str14 = doubleMetaphone0.encode("a");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj8 = doubleMetaphone0.encode((java.lang.Object) "#org.apach");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "RKPK" + "'", obj8, "RKPK");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean14 = doubleMetaphoneResult13.isComplete();
        java.lang.String str15 = doubleMetaphoneResult13.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSK" + "'", str11, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('\000', 'A');
        doubleMetaphoneResult7.append("ARKPKSKMNS");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str19 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary(" Horg.apac");
        doubleMetaphoneResult7.append('#');
        java.lang.Class<?> wildcardClass24 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000AARKPKSKM" + "'", str19, "\000AARKPKSKM");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append(' ', 'o');
        doubleMetaphoneResult7.append('4', 'r');
        doubleMetaphoneResult7.append(' ', 'o');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 111;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("hi!org.apa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HRKP" + "'", str15, "HRKP");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.lang.String[] strArray28 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: a", (int) 'o', (int) 'A', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("RKPK", (int) (byte) 100, (int) 'r', strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'o', (int) (short) 10, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (byte) 10, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("Aar", (int) (byte) 1, (int) 'E', strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000org.apach", (int) 'E', 111, strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("  #\000", "org.apache.commons.codec.EncoderException: #org.apach");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNS", " HHA");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        doubleMetaphone0.setMaxCodeLen((int) 'A');
        int int10 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 65 + "'", int10 == 65);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append('4', 'E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append("ARKPKSKMNS", "ARKPXKMNSK");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ", "");
        doubleMetaphoneResult7.append("ARKPKS");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str10 = doubleMetaphone8.doubleMetaphone("");
        doubleMetaphone8.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone8.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone8.new DoubleMetaphoneResult((int) (short) 1);
        boolean boolean19 = doubleMetaphone8.isDoubleMetaphoneEqual("  #\000", "org.apache.commons.codec.EncoderException: #org.apach");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 'A';
        doubleMetaphone0.maxCodeLen = 32;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone(" HHAa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKP");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate('H');
        java.lang.String str17 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('.');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#H" + "'", str17, "#H");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone12.doubleMetaphone("");
        doubleMetaphone12.setMaxCodeLen((int) (byte) 10);
        int int17 = doubleMetaphone12.getMaxCodeLen();
        int int18 = doubleMetaphone12.getMaxCodeLen();
        char char21 = doubleMetaphone12.charAt(" ", (int) 'A');
        doubleMetaphone12.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone12.new DoubleMetaphoneResult((-1));
        doubleMetaphoneResult25.append('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.encode("ARKPKSKMNS");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("a", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("RKPK");
        doubleMetaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((int) 'r');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("hi!org.apa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HRKP" + "'", str16, "HRKP");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        doubleMetaphoneResult7.append('a', 'a');
        doubleMetaphoneResult7.appendAlternate('.');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        char char7 = doubleMetaphone0.charAt("#org.apach", (int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'o' + "'", char7 == 'o');
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "hi!", true);
        java.lang.String str17 = doubleMetaphone0.encode("a");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "hi!");
        doubleMetaphoneResult7.appendAlternate("org.apache");
        doubleMetaphoneResult7.appendAlternate('.');
        boolean boolean22 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache", true);
        java.lang.String str9 = doubleMetaphone0.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult11.appendPrimary('a');
        doubleMetaphoneResult11.appendPrimary('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('o', 'T');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate('\000');
        boolean boolean20 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append(" ");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char14 = doubleMetaphone0.charAt("org.apache", (-1));
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'A');
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str19, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str23, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '.');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.Class<?> wildcardClass8 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.maxCodeLen = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('\000');
        doubleMetaphoneResult7.append("", "#");
        doubleMetaphoneResult7.append('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H", false);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "ARKPXKMNSKTKNKTRKSPXN", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str8, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append(" ", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = doubleMetaphoneResult12.getPrimary();
        doubleMetaphoneResult12.appendPrimary('4');
        doubleMetaphoneResult12.append('a', 'a');
        boolean boolean22 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.appendPrimary('o');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.lang.String[] strArray16 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: ", 100, (int) 'a', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains(" org.apach", (int) (short) 100, (int) 'T', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.lang.String[] strArray16 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache", (int) '\000', (int) (short) 100, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKKMNSK", (int) 'R', 0, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult7.getAlternate();
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("\000");
        doubleMetaphoneResult7.appendAlternate('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str13 = doubleMetaphone0.encode("ARKPKS");
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = doubleMetaphone0.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        char char13 = doubleMetaphone0.charAt("", (int) 'a');
        char char16 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", 0);
        doubleMetaphone0.setMaxCodeLen(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'o' + "'", char16 == 'o');
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        doubleMetaphoneResult13.appendAlternate('.');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("ARKPXKMNSKTKNKTRKSPXN", "org.apache.commons.codec.EncoderException: H");
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('\000', 'H');
        doubleMetaphoneResult7.append('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode(obj11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendPrimary(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate('E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#" + "'", str16, "#");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.maxCodeLen;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone10.doubleMetaphone("");
        doubleMetaphone10.setMaxCodeLen((int) (byte) 10);
        int int15 = doubleMetaphone10.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone10.new DoubleMetaphoneResult(10);
        boolean boolean18 = doubleMetaphoneResult17.isComplete();
        boolean boolean19 = doubleMetaphoneResult17.isComplete();
        doubleMetaphoneResult17.append(" ");
        java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) " ");
        int int23 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append("A");
        doubleMetaphoneResult12.append('H', 'o');
        doubleMetaphoneResult12.append(' ', 'E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getPrimary();
        doubleMetaphoneResult6.append("#hi!ARKPXK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult6.append(" H#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("ARKP", (int) (byte) -1);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("  #\000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str15 = doubleMetaphone13.doubleMetaphone("");
        doubleMetaphone13.setMaxCodeLen((int) (byte) 10);
        int int18 = doubleMetaphone13.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone13.new DoubleMetaphoneResult(10);
        boolean boolean21 = doubleMetaphoneResult20.isComplete();
        doubleMetaphoneResult20.append("");
        doubleMetaphoneResult20.append('#');
        doubleMetaphoneResult20.appendPrimary(" Ha#");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.encode("");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        java.lang.Throwable[] throwableArray16 = encoderException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = encoderException15.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray21 = encoderException20.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException("");
        encoderException27.addSuppressed((java.lang.Throwable) encoderException29);
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException29);
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException29);
        encoderException23.addSuppressed((java.lang.Throwable) encoderException29);
        org.apache.commons.codec.EncoderException encoderException34 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException29);
        org.apache.commons.codec.EncoderException encoderException35 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException34);
        encoderException15.addSuppressed((java.lang.Throwable) encoderException34);
        org.apache.commons.codec.EncoderException encoderException37 = new org.apache.commons.codec.EncoderException("ARKPKSKM", (java.lang.Throwable) encoderException15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) encoderException37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('\000', 'A');
        doubleMetaphoneResult7.append("ARKPKSKMNS");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str19 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary(" Horg.apac");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append("", "ARKPKSKMNS");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000AARKPKSKM" + "'", str19, "\000AARKPKSKM");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str5 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("#hi!ARKPXK", "hi!.", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKPKSKMNS" + "'", str5, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.lang.String[] strArray22 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: ", 100, (int) 'a', strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKKMNSK", 0, 0, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKSKMNSKTKNKTRKSPKSN", (int) '4', 35, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains(" HHAa", (int) 'R', (int) (byte) 1, strArray22);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('\000', 'A');
        doubleMetaphoneResult7.append("ARKPKSKMNS");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("ARKPKMNSK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.encode("");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("RKPK", true);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPARKPK", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RKPK" + "'", str14, "RKPK");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        doubleMetaphone0.maxCodeLen = 'A';
        int int12 = doubleMetaphone0.maxCodeLen;
        char char15 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (short) -1);
        java.lang.String str17 = doubleMetaphone0.encode("hi!org.apa");
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HRKP" + "'", str17, "HRKP");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append(' ', 'a');
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary("");
        boolean boolean19 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        java.lang.String str12 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.encode("");
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("ARKP", (int) (byte) -1);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("#hi!ARKPXK", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult19.appendAlternate('r');
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult19.appendAlternate("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPX" + "'", str12, "ARKPX");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RKPKSK" + "'", str17, "RKPKSK");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append(' ');
        java.lang.String str22 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " Horg.apac" + "'", str22, " Horg.apac");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('\000', 'A');
        doubleMetaphoneResult7.append("ARKPKSKMNS");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendAlternate('#');
        doubleMetaphoneResult7.appendAlternate('E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('\000');
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendPrimary('H');
        java.lang.String str20 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('a', '4');
        boolean boolean24 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000" + "'", str15, "\000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000org.apach" + "'", str20, "\000org.apach");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual(" H#", "", true);
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode(obj11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str15 = doubleMetaphone0.encode("A");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendPrimary(" ");
        doubleMetaphoneResult7.appendAlternate("ARKPX");
        doubleMetaphoneResult7.append('H', '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H", false);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone(" H\000", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = doubleMetaphone12.maxCodeLen;
        java.lang.String str15 = doubleMetaphone12.encode("");
        boolean boolean19 = doubleMetaphone12.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        boolean boolean23 = doubleMetaphone12.isDoubleMetaphoneEqual("ARKP", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str25 = doubleMetaphone12.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) str25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str8, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ARKP" + "'", str25, "ARKP");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "ARKP" + "'", obj26, "ARKP");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 'a';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        int int13 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        int int13 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen(0);
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.appendPrimary('#');
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary("#org.apach");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        java.lang.Class<?> wildcardClass11 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str15 = doubleMetaphone0.encode(" ");
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult18.appendAlternate("ARKP");
        doubleMetaphoneResult18.appendPrimary('4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("HRKPK", true);
        char char24 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: ARKPX", (int) 'R');
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("aorg.apach", false);
        java.lang.String str29 = doubleMetaphone0.encode("ARKPKSKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RKPK" + "'", str21, "RKPK");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ARKPK" + "'", str27, "ARKPK");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ARKPKSKM" + "'", str29, "ARKPKSKM");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = 100;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone10.doubleMetaphone("");
        java.lang.String str14 = doubleMetaphone10.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone10.new DoubleMetaphoneResult(0);
        java.lang.String str17 = doubleMetaphoneResult16.getAlternate();
        doubleMetaphoneResult16.append(" H#");
        java.lang.Object obj20 = doubleMetaphone0.encode((java.lang.Object) " H#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.maxCodeLen = 100;
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("Aar", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str15 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str19 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.appendPrimary("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.appendPrimary("RKPK");
        doubleMetaphoneResult7.appendAlternate("HRKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        java.lang.String str12 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str14 = doubleMetaphone0.encode("RKPK");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone(" Horg.apac");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSN" + "'", str12, "ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RKPK" + "'", str14, "RKPK");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HRKPK" + "'", str16, "HRKPK");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("ARKP", (int) (byte) -1);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("hi!org.apa", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str16 = doubleMetaphone14.doubleMetaphone("");
        doubleMetaphone14.setMaxCodeLen((int) (byte) 10);
        int int19 = doubleMetaphone14.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone14.new DoubleMetaphoneResult(10);
        boolean boolean22 = doubleMetaphoneResult21.isComplete();
        boolean boolean23 = doubleMetaphoneResult21.isComplete();
        doubleMetaphoneResult21.appendAlternate("");
        java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HRKP" + "'", str13, "HRKP");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("RKPK", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RKPK" + "'", str12, "RKPK");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult6.appendPrimary('a');
        doubleMetaphoneResult6.append(' ');
        doubleMetaphoneResult6.append('\000', 'e');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.append("a ", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("", 4);
        char char14 = doubleMetaphone0.charAt("H", (int) '#');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ARKP");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone(" org.apach", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str22 = doubleMetaphone20.encode("hi!");
        char char25 = doubleMetaphone20.charAt("", 100);
        java.lang.String str27 = doubleMetaphone20.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int28 = doubleMetaphone20.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone20.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone20.maxCodeLen = (short) 1;
        java.lang.String str34 = doubleMetaphone20.doubleMetaphone("");
        java.lang.String str37 = doubleMetaphone20.doubleMetaphone("AR", true);
        java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) str37);
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKP" + "'", str16, "ARKP");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPK" + "'", str19, "ARKPK");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ARKP" + "'", str27, "ARKP");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "A" + "'", str37, "A");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "A" + "'", obj38, "A");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendPrimary('\000');
        doubleMetaphoneResult7.appendPrimary('r');
        doubleMetaphoneResult7.appendPrimary("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("ARKP", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = 'o';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.maxCodeLen;
        char char19 = doubleMetaphone11.charAt("ARKP", (int) (short) 0);
        java.lang.Object obj20 = doubleMetaphone0.encode((java.lang.Object) "ARKP");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'A' + "'", char8 == 'A');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'A' + "'", char19 == 'A');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "ARKP" + "'", obj20, "ARKP");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        doubleMetaphoneResult13.append('a');
        doubleMetaphoneResult13.appendAlternate('.');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("ARKPKSKMNS");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H", "RKPK");
        doubleMetaphoneResult7.appendAlternate('r');
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: a ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append("H", "H");
        doubleMetaphoneResult7.appendAlternate('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", false);
        doubleMetaphone0.setMaxCodeLen((int) 'r');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("ARKPKSKM");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate("ARKPKSKMNSKTKNKTRKSPKSN");
        doubleMetaphoneResult7.appendPrimary("ARKPARKPK");
        java.lang.Class<?> wildcardClass27 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode(" a");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("HAorg.apac", " H\000");
        char char10 = doubleMetaphone0.charAt("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", (int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'A' + "'", char10 == 'A');
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.append('\000', 'a');
        doubleMetaphoneResult7.appendAlternate('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult16.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.Class<?> wildcardClass17 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str20 = doubleMetaphone0.encode("");
        char char23 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", 111);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone(" HHAa", false);
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("\000org.apach", " Horg.apac", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.appendPrimary('#');
        boolean boolean20 = doubleMetaphoneResult7.isComplete();
        java.lang.Class<?> wildcardClass21 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.encode("");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("RKPK", true);
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", "hi!org.apa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RKPK" + "'", str14, "RKPK");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj8 = doubleMetaphone0.encode((java.lang.Object) "#org.apach");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "RKPK" + "'", obj8, "RKPK");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("");
        encoderException13.addSuppressed((java.lang.Throwable) encoderException15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) encoderException15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKP" + "'", str11, "ARKP");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "a", false);
        java.lang.String[] strArray29 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray29);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) 'A', 4, strArray29);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains(" Horg.apac", (int) (short) 10, (int) 'r', strArray29);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKSKMNSKTKNKTRKSPKSN", (int) (short) 100, 0, strArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str12 = doubleMetaphone0.encode("a");
        java.lang.String str14 = doubleMetaphone0.encode("a");
        java.lang.String str16 = doubleMetaphone0.encode("");
        java.lang.String str18 = doubleMetaphone0.encode(" a");
        char char21 = doubleMetaphone0.charAt("A", (int) 'o');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char14 = doubleMetaphone0.charAt("org.apache", (-1));
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult18.append('R', '\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.encode("RKPK");
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.String str14 = doubleMetaphone0.encode(" org.apach");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RKPK" + "'", str10, "RKPK");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        java.lang.String str11 = doubleMetaphone0.encode(" H\000");
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("");
        encoderException16.addSuppressed((java.lang.Throwable) encoderException18);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException18);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("ARKP", (java.lang.Throwable) encoderException20);
        java.lang.Throwable[] throwableArray23 = encoderException22.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) encoderException22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!org.apa", "", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.setMaxCodeLen(0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("a");
        doubleMetaphoneResult7.append("\000AARKPKSKM", "");
        boolean boolean19 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        int int8 = doubleMetaphone0.maxCodeLen;
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("HARKP", "", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.encode("RKPK");
        char char13 = doubleMetaphone0.charAt("  #\000", (int) '.');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RKPK" + "'", str10, "RKPK");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphone0.encode("org.apache");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str5 = doubleMetaphone0.encode("ARKPKSKMNS");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray12 = encoderException11.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException11);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException11);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("");
        encoderException18.addSuppressed((java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException20);
        encoderException14.addSuppressed((java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray30 = encoderException29.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException29);
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException29);
        java.lang.Throwable[] throwableArray33 = encoderException29.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException34 = new org.apache.commons.codec.EncoderException("ARKPXKMNSK", (java.lang.Throwable) encoderException29);
        encoderException20.addSuppressed((java.lang.Throwable) encoderException29);
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException("ARKPXKMNSKTKNKTRKSPXN", (java.lang.Throwable) encoderException29);
        java.lang.Throwable[] throwableArray37 = encoderException29.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) throwableArray37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKPKSKMNS" + "'", str5, "ARKPKSKMNS");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append(" ", "org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult12.append('4');
        doubleMetaphoneResult12.append('E', '\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str16 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.appendPrimary('#');
        boolean boolean20 = doubleMetaphoneResult7.isComplete();
        boolean boolean21 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append("H", "H");
        doubleMetaphoneResult7.appendPrimary('A');
        doubleMetaphoneResult7.append("ARKP");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone9.doubleMetaphone("");
        doubleMetaphone9.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone9.setMaxCodeLen((int) (short) 0);
        java.lang.String str17 = doubleMetaphone9.encode("");
        doubleMetaphone9.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone9.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult21.append("A");
        doubleMetaphoneResult21.appendAlternate("");
        java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('#');
        java.lang.String str13 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: hi!org.apa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "");
        java.lang.String str14 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKP" + "'", str16, "ARKP");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("ARKPXKMNSKTKNKTRKSPXN", "org.apache.commons.codec.EncoderException: H");
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('\000', 'H');
        java.lang.String str20 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('r');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKPXKMNSK" + "'", str20, "ARKPXKMNSK");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('#');
        boolean boolean22 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult7.getAlternate();
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        java.lang.String str19 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " " + "'", str19, " ");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("HRKPK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "R" + "'", str15, "R");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary('R');
        java.lang.Class<?> wildcardClass19 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        char char11 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 0);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("ARKPKS", false);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!");
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual(" Horg.apac", "Aar");
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "ARKP" + "'", obj17, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException:  ");
        doubleMetaphoneResult7.appendPrimary(" ARKPXKMNS");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str14 = doubleMetaphoneResult13.getAlternate();
        doubleMetaphoneResult13.appendPrimary("ARKPXKMNSK");
        doubleMetaphoneResult13.append('\000', '\000');
        doubleMetaphoneResult13.appendPrimary('r');
        doubleMetaphoneResult13.append("H");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.setMaxCodeLen(0);
        int int15 = doubleMetaphone0.maxCodeLen;
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("#org.apach", "ARKPX");
        doubleMetaphone0.setMaxCodeLen(65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("A", " Horg.apac", false);
        char char14 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", (int) 'o');
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = doubleMetaphone0.encode(obj15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'E' + "'", char14 == 'E');
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKMNSK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKMNSK" + "'", str9, "ARKPKMNSK");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult5.append('a', ' ');
        boolean boolean9 = doubleMetaphoneResult5.isComplete();
        java.lang.String str10 = doubleMetaphoneResult5.getPrimary();
        doubleMetaphoneResult5.append('#', 'r');
        boolean boolean14 = doubleMetaphoneResult5.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone(" Horg.apac", false);
        java.lang.String str14 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!org.apa");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HRKP" + "'", str12, "HRKP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult6.appendPrimary('a');
        doubleMetaphoneResult6.append(' ');
        doubleMetaphoneResult6.appendPrimary("  #");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        doubleMetaphoneResult7.appendAlternate(" ");
        java.lang.String str22 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append(' ');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        boolean boolean23 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: A");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('\000');
        boolean boolean15 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("a", "ARKPX");
        doubleMetaphoneResult7.appendAlternate('r');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str12 = doubleMetaphone0.encode("a");
        java.lang.String str14 = doubleMetaphone0.encode("a");
        java.lang.String str16 = doubleMetaphone0.encode("");
        java.lang.String str18 = doubleMetaphone0.encode(" a");
        char char21 = doubleMetaphone0.charAt("A", (int) 'o');
        java.lang.String str23 = doubleMetaphone0.encode(" HHAa\000");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 0, (int) (short) 100, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str16 = doubleMetaphone0.encode("RKP");
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "R" + "'", str16, "R");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendAlternate("HARKP");
        java.lang.String str20 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate('o');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache" + "'", str20, "org.apache");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.encode("hi!");
        char char16 = doubleMetaphone11.charAt("", 100);
        java.lang.String str18 = doubleMetaphone11.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int19 = doubleMetaphone11.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone11.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone11.maxCodeLen = (short) 1;
        java.lang.String str25 = doubleMetaphone11.doubleMetaphone("");
        int int26 = doubleMetaphone11.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone11.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult28.appendAlternate("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKP" + "'", str18, "ARKP");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: A");
        doubleMetaphoneResult7.appendAlternate("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("ARKP");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult13.appendPrimary('r');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKP" + "'", str11, "ARKP");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.maxCodeLen = 100;
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("");
        encoderException16.addSuppressed((java.lang.Throwable) encoderException18);
        java.lang.Throwable[] throwableArray20 = encoderException16.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray25 = encoderException24.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException24);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException24);
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException33 = new org.apache.commons.codec.EncoderException("");
        encoderException31.addSuppressed((java.lang.Throwable) encoderException33);
        org.apache.commons.codec.EncoderException encoderException35 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException33);
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException33);
        encoderException27.addSuppressed((java.lang.Throwable) encoderException33);
        org.apache.commons.codec.EncoderException encoderException38 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException27);
        encoderException16.addSuppressed((java.lang.Throwable) encoderException38);
        java.lang.Throwable[] throwableArray40 = encoderException16.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = doubleMetaphone0.encode((java.lang.Object) encoderException16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult9.append("org.apache.commons.codec.EncoderException: ARKP");
        doubleMetaphoneResult9.append('#', ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getAlternate();
        doubleMetaphoneResult6.appendAlternate('a');
        doubleMetaphoneResult6.append("ARKP");
        doubleMetaphoneResult6.append('o');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult9.append("H");
        doubleMetaphoneResult9.append("\000AARKPKSKM", "a");
        java.lang.String str15 = doubleMetaphoneResult9.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H\000AARKPKSK" + "'", str15, "H\000AARKPKSK");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) '.');
        doubleMetaphoneResult11.append(" H");
        java.lang.Class<?> wildcardClass14 = doubleMetaphoneResult11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append(' ', 'a');
        doubleMetaphoneResult7.appendPrimary('#');
        java.lang.String str16 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary('E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "  #" + "'", str16, "  #");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        doubleMetaphone0.maxCodeLen = 'A';
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.String str14 = doubleMetaphone0.encode("#org.apach");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000AARKPKSKM", false);
        char char20 = doubleMetaphone0.charAt("  #\000", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RKPK" + "'", str14, "RKPK");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ARKPKSKM" + "'", str17, "ARKPKSKM");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + ' ' + "'", char20 == ' ');
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H\000AARKPKSK", "HAorg.apac", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        java.lang.String str9 = doubleMetaphone0.encode("#org.apach");
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("#org.apach");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        char char17 = doubleMetaphone0.charAt("ARKP", 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RKPK" + "'", str9, "RKPK");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RKPK" + "'", str11, "RKPK");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + 'R' + "'", char17 == 'R');
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult8.append("org.apache.commons.codec.EncoderException: H");
        java.lang.String str11 = doubleMetaphoneResult8.getAlternate();
        boolean boolean12 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('r');
        doubleMetaphoneResult8.appendPrimary('r');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.codec.EncoderException: H" + "'", str11, "org.apache.commons.codec.EncoderException: H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate('r');
        doubleMetaphoneResult7.appendPrimary('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.lang.String[] strArray16 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) 'a', 4, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("R", (int) 'T', 0, strArray16);
        java.lang.Class<?> wildcardClass21 = strArray16.getClass();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("ARKP", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.getMaxCodeLen();
        int int17 = doubleMetaphone11.getMaxCodeLen();
        int int18 = doubleMetaphone11.getMaxCodeLen();
        char char21 = doubleMetaphone11.charAt("ARKP", (int) (byte) -1);
        java.lang.String str23 = doubleMetaphone11.doubleMetaphone("org.apache");
        java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) str23);
        java.lang.String str26 = doubleMetaphone0.encode(" H#");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'A' + "'", char8 == 'A');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ARKPX" + "'", str23, "ARKPX");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "ARKPKS" + "'", obj24, "ARKPKS");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        int int6 = doubleMetaphone0.maxCodeLen;
        char char9 = doubleMetaphone0.charAt("  ", (int) 'e');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ARKP");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'R');
        java.lang.String str16 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSK" + "'", str13, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.appendAlternate(" ");
        java.lang.Class<?> wildcardClass18 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        doubleMetaphone0.maxCodeLen = 'A';
        java.lang.String str10 = doubleMetaphone0.encode(" ");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("  #", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKPXKMNSK" + "'", str6, "ARKPXKMNSK");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        java.lang.String str10 = doubleMetaphoneResult9.getAlternate();
        doubleMetaphoneResult9.appendPrimary('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult11.appendAlternate('o');
        java.lang.String str14 = doubleMetaphoneResult11.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        java.lang.Class<?> wildcardClass8 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "hi!", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str18 = doubleMetaphone16.doubleMetaphone("");
        doubleMetaphone16.setMaxCodeLen((int) (byte) 10);
        int int21 = doubleMetaphone16.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone16.new DoubleMetaphoneResult(10);
        boolean boolean24 = doubleMetaphoneResult23.isComplete();
        doubleMetaphoneResult23.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str31 = doubleMetaphone0.encode(" H#");
        java.lang.String str33 = doubleMetaphone0.encode(" HHAa\000");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary("a");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "aorg.apach" + "'", str16, "aorg.apach");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray12 = encoderException11.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException11);
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException11);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("");
        encoderException18.addSuppressed((java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException20);
        encoderException14.addSuppressed((java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException20);
        java.lang.Throwable[] throwableArray26 = encoderException20.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) throwableArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('o', 'H');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AH" + "'", str16, "AH");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        int int19 = doubleMetaphone0.getMaxCodeLen();
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str15 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = 'o';
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str19, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.append("");
        boolean boolean15 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendAlternate('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "hi!");
        doubleMetaphoneResult7.appendAlternate("org.apache");
        doubleMetaphoneResult7.append('r');
        doubleMetaphoneResult7.append('r', ' ');
        doubleMetaphoneResult7.append('R', 'A');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        char char8 = doubleMetaphone0.charAt("", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone9.doubleMetaphone("");
        doubleMetaphone9.setMaxCodeLen((int) (byte) 10);
        int int14 = doubleMetaphone9.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone9.new DoubleMetaphoneResult(10);
        boolean boolean17 = doubleMetaphoneResult16.isComplete();
        doubleMetaphoneResult16.appendPrimary(' ');
        doubleMetaphoneResult16.appendPrimary("H");
        doubleMetaphoneResult16.append("", "");
        doubleMetaphoneResult16.append("org.apache.commons.codec.EncoderException: ");
        java.lang.String str27 = doubleMetaphoneResult16.getAlternate();
        java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) str27);
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: a", "hi!");
        int int32 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.apache" + "'", str27, "org.apache");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "ARKP" + "'", obj28, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("RKPK", (int) (byte) 10);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("a", false);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "ARKPARKPK", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult10.append(' ', '4');
        doubleMetaphoneResult10.appendPrimary(" Horg.apac");
        doubleMetaphoneResult10.append('A', '\000');
        doubleMetaphoneResult10.append(" a", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('\000');
        doubleMetaphoneResult7.appendPrimary('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.appendAlternate('E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("A");
        doubleMetaphoneResult7.appendAlternate('R');
        java.lang.String str21 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('r', 'T');
        doubleMetaphoneResult7.appendAlternate('A');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#org.apach" + "'", str21, "#org.apach");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append('#', 'E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        char char4 = doubleMetaphone0.charAt("ARKPXKMNSK", (int) (byte) 0);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        char char9 = doubleMetaphone0.charAt("", (int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'A' + "'", char4 == 'A');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult13.appendAlternate("ARKPKSKMNS");
        doubleMetaphoneResult13.appendAlternate('T');
        doubleMetaphoneResult13.append('A');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        doubleMetaphone0.maxCodeLen = 'A';
        int int12 = doubleMetaphone0.maxCodeLen;
        int int13 = doubleMetaphone0.maxCodeLen;
        char char16 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", (int) (short) 100);
        java.lang.String str18 = doubleMetaphone0.encode("org.apache");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 65 + "'", int13 == 65);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKPX" + "'", str18, "ARKPX");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000", true);
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = doubleMetaphone0.encode(obj17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        doubleMetaphone0.setMaxCodeLen((int) 'A');
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("HRKP", false);
        char char15 = doubleMetaphone0.charAt("ARKPARKPK", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RKP" + "'", str12, "RKP");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.appendAlternate(" ");
        doubleMetaphoneResult7.appendPrimary(' ');
        java.lang.String str20 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(" org.apach");
        doubleMetaphoneResult7.append("\000AARKPKSKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "  " + "'", str20, "  ");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str13 = doubleMetaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSN");
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H", "", false);
        int int18 = doubleMetaphone0.maxCodeLen;
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: #org.apach", "ARKPKKMNSK", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN" + "'", str11, "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSN" + "'", str13, "ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary("");
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("a");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: A", "H");
        java.lang.Class<?> wildcardClass19 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache" + "'", str13, "org.apache");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('A');
        java.lang.String str19 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary("ARKPKS");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " HHA" + "'", str19, " HHA");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.appendAlternate(" ");
        doubleMetaphoneResult7.appendPrimary("");
        boolean boolean20 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        char char11 = doubleMetaphone0.charAt("", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult13.appendPrimary("ARKP");
        doubleMetaphoneResult13.append("ARKPK", "\000AARKPKSKM");
        doubleMetaphoneResult13.append('a', '.');
        doubleMetaphoneResult13.append(' ', 'o');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        java.lang.String str10 = doubleMetaphone0.encode("");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKS", " Horg.apac", false);
        char char17 = doubleMetaphone0.charAt("ARKPK", 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str8 = doubleMetaphone0.encode(" HHA");
        java.lang.String str10 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("HRKPK", true);
        int int22 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RKPK" + "'", str21, "RKPK");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary("");
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("a");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ARKP");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache" + "'", str13, "org.apache");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("#org.apach", "#org.apach");
        int int17 = doubleMetaphone0.maxCodeLen;
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode(obj18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("A", " Horg.apac", false);
        doubleMetaphone0.setMaxCodeLen((int) 'o');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append(' ', 'a');
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.append("ARKP");
        doubleMetaphoneResult7.appendAlternate('a');
        java.lang.String str21 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "aAARKPa" + "'", str21, "aAARKPa");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("ARKP");
        java.lang.String str8 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'r');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPKSKMNS" + "'", str8, "ARKPKSKMNS");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = 'r';
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("ARKPX", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPKS" + "'", str11, "ARKPKS");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: ARKPX");
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(" Ha#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#org.apach" + "'", str22, "#org.apach");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str17 = doubleMetaphone15.encode("hi!");
        char char20 = doubleMetaphone15.charAt("", 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = doubleMetaphone0.encode((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str13, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        char char13 = doubleMetaphone0.charAt("", (int) 'a');
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", true);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("");
        encoderException19.addSuppressed((java.lang.Throwable) encoderException21);
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException21);
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException23);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("ARKP", (java.lang.Throwable) encoderException23);
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException(" ", (java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException(" ", (java.lang.Throwable) encoderException26);
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray31 = encoderException30.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException30);
        org.apache.commons.codec.EncoderException encoderException33 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException30);
        org.apache.commons.codec.EncoderException encoderException37 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException39 = new org.apache.commons.codec.EncoderException("");
        encoderException37.addSuppressed((java.lang.Throwable) encoderException39);
        org.apache.commons.codec.EncoderException encoderException41 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException39);
        org.apache.commons.codec.EncoderException encoderException42 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException39);
        encoderException33.addSuppressed((java.lang.Throwable) encoderException39);
        encoderException26.addSuppressed((java.lang.Throwable) encoderException39);
        org.apache.commons.codec.EncoderException encoderException45 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException:  ", (java.lang.Throwable) encoderException39);
        org.apache.commons.codec.EncoderException encoderException46 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException45);
        org.apache.commons.codec.EncoderException encoderException47 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: H", (java.lang.Throwable) encoderException46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = doubleMetaphone0.encode((java.lang.Object) encoderException46);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN" + "'", str10, "ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("a");
        doubleMetaphoneResult7.append("\000AARKPKSKM", "");
        doubleMetaphoneResult7.appendPrimary('\000');
        boolean boolean21 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("ARKP", (int) (byte) -1);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("#hi!ARKPXK", true);
        java.lang.String str19 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPX" + "'", str12, "ARKPX");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RKPKSK" + "'", str17, "RKPKSK");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPXKMNSK" + "'", str19, "ARKPXKMNSK");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone11.new DoubleMetaphoneResult(10);
        boolean boolean19 = doubleMetaphoneResult18.isComplete();
        doubleMetaphoneResult18.append("");
        doubleMetaphoneResult18.append('a', '#');
        doubleMetaphoneResult18.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult18.appendAlternate("");
        doubleMetaphoneResult18.appendPrimary("a");
        java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) "a");
        char char34 = doubleMetaphone0.charAt("ARKPXKMNSK", (int) '#');
        java.lang.String str36 = doubleMetaphone0.doubleMetaphone("a ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\000' + "'", char34 == '\000');
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary("#org.apach");
        doubleMetaphoneResult7.appendPrimary(" ");
        doubleMetaphoneResult7.append('\000');
        doubleMetaphoneResult7.append('a');
        doubleMetaphoneResult7.appendPrimary('e');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("", 4);
        char char14 = doubleMetaphone0.charAt("H", (int) '#');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ARKP");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone(" Horg.apac", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKP" + "'", str16, "ARKP");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HRKPK" + "'", str19, "HRKPK");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("A", true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("Aar", "org.apache.commons.codec.EncoderException: hi!");
        char char15 = doubleMetaphone0.charAt("ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'A' + "'", char15 == 'A');
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'T');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult13.appendPrimary("  ");
        doubleMetaphoneResult13.append("org.apache", " HHAa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("ARKP");
        char char9 = doubleMetaphone0.charAt(" ", (int) '#');
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone11.new DoubleMetaphoneResult(10);
        boolean boolean19 = doubleMetaphoneResult18.isComplete();
        doubleMetaphoneResult18.appendPrimary(' ');
        doubleMetaphoneResult18.appendPrimary("H");
        doubleMetaphoneResult18.append('\000', ' ');
        java.lang.String str27 = doubleMetaphoneResult18.getAlternate();
        java.lang.String str28 = doubleMetaphoneResult18.getPrimary();
        doubleMetaphoneResult18.append('.', 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " " + "'", str27, " ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " H\000" + "'", str28, " H\000");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = doubleMetaphone5.maxCodeLen;
        java.lang.String str8 = doubleMetaphone5.encode("");
        java.lang.String str10 = doubleMetaphone5.encode("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str12 = doubleMetaphone5.encode("H");
        java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) "H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'e');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "hi!");
        doubleMetaphoneResult7.appendAlternate("org.apache");
        doubleMetaphoneResult7.append('r');
        doubleMetaphoneResult7.append('r', ' ');
        boolean boolean25 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphoneResult13.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str7 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str10 = doubleMetaphone8.doubleMetaphone("");
        doubleMetaphone8.setMaxCodeLen((int) (byte) 10);
        int int13 = doubleMetaphone8.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone8.new DoubleMetaphoneResult(10);
        boolean boolean16 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendPrimary(' ');
        doubleMetaphoneResult15.append(' ', 'a');
        boolean boolean22 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendAlternate('A');
        doubleMetaphoneResult15.append("ARKP");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone0.encode("  #");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.setMaxCodeLen((int) 'A');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ARKP" + "'", str3, "ARKP");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str5 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('R');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKPKSKMNS" + "'", str5, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        char char13 = doubleMetaphone0.charAt("#org.apach", (int) (short) -1);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.maxCodeLen = 0;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone12.doubleMetaphone("");
        doubleMetaphone12.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone12.maxCodeLen = (byte) 10;
        boolean boolean22 = doubleMetaphone12.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int23 = doubleMetaphone12.getMaxCodeLen();
        java.lang.String str25 = doubleMetaphone12.doubleMetaphone("A");
        int int26 = doubleMetaphone12.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) int26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str15 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = 'o';
        char char20 = doubleMetaphone0.charAt("ARKPKS", (int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        int int23 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'R' + "'", char20 == 'R');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 111 + "'", int23 == 111);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.encode("  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) " H#");
        doubleMetaphone0.maxCodeLen = (short) 100;
        int int15 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.encode(" ");
        java.lang.String str19 = doubleMetaphone0.encode("ARKPKS");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("#H", "", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPKS" + "'", str19, "ARKPKS");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone11.new DoubleMetaphoneResult(10);
        boolean boolean19 = doubleMetaphoneResult18.isComplete();
        doubleMetaphoneResult18.append("");
        doubleMetaphoneResult18.append('a', '#');
        doubleMetaphoneResult18.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult18.appendAlternate("");
        doubleMetaphoneResult18.appendPrimary("a");
        java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) "a");
        doubleMetaphone0.maxCodeLen = (byte) 10;
        java.lang.String str35 = doubleMetaphone0.encode("ARKP");
        char char38 = doubleMetaphone0.charAt("ARKPKMNSK", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ARKP" + "'", str35, "ARKP");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + 'K' + "'", char38 == 'K');
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult10.append(' ', '4');
        doubleMetaphoneResult10.appendPrimary(" Horg.apac");
        java.lang.String str16 = doubleMetaphoneResult10.getAlternate();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary("#org.apach");
        doubleMetaphoneResult7.appendPrimary(" ");
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        doubleMetaphoneResult7.appendPrimary("hi!");
        java.lang.String str17 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000hi!" + "'", str17, "\000hi!");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = doubleMetaphone8.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone8.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str15 = doubleMetaphone8.doubleMetaphone("org.apache", true);
        java.lang.String str17 = doubleMetaphone8.encode("H");
        java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) str17);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str22 = doubleMetaphone0.encode("\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ARKP" + "'", str15, "ARKP");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache");
        doubleMetaphone0.maxCodeLen = 65;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("ARKPKSKM");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPKSKM" + "'", str11, "ARKPKSKM");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        doubleMetaphoneResult7.appendPrimary('a');
        boolean boolean22 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append(' ', 'E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'o');
        doubleMetaphoneResult10.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        char char8 = doubleMetaphone0.charAt("", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone9.doubleMetaphone("");
        doubleMetaphone9.setMaxCodeLen((int) (byte) 10);
        int int14 = doubleMetaphone9.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone9.new DoubleMetaphoneResult(10);
        boolean boolean17 = doubleMetaphoneResult16.isComplete();
        doubleMetaphoneResult16.appendPrimary(' ');
        doubleMetaphoneResult16.appendPrimary("H");
        doubleMetaphoneResult16.append("", "");
        doubleMetaphoneResult16.append("org.apache.commons.codec.EncoderException: ");
        java.lang.String str27 = doubleMetaphoneResult16.getAlternate();
        java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) str27);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone29 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int30 = doubleMetaphone29.maxCodeLen;
        java.lang.String str32 = doubleMetaphone29.doubleMetaphone("H");
        char char35 = doubleMetaphone29.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult37 = doubleMetaphone29.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult37.append("org.apache.commons.codec.EncoderException: H");
        java.lang.Object obj40 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.apache" + "'", str27, "org.apache");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "ARKP" + "'", obj28, "ARKP");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "ARKP" + "'", obj40, "ARKP");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("ARKP");
        char char9 = doubleMetaphone0.charAt(" ", (int) '#');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone(" Horg.apac");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HRKPK" + "'", str11, "HRKPK");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.setMaxCodeLen(0);
        int int15 = doubleMetaphone0.maxCodeLen;
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("#hi!ARKPXK", "aorg.apach");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("#org.apach");
        java.lang.String str24 = doubleMetaphone0.encode(" ARKPXKMNS");
        java.lang.String str26 = doubleMetaphone0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((int) 'r');
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone(" H", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append('a');
        doubleMetaphoneResult7.appendPrimary('R');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str5 = doubleMetaphone3.doubleMetaphone("");
        doubleMetaphone3.setMaxCodeLen((int) (byte) 10);
        int int8 = doubleMetaphone3.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone3.new DoubleMetaphoneResult(10);
        boolean boolean14 = doubleMetaphone3.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone3.new DoubleMetaphoneResult(10);
        java.lang.String str17 = doubleMetaphoneResult16.getAlternate();
        doubleMetaphoneResult16.appendPrimary("ARKPXKMNSK");
        doubleMetaphoneResult16.append('\000', '\000');
        doubleMetaphoneResult16.appendPrimary('r');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("\000aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A" + "'", str3, "A");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        doubleMetaphoneResult7.appendAlternate(" ");
        java.lang.String str22 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str23 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("ARKPKSKM", "hi!.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " RKPK " + "'", str23, " RKPK ");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary('4');
        doubleMetaphoneResult7.append("\000ARKPKSKMN", "ARKPX");
        doubleMetaphoneResult7.append('o');
        doubleMetaphoneResult7.appendPrimary('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = 100;
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("");
        encoderException15.addSuppressed((java.lang.Throwable) encoderException17);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException17);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("ARKP", (java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: H", (java.lang.Throwable) encoderException19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) encoderException22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'A');
        java.lang.String str13 = doubleMetaphone0.encode(" H#");
        char char16 = doubleMetaphone0.charAt("\000ARKPKSKMN", (int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('\000');
        doubleMetaphoneResult7.append(" Horg.apac");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult14.appendPrimary('4');
        doubleMetaphoneResult14.append('T');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("RKP", (int) 'R', 111, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.lang.String[] strArray16 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: ", 100, (int) 'a', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("R", (int) (short) 100, (int) '#', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.lang.String[] strArray19 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) 'a', 4, strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("R", (int) 'T', 0, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("H\000AARKPKSK", 32, 0, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone2 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str4 = doubleMetaphone2.doubleMetaphone("");
        doubleMetaphone2.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone2.setMaxCodeLen((int) (short) 0);
        java.lang.String str10 = doubleMetaphone2.encode("");
        doubleMetaphone2.setMaxCodeLen(0);
        int int13 = doubleMetaphone2.getMaxCodeLen();
        int int14 = doubleMetaphone2.maxCodeLen;
        boolean boolean18 = doubleMetaphone2.isDoubleMetaphoneEqual("#hi!ARKPXK", "ARKPKSKMNSKTKNKTRKSPKSN", true);
        java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) "#hi!ARKPXK");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str22 = doubleMetaphone20.doubleMetaphone("");
        doubleMetaphone20.setMaxCodeLen((int) (byte) 10);
        int int25 = doubleMetaphone20.getMaxCodeLen();
        char char28 = doubleMetaphone20.charAt("", (int) (byte) -1);
        boolean boolean32 = doubleMetaphone20.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str34 = doubleMetaphone20.encode("A");
        java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) str34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "RKPK" + "'", obj19, "RKPK");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "A" + "'", str34, "A");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "A" + "'", obj35, "A");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        char char4 = doubleMetaphone0.charAt("ARKPXKMNSK", (int) (byte) 0);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache", false);
        java.lang.String str11 = doubleMetaphone0.encode(" H# ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'A' + "'", char4 == 'A');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult9.append("H");
        java.lang.String str12 = doubleMetaphoneResult9.getAlternate();
        doubleMetaphoneResult9.appendPrimary("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("ARKP");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKP" + "'", str11, "ARKP");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 65;
        char char6 = doubleMetaphone0.charAt("AR", 111);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("hi!.", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str7 = doubleMetaphone5.doubleMetaphone("");
        doubleMetaphone5.setMaxCodeLen((int) (byte) 10);
        int int10 = doubleMetaphone5.getMaxCodeLen();
        int int11 = doubleMetaphone5.getMaxCodeLen();
        doubleMetaphone5.maxCodeLen = (short) 10;
        int int14 = doubleMetaphone5.getMaxCodeLen();
        char char17 = doubleMetaphone5.charAt(" org.apach", (int) '\000');
        java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) " org.apach");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + ' ' + "'", char17 == ' ');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "ARKP" + "'", obj18, "ARKP");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate('r');
        doubleMetaphoneResult7.append('T');
        boolean boolean21 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 'A';
        doubleMetaphone0.maxCodeLen = 32;
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate("ARKPKSKMNSKTKNKTRKSPKSN");
        doubleMetaphoneResult7.appendAlternate("ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN");
        java.lang.String str27 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000aa" + "'", str27, "\000aa");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        char char11 = doubleMetaphone0.charAt("a ", (int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        char char11 = doubleMetaphone0.charAt("", 0);
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary('E');
        doubleMetaphoneResult7.appendAlternate('r');
        boolean boolean26 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        int int12 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSK" + "'", str11, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        doubleMetaphoneResult7.appendAlternate(" ");
        doubleMetaphoneResult7.appendPrimary(" Ha#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.append("");
        java.lang.String str16 = doubleMetaphoneResult7.getPrimary();
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("hi!.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult13.append('\000', 'A');
        doubleMetaphoneResult13.append(' ', 'a');
        doubleMetaphoneResult13.appendAlternate("\000");
        doubleMetaphoneResult13.append('.', 'A');
        java.lang.String str25 = doubleMetaphoneResult13.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000 ." + "'", str25, "\000 .");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult17.appendAlternate("");
        doubleMetaphoneResult17.append("#hi!ARKPXK", "HRKP");
        doubleMetaphoneResult17.append('4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("HRKPK", true);
        char char24 = doubleMetaphone0.charAt("ahi!H", 111);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RKPK" + "'", str21, "RKPK");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        char char6 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) '#');
        int int7 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'e' + "'", char6 == 'e');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        doubleMetaphoneResult7.appendAlternate(" ");
        java.lang.String str22 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("ARKPKSKMNSKTKNKTRKSPKSN", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        java.lang.String str7 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) '.');
        doubleMetaphoneResult11.append(" H");
        doubleMetaphoneResult11.appendPrimary(" HHAa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('a', ' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str19 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str20 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str21 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(" Ha#", "org.apache.commons.codec.EncoderException:  ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " org.apach" + "'", str19, " org.apach");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " org.apach" + "'", str20, " org.apach");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " org.apach" + "'", str21, " org.apach");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        java.lang.String str18 = doubleMetaphone0.encode(" HHA");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult9.append("", "#org.apach");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str16 = doubleMetaphone14.doubleMetaphone("");
        doubleMetaphone14.setMaxCodeLen((int) (byte) 10);
        int int19 = doubleMetaphone14.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone14.new DoubleMetaphoneResult(10);
        boolean boolean22 = doubleMetaphoneResult21.isComplete();
        doubleMetaphoneResult21.appendPrimary(' ');
        doubleMetaphoneResult21.appendPrimary("H");
        doubleMetaphoneResult21.append('a', ' ');
        java.lang.String str30 = doubleMetaphoneResult21.getAlternate();
        java.lang.String str31 = doubleMetaphoneResult21.getPrimary();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str13, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " " + "'", str30, " ");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " Ha" + "'", str31, " Ha");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        doubleMetaphone0.setMaxCodeLen((int) 'o');
        char char15 = doubleMetaphone0.charAt("ARKP", (int) (short) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'R' + "'", char15 == 'R');
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str15 = doubleMetaphone13.encode("hi!");
        char char18 = doubleMetaphone13.charAt("", 100);
        java.lang.String str20 = doubleMetaphone13.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int21 = doubleMetaphone13.getMaxCodeLen();
        doubleMetaphone13.maxCodeLen = '\000';
        int int24 = doubleMetaphone13.maxCodeLen;
        int int25 = doubleMetaphone13.maxCodeLen;
        char char28 = doubleMetaphone13.charAt("", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone13.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str32 = doubleMetaphone13.doubleMetaphone("org.apache.commons.codec.EncoderException: H");
        java.lang.Object obj33 = doubleMetaphone0.encode((java.lang.Object) str32);
        char char36 = doubleMetaphone0.charAt("ARKPKSKM", (int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\000' + "'", char36 == '\000');
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        java.lang.String str16 = doubleMetaphone0.encode("  #");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("A", true);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone(" H#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('a', ' ');
        doubleMetaphoneResult7.appendPrimary(" org.apach");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append(' ');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(" H#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getAlternate();
        doubleMetaphoneResult6.append(" H#");
        doubleMetaphoneResult6.append(" a", "");
        doubleMetaphoneResult6.appendAlternate(" Ha#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        char char8 = doubleMetaphone0.charAt(" H\000", (-1));
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone9.doubleMetaphone("");
        doubleMetaphone9.setMaxCodeLen((int) (byte) 10);
        int int14 = doubleMetaphone9.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone9.new DoubleMetaphoneResult(10);
        boolean boolean17 = doubleMetaphoneResult16.isComplete();
        doubleMetaphoneResult16.appendPrimary(' ');
        doubleMetaphoneResult16.appendPrimary("H");
        doubleMetaphoneResult16.append("", "");
        doubleMetaphoneResult16.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult16.appendPrimary('a');
        doubleMetaphoneResult16.appendAlternate('A');
        java.lang.String str31 = doubleMetaphoneResult16.getAlternate();
        doubleMetaphoneResult16.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult16.appendAlternate(" org.apach");
        doubleMetaphoneResult16.append('r');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache" + "'", str31, "org.apache");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("ARKP");
        char char9 = doubleMetaphone0.charAt(" ", (int) '#');
        doubleMetaphone0.maxCodeLen = 10;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str6 = doubleMetaphone0.encode(" ");
        java.lang.String str8 = doubleMetaphone0.encode("ARKPKKMNSK");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKP" + "'", str8, "ARKP");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("ARKP", (int) (byte) -1);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str16 = doubleMetaphone0.encode("\000org.apach");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPX" + "'", str12, "ARKPX");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKPK" + "'", str16, "ARKPK");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.append('.', 'H');
        doubleMetaphoneResult7.append("H", "");
        doubleMetaphoneResult7.appendPrimary(" Horg.apac");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "#org.apach", false);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPX", "org.apache.commons.codec.EncoderException:  ");
        char char16 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (short) -1);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("#H", "AR");
        java.lang.String str21 = doubleMetaphone0.encode("A");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.appendPrimary(" HHAa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        java.lang.String str10 = doubleMetaphone0.encode("");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKS", " Horg.apac", false);
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = doubleMetaphone0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary('4');
        doubleMetaphoneResult7.appendPrimary('o');
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        char char11 = doubleMetaphone0.charAt("", (int) 'o');
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!org.apa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone11.new DoubleMetaphoneResult(10);
        boolean boolean19 = doubleMetaphoneResult18.isComplete();
        doubleMetaphoneResult18.append("");
        doubleMetaphoneResult18.append('a', '#');
        doubleMetaphoneResult18.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult18.appendAlternate("");
        doubleMetaphoneResult18.appendPrimary("a");
        java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) "a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'r');
        java.lang.String str36 = doubleMetaphone0.doubleMetaphone("\000", true);
        boolean boolean40 = doubleMetaphone0.isDoubleMetaphoneEqual("  #", "ARKPX", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult42 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        java.lang.String str43 = doubleMetaphoneResult42.getAlternate();
        doubleMetaphoneResult42.appendPrimary("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendPrimary("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "hi!");
        doubleMetaphoneResult7.appendAlternate("org.apache");
        java.lang.String str20 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aorg.apach" + "'", str20, "aorg.apach");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        char char11 = doubleMetaphone0.charAt("", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        char char16 = doubleMetaphone0.charAt("A", (int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:   #\000", "HARKP");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str15 = doubleMetaphone0.encode(" ");
        java.lang.Class<?> wildcardClass16 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("HRKPK", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str13, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        doubleMetaphone0.maxCodeLen = 4;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = doubleMetaphone0.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('a', ' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException", " H#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " Ha" + "'", str17, " Ha");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        int int12 = doubleMetaphone0.maxCodeLen;
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "Aa", true);
        java.lang.String str18 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        doubleMetaphone0.maxCodeLen = 'A';
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000aa", true);
        java.lang.String str18 = doubleMetaphone0.encode("ARKPKS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("A");
        doubleMetaphoneResult7.appendAlternate("ARKPKSKMNS");
        boolean boolean21 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary('.');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj7 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "H" + "'", obj7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPXKMNSK" + "'", str9, "ARKPXKMNSK");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("ARKPKSKMNS", "H");
        doubleMetaphoneResult7.append("H", "org.apache");
        doubleMetaphoneResult7.append('\000', 'a');
        boolean boolean22 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("H");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException:  ", (int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("ARKPXKMNSKTKNKTRKSPXN", "org.apache.commons.codec.EncoderException: H");
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('\000', 'H');
        java.lang.String str20 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append(" H\000");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKPXKMNSK" + "'", str20, "ARKPXKMNSK");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        doubleMetaphoneResult7.appendPrimary('a');
        boolean boolean22 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("RKPKSK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H", true);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("  #", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 111;
        doubleMetaphone0.maxCodeLen = 'A';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt(" ", (int) 'a');
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.String[] strArray16 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) 'a', 4, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!.", (int) 'A', 1, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("ARKPKMNSK", "\000");
        doubleMetaphoneResult7.appendPrimary('e');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " H" + "'", str14, " H");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "org.apache", false);
        java.lang.String str7 = doubleMetaphone0.encode("a");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("\000");
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.append("ARKPKKMNSK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.encode("");
        java.lang.String str12 = doubleMetaphone0.encode("org.apache");
        doubleMetaphone0.maxCodeLen = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        char char14 = doubleMetaphone0.charAt(" H\000", (int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode(" a");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendPrimary('\000');
        doubleMetaphoneResult7.appendPrimary(" HHAa\000");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        doubleMetaphone0.maxCodeLen = 'E';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('\000');
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary("");
        java.lang.String str18 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000" + "'", str15, "\000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000" + "'", str18, "\000");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult13.append('\000', 'A');
        doubleMetaphoneResult13.append(' ', 'a');
        doubleMetaphoneResult13.appendAlternate("\000");
        doubleMetaphoneResult13.append('.', 'A');
        boolean boolean25 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.appendPrimary("\000AARKPKSKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str11 = doubleMetaphoneResult10.getAlternate();
        java.lang.Class<?> wildcardClass12 = doubleMetaphoneResult10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult13.appendPrimary('A');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSN");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'T');
        int int19 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSK" + "'", str11, "ARKPXKMNSK");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", " HHA ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen((int) 'A');
        doubleMetaphone0.setMaxCodeLen(65);
        char char13 = doubleMetaphone0.charAt("o", (int) 'o');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.String str11 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        doubleMetaphoneResult13.append('o');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("ARKP", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.getMaxCodeLen();
        int int17 = doubleMetaphone11.getMaxCodeLen();
        int int18 = doubleMetaphone11.getMaxCodeLen();
        char char21 = doubleMetaphone11.charAt("ARKP", (int) (byte) -1);
        java.lang.String str23 = doubleMetaphone11.doubleMetaphone("org.apache");
        java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) str23);
        char char27 = doubleMetaphone0.charAt("HRKP", (int) (byte) 0);
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "ARKPKSKMNSKTKNKTRKSPKSN", false);
        java.lang.String str33 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'A' + "'", char8 == 'A');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ARKPX" + "'", str23, "ARKPX");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "ARKPKS" + "'", obj24, "ARKPKS");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + 'H' + "'", char27 == 'H');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ARKPXKMNSK" + "'", str33, "ARKPXKMNSK");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a');
        doubleMetaphoneResult7.appendPrimary(" HHAa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        char char11 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 0);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("ARKPKS", false);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!");
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual(" Horg.apac", "Aar");
        java.lang.Class<?> wildcardClass21 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "ARKP" + "'", obj17, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphoneResult13.append('\000');
        doubleMetaphoneResult13.append('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.append("hi!", " ");
        doubleMetaphoneResult7.append("hi!");
        doubleMetaphoneResult7.append("ahi!H");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str12 = doubleMetaphone0.encode("a");
        java.lang.String str14 = doubleMetaphone0.encode("a");
        int int15 = doubleMetaphone0.maxCodeLen;
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("  ", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str14 = doubleMetaphoneResult13.getAlternate();
        java.lang.String str15 = doubleMetaphoneResult13.getAlternate();
        doubleMetaphoneResult13.appendPrimary('.');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.lang.String[] strArray25 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: a", (int) 'o', (int) 'A', strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("RKPK", (int) (byte) 100, (int) 'r', strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'o', (int) (short) 10, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (byte) 10, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: a ", (int) (byte) 10, (int) (short) 1, strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult8.append("org.apache.commons.codec.EncoderException: H");
        java.lang.String str11 = doubleMetaphoneResult8.getAlternate();
        boolean boolean12 = doubleMetaphoneResult8.isComplete();
        java.lang.String str13 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.codec.EncoderException: H" + "'", str11, "org.apache.commons.codec.EncoderException: H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.codec.EncoderException: H" + "'", str13, "org.apache.commons.codec.EncoderException: H");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'A');
        java.lang.String str13 = doubleMetaphone0.encode(" H#");
        java.lang.String str15 = doubleMetaphone0.encode("org.apache");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual(" HHAa", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ARKPX" + "'", str15, "ARKPX");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        doubleMetaphone0.setMaxCodeLen(35);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNSK" + "'", str9, "ARKPKSKMNSK");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual(" H#", "", true);
        doubleMetaphone0.maxCodeLen = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append(' ', 'a');
        doubleMetaphoneResult7.appendPrimary('#');
        java.lang.String str16 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary('\000');
        java.lang.String str19 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str20 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "  #" + "'", str16, "  #");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "  #\000" + "'", str19, "  #\000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "  #\000" + "'", str20, "  #\000");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str15 = doubleMetaphone0.encode("");
        java.lang.String str17 = doubleMetaphone0.encode("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult13.appendAlternate("ARKPKSKMNS");
        boolean boolean16 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.appendAlternate("ARKPARKPK");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult17.appendAlternate("");
        doubleMetaphoneResult17.appendAlternate("ARKPXKMNSKTKNKTRKSPXN");
        doubleMetaphoneResult17.appendAlternate("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append(" ", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = doubleMetaphoneResult12.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone(" Horg.apac", true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HRKPK" + "'", str18, "HRKPK");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual(" H#", "", true);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone11.new DoubleMetaphoneResult(10);
        boolean boolean19 = doubleMetaphoneResult18.isComplete();
        doubleMetaphoneResult18.append("");
        doubleMetaphoneResult18.append('a', '#');
        doubleMetaphoneResult18.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult18.appendAlternate("");
        doubleMetaphoneResult18.appendPrimary("a");
        java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) "a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'r');
        java.lang.String str36 = doubleMetaphone0.doubleMetaphone("\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult38 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        java.lang.String str40 = doubleMetaphone0.doubleMetaphone("A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) '.');
        doubleMetaphoneResult11.appendPrimary('a');
        doubleMetaphoneResult11.append("ARKPKSKMNSK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.append("ARKPXKMNSK");
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('R');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.encode("ARKPKSKMNS");
        doubleMetaphone0.maxCodeLen = 'o';
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual(" HHA ", " H# ", true);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray21 = encoderException20.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException20);
        java.lang.Throwable[] throwableArray24 = encoderException20.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("ARKPXKMNSK", (java.lang.Throwable) encoderException20);
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray29 = encoderException28.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException("A", (java.lang.Throwable) encoderException28);
        encoderException20.addSuppressed((java.lang.Throwable) encoderException30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = doubleMetaphone0.encode((java.lang.Object) encoderException30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult10.append(' ', '4');
        doubleMetaphoneResult10.append("ARKPKSKMNS");
        java.lang.String str16 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.appendPrimary('r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ARKP");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'R');
        doubleMetaphone0.maxCodeLen = 'o';
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSK" + "'", str13, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 111 + "'", int18 == 111);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary('4');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary("#org.apach");
        doubleMetaphoneResult7.appendPrimary(" ");
        doubleMetaphoneResult7.appendPrimary(" H\000");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H", false);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str11 = doubleMetaphone0.encode("\000ARKPKSKMN");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str8, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPKSKMN" + "'", str11, "ARKPKSKMN");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone4 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str6 = doubleMetaphone4.doubleMetaphone("");
        doubleMetaphone4.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone4.setMaxCodeLen((int) (short) 0);
        java.lang.String str12 = doubleMetaphone4.encode("");
        doubleMetaphone4.setMaxCodeLen(0);
        java.lang.String str16 = doubleMetaphone4.encode("a");
        java.lang.String str18 = doubleMetaphone4.encode("a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str9 = doubleMetaphone7.doubleMetaphone("");
        doubleMetaphone7.setMaxCodeLen((int) (byte) 10);
        int int12 = doubleMetaphone7.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone7.new DoubleMetaphoneResult(10);
        boolean boolean15 = doubleMetaphoneResult14.isComplete();
        boolean boolean16 = doubleMetaphoneResult14.isComplete();
        doubleMetaphoneResult14.appendAlternate("");
        java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) "");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ARKP", "ARKPKS", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("a");
        int int4 = doubleMetaphone0.maxCodeLen;
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.Class<?> wildcardClass8 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A" + "'", str3, "A");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        java.lang.String str8 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        char char11 = doubleMetaphone0.charAt("ARKPKSKM", (int) 'r');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str14 = doubleMetaphoneResult13.getAlternate();
        java.lang.String str15 = doubleMetaphoneResult13.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKP" + "'", str8, "ARKP");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary("a");
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        char char8 = doubleMetaphone0.charAt("", (int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(35);
        java.lang.String str12 = doubleMetaphone0.encode("#hi!ARKPXK");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RKPKSK" + "'", str12, "RKPKSK");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.lang.String[] strArray11 = new java.lang.String[] { "org.apache", "RKPK" };
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: H", (int) (short) 10, (int) (short) 0, strArray11);
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) (byte) 100, (int) 'H', strArray11);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("R", (int) 'R', 4, strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str25 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " Horg.apac" + "'", str25, " Horg.apac");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.lang.String[] strArray11 = new java.lang.String[] { "org.apache", "RKPK" };
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: H", (int) (short) 10, (int) (short) 0, strArray11);
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) (byte) 100, (int) 'H', strArray11);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!org.apa", 32, 10, strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int9 = doubleMetaphone0.maxCodeLen;
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "HARKP", true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.appendAlternate("hi!");
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('e', 'a');
        doubleMetaphoneResult7.appendPrimary('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary("a");
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("ARKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "#org.apach", false);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKP", "HAorg.apac");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary('E');
        doubleMetaphoneResult7.appendAlternate('r');
        doubleMetaphoneResult7.append("\000ARKPKSKMN", " org.apach");
        java.lang.Class<?> wildcardClass29 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str15 = doubleMetaphone0.encode(" ");
        int int16 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 1;
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("  ", true);
        int int26 = doubleMetaphone0.maxCodeLen;
        java.lang.String str28 = doubleMetaphone0.encode(" HHAa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.appendAlternate('A');
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('\000');
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("ARKPARKPK", "ARKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000" + "'", str15, "\000");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.append("hi!", " ");
        doubleMetaphoneResult7.append('H');
        java.lang.String str19 = doubleMetaphoneResult7.getPrimary();
        boolean boolean20 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ahi!H" + "'", str19, "ahi!H");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "ARKPXKMNSKTKNKTRKSPXN", false);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        java.lang.String str18 = doubleMetaphoneResult7.getPrimary();
        java.lang.Class<?> wildcardClass19 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " Horg.apac" + "'", str18, " Horg.apac");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ARKP");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'R');
        doubleMetaphoneResult15.append('o');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSK" + "'", str13, "ARKPXKMNSK");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("");
        boolean boolean13 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.lang.String[] strArray13 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) 'A', 4, strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) 'e', (int) (short) 100, strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        char char13 = doubleMetaphone0.charAt("#org.apach", (int) (short) -1);
        doubleMetaphone0.maxCodeLen = 'e';
        char char18 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: A", 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'r' + "'", char18 == 'r');
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        char char11 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 0);
        java.lang.String str13 = doubleMetaphone0.encode(" H");
        doubleMetaphone0.maxCodeLen = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: ARKPX");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str18 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str21 = doubleMetaphone19.doubleMetaphone("");
        doubleMetaphone19.setMaxCodeLen((int) (byte) 10);
        int int24 = doubleMetaphone19.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone19.new DoubleMetaphoneResult(10);
        boolean boolean27 = doubleMetaphoneResult26.isComplete();
        java.lang.String str28 = doubleMetaphoneResult26.getPrimary();
        doubleMetaphoneResult26.appendAlternate("ARKPXKMNSK");
        java.lang.String str31 = doubleMetaphoneResult26.getAlternate();
        doubleMetaphoneResult26.appendPrimary('\000');
        boolean boolean34 = doubleMetaphoneResult26.isComplete();
        java.lang.String str35 = doubleMetaphoneResult26.getAlternate();
        doubleMetaphoneResult26.appendAlternate(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKPKSKMNS" + "'", str18, "ARKPKSKMNS");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ARKPXKMNSK" + "'", str31, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ARKPXKMNSK" + "'", str35, "ARKPXKMNSK");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        int int10 = doubleMetaphone0.maxCodeLen;
        int int11 = doubleMetaphone0.maxCodeLen;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("aorg.apach", "org.apache.commons.codec.EncoderException: ARKPX", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        char char15 = doubleMetaphone0.charAt("", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "HRKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char14 = doubleMetaphone0.charAt("org.apache", (-1));
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'A');
        doubleMetaphoneResult21.append('.', '.');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str19, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        char char13 = doubleMetaphone0.charAt("#org.apach", (int) (short) -1);
        doubleMetaphone0.maxCodeLen = 'e';
        java.lang.String str17 = doubleMetaphone0.encode(" Horg.apac");
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("");
        encoderException20.addSuppressed((java.lang.Throwable) encoderException22);
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException22);
        java.lang.Throwable[] throwableArray25 = encoderException22.getSuppressed();
        java.lang.Class<?> wildcardClass26 = throwableArray25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) throwableArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HRKPK" + "'", str17, "HRKPK");
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "#org.apach", false);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPX", "org.apache.commons.codec.EncoderException:  ");
        doubleMetaphone0.maxCodeLen = (byte) 1;
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str15 = doubleMetaphone0.encode(" HHA");
        java.lang.String str17 = doubleMetaphone0.encode("  ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!org.apa", "  ", false);
        java.lang.String str17 = doubleMetaphone0.encode(" H# ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "hi!");
        doubleMetaphoneResult7.appendAlternate("org.apache");
        boolean boolean20 = doubleMetaphoneResult7.isComplete();
        java.lang.String str21 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#hi!org.ap" + "'", str21, "#hi!org.ap");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("", 1);
        int int13 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str16 = doubleMetaphone14.encode("hi!");
        char char19 = doubleMetaphone14.charAt("", 100);
        doubleMetaphone14.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.appendPrimary('#');
        boolean boolean20 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('#');
        java.lang.Class<?> wildcardClass23 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str6 = doubleMetaphone0.encode(" ");
        doubleMetaphone0.setMaxCodeLen(100);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", " Ha", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append('4', 'H');
        doubleMetaphoneResult7.appendPrimary('#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str7 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = doubleMetaphone8.maxCodeLen;
        java.lang.String str11 = doubleMetaphone8.encode("");
        doubleMetaphone8.maxCodeLen = (byte) 0;
        java.lang.String str16 = doubleMetaphone8.doubleMetaphone("H", false);
        java.lang.String str18 = doubleMetaphone8.doubleMetaphone("ARKPXKMNSK");
        int int19 = doubleMetaphone8.getMaxCodeLen();
        char char22 = doubleMetaphone8.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 1);
        boolean boolean25 = doubleMetaphone8.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: a", "AR");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'r' + "'", char22 == 'r');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPKSKM");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("RKPK");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aa", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RKPK" + "'", str12, "RKPK");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 'R';
        java.lang.String str18 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ARKP");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKP" + "'", str18, "ARKPXKMNSKTKNKTRKSPXNRKP");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = 100;
        java.lang.Class<?> wildcardClass10 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        doubleMetaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000org.apach", "A");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

