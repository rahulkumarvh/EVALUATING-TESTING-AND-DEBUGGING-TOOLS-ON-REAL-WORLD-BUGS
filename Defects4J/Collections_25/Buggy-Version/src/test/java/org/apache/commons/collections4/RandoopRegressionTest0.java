package org.apache.commons.collections4.keyvalue;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey4.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.Class<?> wildcardClass6 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = charSequenceMultiKey4.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.Class<?> wildcardClass7 = charSequenceMultiKey6.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        int int6 = charSequenceMultiKey4.size();
        java.lang.Class<?> wildcardClass7 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        int int6 = charSequenceMultiKey4.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = charSequenceMultiKey4.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence3 = charSequenceMultiKey1.getKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey4.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = charSequenceMultiKey4.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        int int3 = charSequenceMultiKey2.size();
        int int4 = charSequenceMultiKey2.size();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = charSequenceMultiKey4.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.CharSequence[] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence2, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray7 = null; // flaky: charSequenceMultiKey6.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) false, (java.io.Serializable) (byte) 10, (java.io.Serializable) charSequenceArray7);
        java.lang.Class<?> wildcardClass10 = null; // flaky: charSequenceArray7.getClass();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray7);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.Object obj7 = charSequenceMultiKey6.readResolve();
        java.lang.String str8 = charSequenceMultiKey6.toString();
        java.lang.String str9 = charSequenceMultiKey6.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str8, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str9, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        boolean boolean8 = charSequenceMultiKey6.equals((java.lang.Object) '4');
        java.lang.CharSequence charSequence9 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence9, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str14 = charSequenceMultiKey13.toString();
        java.lang.String str15 = charSequenceMultiKey13.toString();
        boolean boolean16 = charSequenceMultiKey6.equals((java.lang.Object) charSequenceMultiKey13);
        int int17 = charSequenceMultiKey13.size();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str15, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey4.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = charSequenceMultiKey4.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray9, charSequenceArray12, charSequenceArray13, charSequenceArray19);
        java.lang.Class<?> wildcardClass23 = charSequenceArray19.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.Class<?> wildcardClass4 = strComparableMultiKey3.getClass();
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray17, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray17, true);
        java.lang.CharSequence[] charSequenceArray22 = charSequenceMultiKey21.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray24 = new org.apache.commons.collections4.keyvalue.MultiKey[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray25 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray24;
        charSequenceMultiKeyArray25[0] = charSequenceMultiKey6;
        charSequenceMultiKeyArray25[1] = charSequenceMultiKey9;
        charSequenceMultiKeyArray25[2] = charSequenceMultiKey12;
        charSequenceMultiKeyArray25[3] = charSequenceMultiKey21;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey35 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray25, false);
        java.lang.Class<?> wildcardClass36 = charSequenceMultiKeyMultiKey35.getClass();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey37 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass4, (java.lang.reflect.Type) wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(multiKeyArray24);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray25);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.String str7 = null; // flaky: charSequenceMultiKey6.toString();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str7, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence3, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray8 = null; // flaky: charSequenceMultiKey7.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray8);
        int int10 = 0; // flaky: charSequenceMultiKey9.size();
        boolean boolean11 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceMultiKey9);
        org.junit.Assert.assertNotNull(charSequenceArray0);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence2, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str7 = charSequenceMultiKey6.toString();
        int int8 = charSequenceMultiKey6.size();
        java.lang.Class<?> wildcardClass9 = charSequenceMultiKey6.getClass();
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] { (short) 0, (byte) 100, charSequenceMultiKey6 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>(serializableArray10, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str7, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(serializableArray10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey8.getKeys();
        java.lang.CharSequence charSequence11 = charSequenceMultiKey8.getKey((int) (byte) 0);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceMultiKey2.equals(obj3);
        java.lang.String str5 = charSequenceMultiKey2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey2.getKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", str5, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        int int6 = charSequenceMultiKey5.size();
        java.lang.String str7 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]" + "'", str7, "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray9, charSequenceArray12, charSequenceArray13, charSequenceArray19);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.Object obj3 = charSequenceMultiKey2.readResolve();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[null, MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[null, MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[null, MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str12 = charSequenceMultiKey11.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str12, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey(4);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", charSequence7, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        int int4 = charSequenceMultiKey3.size();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.String str8 = null; // flaky: charSequenceMultiKey6.toString();
        java.lang.String str9 = null; // flaky: charSequenceMultiKey6.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence11 = null; // flaky: charSequenceMultiKey6.getKey((int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.Class<?> wildcardClass7 = null; // flaky: charSequenceArray6.getClass();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Object obj2 = charSequenceMultiKey1.readResolve();
        java.lang.Object obj3 = charSequenceMultiKey1.readResolve();
        java.lang.String str4 = charSequenceMultiKey1.toString();
        java.lang.Class<?> wildcardClass5 = charSequenceMultiKey1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "MultiKey[]");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        int int5 = charSequenceMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        java.lang.String str21 = charSequenceMultiKey20.toString();
        boolean boolean22 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence24 = charSequenceMultiKey20.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiKey[]" + "'", str21, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.String str7 = charSequenceMultiKey5.toString();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]" + "'", str7, "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", charSequence2);
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        java.lang.String str5 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]" + "'", str5, "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        int int5 = charSequenceMultiKey2.size();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray3 = null; // flaky: charSequenceMultiKey2.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.String str18 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str18, "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceMultiKey2.equals(obj3);
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey2.getKeys();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.String str10 = charSequenceMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str10, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        java.lang.Object obj5 = charSequenceMultiKey2.readResolve();
        java.lang.Class<?> wildcardClass6 = charSequenceMultiKey2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str3, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str4, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.String str4 = charSequenceMultiKey3.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence6 = charSequenceMultiKey3.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" + "'", str4, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (byte) 1);
        int int5 = charSequenceMultiKey2.size();
        org.junit.Assert.assertEquals("'" + charSequence4 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", charSequence4, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.Class<?> wildcardClass7 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Comparable<java.lang.String>[] strComparableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>(strComparableArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        int int8 = charSequenceMultiKey6.size();
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey6.getKeys();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", charSequence2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.String str8 = charSequenceMultiKey7.toString();
        boolean boolean10 = charSequenceMultiKey7.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str8, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.Serializable serializable0 = null;
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray1);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray1, false);
        java.lang.CharSequence[] charSequenceArray6 = charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>(serializable0, (java.io.Serializable) charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        int int6 = charSequenceMultiKey4.size();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence9 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence9, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str14 = charSequenceMultiKey13.toString();
        java.lang.String str15 = charSequenceMultiKey13.toString();
        java.lang.Object obj16 = null;
        boolean boolean17 = charSequenceMultiKey13.equals(obj16);
        java.lang.CharSequence[] charSequenceArray18 = null; // flaky: charSequenceMultiKey13.getKeys();
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray28, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray18, charSequenceArray21, charSequenceArray22, charSequenceArray28);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey33 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22, true);
        boolean boolean34 = charSequenceMultiKey8.equals((java.lang.Object) charSequenceArray22);
        boolean boolean35 = charSequenceMultiKey5.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str15, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray0);
        org.junit.Assert.assertNotNull(typeArray0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", charSequence4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6, false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5);
        int int26 = charSequenceMultiKey25.size();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str9 = charSequenceMultiKey8.toString();
        int int10 = charSequenceMultiKey8.size();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str9, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        java.lang.String str12 = charSequenceMultiKey10.toString();
        java.lang.Object obj13 = charSequenceMultiKey10.readResolve();
        boolean boolean14 = charSequenceMultiKey5.equals(obj13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str11, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" + "'", str12, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", charSequence2);
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey3.getKeys();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", charSequence3, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        java.lang.String str21 = charSequenceMultiKey20.toString();
        boolean boolean22 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey20);
        int int23 = charSequenceMultiKey20.size();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiKey[]" + "'", str21, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        boolean boolean6 = charSequenceMultiKey2.equals((java.lang.Object) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        boolean boolean16 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceMultiKey15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence18 = charSequenceMultiKey2.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray9, charSequenceArray12, charSequenceArray13, charSequenceArray19);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray12, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "", "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.String str7 = charSequenceMultiKey6.toString();
        boolean boolean9 = charSequenceMultiKey6.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str7, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        java.lang.CharSequence charSequence9 = charSequenceMultiKey6.getKey((int) (byte) 1);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", charSequence9, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray2 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray3 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray2;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray5 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray6 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray5;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray8 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray9 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray8;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray11 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray12 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray11;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray14 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray15 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray14;
        charSequenceMultiKeyArray15[0] = multiKeyArray2;
        charSequenceMultiKeyArray15[1] = multiKeyArray5;
        charSequenceMultiKeyArray15[2] = charSequenceMultiKeyArray9;
        charSequenceMultiKeyArray15[3] = multiKeyArray11;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray15, true);
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray27 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray28 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray27;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray30 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray31 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray33 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray34 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray33;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray36 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray37 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray36;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray39 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray40 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray39;
        charSequenceMultiKeyArray40[0] = multiKeyArray27;
        charSequenceMultiKeyArray40[1] = multiKeyArray30;
        charSequenceMultiKeyArray40[2] = charSequenceMultiKeyArray34;
        charSequenceMultiKeyArray40[3] = multiKeyArray36;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray40, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]> charSequenceMultiKeyArrayMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]>(charSequenceMultiKeyArray0, charSequenceMultiKeyArray15, charSequenceMultiKeyArray40);
        org.junit.Assert.assertNotNull(multiKeyArray2);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray3);
        org.junit.Assert.assertNotNull(multiKeyArray5);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray6);
        org.junit.Assert.assertNotNull(multiKeyArray8);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray9);
        org.junit.Assert.assertNotNull(multiKeyArray11);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray12);
        org.junit.Assert.assertNotNull(multiKeyArray14);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray15);
        org.junit.Assert.assertNotNull(multiKeyArray27);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray28);
        org.junit.Assert.assertNotNull(multiKeyArray30);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray31);
        org.junit.Assert.assertNotNull(multiKeyArray33);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray34);
        org.junit.Assert.assertNotNull(multiKeyArray36);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray37);
        org.junit.Assert.assertNotNull(multiKeyArray39);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray40);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray0);
        java.lang.Class<?> wildcardClass2 = charSequenceArrayMultiKey1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", charSequence3, (java.lang.CharSequence) "MultiKey[]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        boolean boolean10 = charSequenceMultiKey5.equals((java.lang.Object) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray11 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.Object obj10 = null;
        boolean boolean11 = charSequenceMultiKey9.equals(obj10);
        java.lang.String str12 = charSequenceMultiKey9.toString();
        java.lang.String str13 = charSequenceMultiKey9.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str12, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str13, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.Object obj9 = charSequenceMultiKey4.readResolve();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray10);
        java.lang.Object obj12 = charSequenceMultiKey11.readResolve();
        java.lang.Object obj13 = charSequenceMultiKey11.readResolve();
        java.lang.String str14 = charSequenceMultiKey11.toString();
        boolean boolean15 = charSequenceMultiKey4.equals((java.lang.Object) str14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "MultiKey[]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[]" + "'", str14, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String[] strArray3 = new java.lang.String[] { "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>(strArray3, true);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        java.lang.Class<?> wildcardClass15 = charSequenceMultiKey14.getClass();
        boolean boolean16 = charSequenceMultiKey2.equals((java.lang.Object) wildcardClass15);
        java.lang.String str17 = charSequenceMultiKey2.toString();
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]" + "'", str17, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", charSequence1, (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey(1);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.Comparable<java.lang.String>) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.Comparable<java.lang.String>) "MultiKey[]", (java.lang.Comparable<java.lang.String>) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.String str8 = null; // flaky: charSequenceMultiKey6.toString();
        int int9 = 0; // flaky: charSequenceMultiKey6.size();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[]> annotatedElementArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.AnnotatedElement[]>(annotatedElementArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.Object obj13 = charSequenceMultiKey12.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[]");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        boolean boolean12 = charSequenceMultiKey5.equals((java.lang.Object) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        boolean boolean5 = charSequenceMultiKey3.equals((java.lang.Object) (short) 1);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray10, false);
        boolean boolean13 = charSequenceMultiKey3.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence6, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str11 = charSequenceMultiKey10.toString();
        int int12 = charSequenceMultiKey10.size();
        java.lang.Class<?> wildcardClass13 = charSequenceMultiKey10.getClass();
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] { wildcardClass13 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type> typeMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type>(typeArray14, true);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) true);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey19 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray18);
        java.lang.String str21 = charSequenceMultiKey20.toString();
        boolean boolean22 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey20);
        java.lang.CharSequence[] charSequenceArray23 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "MultiKey[]" + "'", str21, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray23);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.Class<?> wildcardClass3 = charSequenceMultiKey2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        java.lang.Class<?> wildcardClass4 = charSequenceArray0.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", charSequence4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
        int int8 = 0; // flaky: charSequenceMultiKey7.size();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str9 = charSequenceMultiKey8.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence11 = charSequenceMultiKey8.getKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str9, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", charSequence4);
        java.lang.Class<?> wildcardClass6 = charSequenceMultiKey5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey30 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray39);
        java.lang.String[] strArray46 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey47 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray29, strArray33, strArray39, strArray46);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray29);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray54);
        java.lang.String[] strArray58 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey65 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray64);
        java.lang.String[] strArray71 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey72 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray54, strArray58, strArray64, strArray71);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey73 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray29, strArray54);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray71);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = charSequenceMultiKey4.readResolve();
        int int8 = charSequenceMultiKey4.size();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]" + "'", str5, "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence charSequence7 = charSequenceMultiKey5.getKey((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = charSequenceMultiKey5.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", charSequence7, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray4 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray5 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray4;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray7 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray8 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray7;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray10 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray11 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray13 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray14 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray13;
        charSequenceMultiKeyArray14[0] = multiKeyArray1;
        charSequenceMultiKeyArray14[1] = charSequenceMultiKeyArray5;
        charSequenceMultiKeyArray14[2] = multiKeyArray7;
        charSequenceMultiKeyArray14[3] = multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]> serializableArrayMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]>((java.io.Serializable[][]) charSequenceMultiKeyArray14);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray2);
        org.junit.Assert.assertNotNull(multiKeyArray4);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray5);
        org.junit.Assert.assertNotNull(multiKeyArray7);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray8);
        org.junit.Assert.assertNotNull(multiKeyArray10);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray11);
        org.junit.Assert.assertNotNull(multiKeyArray13);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray14);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence3, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str8 = charSequenceMultiKey7.toString();
        java.lang.String str9 = charSequenceMultiKey7.toString();
        java.lang.Object obj10 = null;
        boolean boolean11 = charSequenceMultiKey7.equals(obj10);
        java.lang.CharSequence[] charSequenceArray12 = null; // flaky: charSequenceMultiKey7.getKeys();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey17 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray12, charSequenceArray15, charSequenceArray16, charSequenceArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray16, true);
        boolean boolean28 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceArray16);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj6 = charSequenceMultiKey5.readResolve();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray5, strArray9, strArray15, strArray22);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5);
        java.lang.String str26 = charSequenceMultiKey25.toString();
        java.lang.String str27 = charSequenceMultiKey25.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]" + "'", str26, "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]" + "'", str27, "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj6 = charSequenceMultiKey5.readResolve();
        java.lang.CharSequence[] charSequenceArray7 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.Class<?> wildcardClass4 = charSequenceMultiKey3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.CharSequence[] charSequenceArray4 = null; // flaky: charSequenceMultiKey3.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.String str7 = charSequenceMultiKey6.toString();
        java.lang.Class<?> wildcardClass8 = charSequenceMultiKey6.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str7, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        java.lang.Class<?> wildcardClass8 = charSequenceMultiKey7.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str9 = charSequenceMultiKey8.toString();
        java.lang.Object obj10 = charSequenceMultiKey8.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str9, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", charSequence3, (java.lang.CharSequence) "MultiKey[]");
        int int6 = charSequenceMultiKey5.size();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , null, MultiKey[]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , null, MultiKey[]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[hi!, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , null, MultiKey[]]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray4 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray5 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray4;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray7 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray8 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray7;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray10 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray11 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray13 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray14 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray13;
        charSequenceMultiKeyArray14[0] = multiKeyArray1;
        charSequenceMultiKeyArray14[1] = multiKeyArray4;
        charSequenceMultiKeyArray14[2] = charSequenceMultiKeyArray8;
        charSequenceMultiKeyArray14[3] = multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey25 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray2);
        org.junit.Assert.assertNotNull(multiKeyArray4);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray5);
        org.junit.Assert.assertNotNull(multiKeyArray7);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray8);
        org.junit.Assert.assertNotNull(multiKeyArray10);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray11);
        org.junit.Assert.assertNotNull(multiKeyArray13);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray4 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray5 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray4;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray7 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray8 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray7;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray10 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray11 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray13 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray14 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray13;
        charSequenceMultiKeyArray14[0] = multiKeyArray1;
        charSequenceMultiKeyArray14[1] = multiKeyArray4;
        charSequenceMultiKeyArray14[2] = charSequenceMultiKeyArray8;
        charSequenceMultiKeyArray14[3] = multiKeyArray10;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14, true);
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey26 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray14, false);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray2);
        org.junit.Assert.assertNotNull(multiKeyArray4);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray5);
        org.junit.Assert.assertNotNull(multiKeyArray7);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray8);
        org.junit.Assert.assertNotNull(multiKeyArray10);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray11);
        org.junit.Assert.assertNotNull(multiKeyArray13);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray14);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.Object obj10 = charSequenceMultiKey4.readResolve();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = charSequenceMultiKey3.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", charSequence1, (java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        int int3 = charSequenceMultiKey2.size();
        boolean boolean5 = charSequenceMultiKey2.equals((java.lang.Object) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray1 = new org.apache.commons.collections4.keyvalue.MultiKey[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray2 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray1;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]> charSequenceMultiKeyArrayMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]>(charSequenceMultiKeyArray2, charSequenceMultiKeyArray3);
        org.junit.Assert.assertNotNull(multiKeyArray1);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>> charSequenceMultiKeyMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>>(charSequenceMultiKeyArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, true);
        java.lang.Class<?> wildcardClass15 = charSequenceMultiKey14.getClass();
        boolean boolean16 = charSequenceMultiKey2.equals((java.lang.Object) wildcardClass15);
        java.lang.CharSequence charSequence17 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence17, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray22 = null; // flaky: charSequenceMultiKey21.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey23 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray22);
        java.lang.Object obj24 = null; // flaky: charSequenceMultiKey23.readResolve();
        java.lang.Object obj25 = null;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray27 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray28 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray27;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray30 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray31 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray33 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray34 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray33;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray36 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray37 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray36;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray39 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray40 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray39;
        charSequenceMultiKeyArray40[0] = multiKeyArray27;
        charSequenceMultiKeyArray40[1] = multiKeyArray30;
        charSequenceMultiKeyArray40[2] = charSequenceMultiKeyArray34;
        charSequenceMultiKeyArray40[3] = multiKeyArray36;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey50 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray40, true);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object) boolean16, obj24, obj25, (java.lang.Object) charSequenceMultiKeyArray40);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray22);
// flaky:         org.junit.Assert.assertNotNull(obj24);
// flaky:         org.junit.Assert.assertEquals(obj24.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(multiKeyArray27);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray28);
        org.junit.Assert.assertNotNull(multiKeyArray30);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray31);
        org.junit.Assert.assertNotNull(multiKeyArray33);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray34);
        org.junit.Assert.assertNotNull(multiKeyArray36);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray37);
        org.junit.Assert.assertNotNull(multiKeyArray39);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray40);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        int int3 = charSequenceMultiKey2.size();
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey8.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9);
        boolean boolean11 = charSequenceMultiKey2.equals((java.lang.Object) charSequenceMultiKey10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[, , MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[, , MultiKey[null, hi!, hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[, , MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", charSequence3);
        java.lang.String str5 = charSequenceMultiKey4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]" + "'", str5, "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], null]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        java.lang.CharSequence[] charSequenceArray5 = charSequenceMultiKey4.getKeys();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        int int7 = charSequenceMultiKey4.size();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[]" + "'", str6, "MultiKey[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.CharSequence[] charSequenceArray9 = charSequenceMultiKey8.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray9, false);
        int int12 = charSequenceMultiKey11.size();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray9, strArray13, strArray19, strArray26);
        boolean boolean28 = charSequenceMultiKey3.equals((java.lang.Object) strArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence31 = charSequenceMultiKey29.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.String str3 = charSequenceMultiKey2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]" + "'", str3, "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, hi!, hi!, hi!], MultiKey[], null]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        boolean boolean7 = charSequenceMultiKey5.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray6);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "", "MultiKey[null, hi!, hi!, hi!]" };
        java.lang.CharSequence[][] charSequenceArray36 = new java.lang.CharSequence[][] { charSequenceArray5, charSequenceArray11, charSequenceArray17, charSequenceArray23, charSequenceArray29, charSequenceArray35 };
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]" };
        java.lang.CharSequence[][] charSequenceArray40 = new java.lang.CharSequence[][] { charSequenceArray39 };
        java.lang.CharSequence[][] charSequenceArray41 = new java.lang.CharSequence[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey42 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[hi!, MultiKey[null, hi!, hi!, hi!], MultiKey[], MultiKey[null, hi!, hi!, hi!], ]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]]" };
        java.lang.CharSequence[][] charSequenceArray73 = new java.lang.CharSequence[][] { charSequenceArray47, charSequenceArray52, charSequenceArray57, charSequenceArray62, charSequenceArray67, charSequenceArray72 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey74 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray36, charSequenceArray40, charSequenceArray41, charSequenceArray73);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey75 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceArray57);
        org.junit.Assert.assertNotNull(charSequenceArray62);
        org.junit.Assert.assertNotNull(charSequenceArray67);
        org.junit.Assert.assertNotNull(charSequenceArray72);
        org.junit.Assert.assertNotNull(charSequenceArray73);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]", (java.lang.CharSequence) "hi!");
        int int3 = charSequenceMultiKey2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]> typeArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.reflect.Type[]>(typeArray0);
        org.junit.Assert.assertNotNull(typeArray0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        java.lang.CharSequence charSequence13 = null;
        java.lang.CharSequence charSequence15 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence13, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence15, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj19 = charSequenceMultiKey18.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray21 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray22 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray21;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray24 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray25 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray24;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray27 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray28 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray27;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray30 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray31 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray33 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray34 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray33;
        charSequenceMultiKeyArray34[0] = multiKeyArray21;
        charSequenceMultiKeyArray34[1] = charSequenceMultiKeyArray25;
        charSequenceMultiKeyArray34[2] = multiKeyArray27;
        charSequenceMultiKeyArray34[3] = multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray34);
        java.lang.Class<?> wildcardClass44 = charSequenceMultiKeyArray34.getClass();
        java.io.Serializable serializable45 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) str6, (java.io.Serializable) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.io.Serializable) charSequenceMultiKey18, (java.io.Serializable) charSequenceMultiKeyArray34, serializable45);
        java.lang.CharSequence charSequence47 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey51 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence47, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str52 = charSequenceMultiKey51.toString();
        java.lang.String str53 = charSequenceMultiKey51.toString();
        java.lang.Object obj54 = null;
        boolean boolean55 = charSequenceMultiKey51.equals(obj54);
        java.lang.Object obj56 = charSequenceMultiKey51.readResolve();
        boolean boolean57 = charSequenceMultiKey18.equals((java.lang.Object) charSequenceMultiKey51);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertNotNull(multiKeyArray21);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray22);
        org.junit.Assert.assertNotNull(multiKeyArray24);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray25);
        org.junit.Assert.assertNotNull(multiKeyArray27);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray28);
        org.junit.Assert.assertNotNull(multiKeyArray30);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray31);
        org.junit.Assert.assertNotNull(multiKeyArray33);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray34);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str52, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str53, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        java.lang.String str4 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" + "'", str4, "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.CharSequence charSequence4 = charSequenceMultiKey2.getKey((int) (byte) 1);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey28 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray10, strArray14, strArray20, strArray27);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray10);
        boolean boolean30 = charSequenceMultiKey2.equals((java.lang.Object) strComparableMultiKey29);
        java.lang.Object obj31 = charSequenceMultiKey2.readResolve();
        org.junit.Assert.assertEquals("'" + charSequence4 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", charSequence4, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceMultiKey2.equals(obj3);
        java.lang.String str5 = charSequenceMultiKey2.toString();
        java.lang.String str6 = charSequenceMultiKey2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", str5, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" + "'", str6, "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.Object obj2 = charSequenceMultiKey1.readResolve();
        java.lang.CharSequence[] charSequenceArray3 = charSequenceMultiKey1.getKeys();
        java.lang.Class<?> wildcardClass4 = charSequenceMultiKey1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "MultiKey[]");
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.String str7 = charSequenceMultiKey6.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]" + "'", str7, "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.CharSequence[][][] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String> strMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String>("hi!", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]", "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.CharSequence[] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The array of keys must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        java.lang.Object obj7 = charSequenceMultiKey5.readResolve();
        java.lang.Object obj8 = charSequenceMultiKey5.readResolve();
        java.lang.String str9 = charSequenceMultiKey5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str9, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.String str8 = null; // flaky: charSequenceMultiKey6.toString();
        java.lang.String str9 = null; // flaky: charSequenceMultiKey6.toString();
        java.lang.String str10 = null; // flaky: charSequenceMultiKey6.toString();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str8, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str10, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", charSequence2, (java.lang.CharSequence) "hi!", charSequence4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray5, false);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        boolean boolean8 = charSequenceMultiKey6.equals((java.lang.Object) '4');
        java.lang.CharSequence charSequence9 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey13 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence9, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str14 = charSequenceMultiKey13.toString();
        java.lang.String str15 = charSequenceMultiKey13.toString();
        boolean boolean16 = charSequenceMultiKey6.equals((java.lang.Object) charSequenceMultiKey13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence18 = charSequenceMultiKey13.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str14, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str15, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        java.lang.Class<?> wildcardClass5 = charSequenceMultiKey4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey7 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5, false);
        int int8 = 0; // flaky: charSequenceMultiKey7.size();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        java.lang.CharSequence[] charSequenceArray5 = charSequenceMultiKey4.getKeys();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = charSequenceMultiKey4.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[]" + "'", str6, "MultiKey[]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[]");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence[] charSequenceArray2 = charSequenceMultiKey1.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray2);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        int int5 = charSequenceMultiKey4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray8 = new java.lang.CharSequence[][] { charSequenceArray3, charSequenceArray7 };
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray17 = new java.lang.CharSequence[][] { charSequenceArray12, charSequenceArray16 };
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray26 = new java.lang.CharSequence[][] { charSequenceArray21, charSequenceArray25 };
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray35 = new java.lang.CharSequence[][] { charSequenceArray30, charSequenceArray34 };
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray44 = new java.lang.CharSequence[][] { charSequenceArray39, charSequenceArray43 };
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", "MultiKey[MultiKey[null, hi!, hi!, MultiKey[], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]]" };
        java.lang.CharSequence[][] charSequenceArray53 = new java.lang.CharSequence[][] { charSequenceArray48, charSequenceArray52 };
        java.lang.CharSequence[][][] charSequenceArray54 = new java.lang.CharSequence[][][] { charSequenceArray8, charSequenceArray17, charSequenceArray26, charSequenceArray35, charSequenceArray44, charSequenceArray53 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey56 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray54, true);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceArray53);
        org.junit.Assert.assertNotNull(charSequenceArray54);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[null, hi!, hi!, hi!], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]], , MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", charSequence1, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "MultiKey[]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.CharSequence[] charSequenceArray2 = charSequenceMultiKey1.getKeys();
        java.lang.Object obj3 = charSequenceMultiKey1.readResolve();
        java.lang.Class<?> wildcardClass4 = charSequenceMultiKey1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "MultiKey[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.String str7 = charSequenceMultiKey6.toString();
        int int8 = charSequenceMultiKey6.size();
        java.lang.Object obj9 = charSequenceMultiKey6.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str7, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj6 = charSequenceMultiKey5.readResolve();
        java.lang.String str7 = charSequenceMultiKey5.toString();
        int int8 = charSequenceMultiKey5.size();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]" + "'", str7, "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence charSequence4 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence4, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str9 = charSequenceMultiKey8.toString();
        boolean boolean10 = charSequenceMultiKey3.equals((java.lang.Object) str9);
        int int11 = charSequenceMultiKey3.size();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str9, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.CharSequence charSequence9 = null; // flaky: charSequenceMultiKey6.getKey(3);
        java.lang.Object obj10 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.String str11 = null; // flaky: charSequenceMultiKey6.toString();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
// flaky:         org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str11, "MultiKey[null, hi!, hi!, hi!]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey8 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, true);
        java.lang.String str9 = charSequenceMultiKey8.toString();
        java.lang.String str10 = charSequenceMultiKey8.toString();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str9, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" + "'", str10, "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray10, false);
        java.lang.CharSequence[] charSequenceArray13 = charSequenceMultiKey12.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey15 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey16 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13);
        boolean boolean17 = charSequenceMultiKey5.equals((java.lang.Object) charSequenceMultiKey16);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray8 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray9 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray10 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray11 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray12 = new java.lang.CharSequence[][][] { charSequenceArray7, charSequenceArray8, charSequenceArray9, charSequenceArray10, charSequenceArray11 };
        java.lang.CharSequence[][] charSequenceArray13 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray14 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray16 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray17 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray18 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray19 = new java.lang.CharSequence[][][] { charSequenceArray13, charSequenceArray14, charSequenceArray15, charSequenceArray16, charSequenceArray17, charSequenceArray18 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray19);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey23 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray12, charSequenceArray19);
        java.lang.CharSequence[][] charSequenceArray24 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray25 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray26 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray27 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray28 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray29 = new java.lang.CharSequence[][][] { charSequenceArray24, charSequenceArray25, charSequenceArray26, charSequenceArray27, charSequenceArray28 };
        java.lang.CharSequence[][] charSequenceArray30 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray31 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray32 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray33 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray34 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray35 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray36 = new java.lang.CharSequence[][][] { charSequenceArray30, charSequenceArray31, charSequenceArray32, charSequenceArray33, charSequenceArray34, charSequenceArray35 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray36, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey39 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray36);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey40 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray29, charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]" };
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]", "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[null, hi!, hi!, hi!], MultiKey[null, hi!, hi!, hi!]], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]]", "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]" };
        java.lang.CharSequence[][] charSequenceArray55 = new java.lang.CharSequence[][] { charSequenceArray47, charSequenceArray54 };
        java.lang.CharSequence[][][] charSequenceArray56 = new java.lang.CharSequence[][][] { charSequenceArray55 };
        java.lang.CharSequence[][][] charSequenceArray57 = null;
        java.lang.CharSequence[][] charSequenceArray58 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray59 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray60 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray61 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray62 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray63 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray64 = new java.lang.CharSequence[][][] { charSequenceArray58, charSequenceArray59, charSequenceArray60, charSequenceArray61, charSequenceArray62, charSequenceArray63 };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey66 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray64, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]> charSequenceArrayMultiKey67 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][]>(charSequenceArray64);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]> charSequenceArrayMultiKey68 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[][][]>(charSequenceArray12, charSequenceArray29, charSequenceArray56, charSequenceArray57, charSequenceArray64);
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]> serializableArrayMultiKey69 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable[]>((java.io.Serializable[]) strArray5, (java.io.Serializable[]) charSequenceArray29);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertNotNull(charSequenceArray59);
        org.junit.Assert.assertNotNull(charSequenceArray60);
        org.junit.Assert.assertNotNull(charSequenceArray61);
        org.junit.Assert.assertNotNull(charSequenceArray62);
        org.junit.Assert.assertNotNull(charSequenceArray63);
        org.junit.Assert.assertNotNull(charSequenceArray64);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey2 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        java.lang.String str3 = charSequenceMultiKey2.toString();
        java.lang.String str4 = charSequenceMultiKey2.toString();
        java.lang.Object obj5 = charSequenceMultiKey2.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MultiKey[]" + "'", str3, "MultiKey[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[]" + "'", str4, "MultiKey[]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "MultiKey[]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", charSequence2, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]", (java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceMultiKey5.toString();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey12 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], ]");
        java.lang.CharSequence charSequence13 = null;
        java.lang.CharSequence charSequence15 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey18 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence13, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence15, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.Object obj19 = charSequenceMultiKey18.readResolve();
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray21 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray22 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray21;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray24 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray25 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray24;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray27 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray28 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray27;
        org.apache.commons.collections4.keyvalue.MultiKey[] multiKeyArray30 = new org.apache.commons.collections4.keyvalue.MultiKey[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[] charSequenceMultiKeyArray31 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]) multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey[][] multiKeyArray33 = new org.apache.commons.collections4.keyvalue.MultiKey[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][] charSequenceMultiKeyArray34 = (org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[][]) multiKeyArray33;
        charSequenceMultiKeyArray34[0] = multiKeyArray21;
        charSequenceMultiKeyArray34[1] = charSequenceMultiKeyArray25;
        charSequenceMultiKeyArray34[2] = multiKeyArray27;
        charSequenceMultiKeyArray34[3] = multiKeyArray30;
        org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]> charSequenceMultiKeyArrayMultiKey43 = new org.apache.commons.collections4.keyvalue.MultiKey<org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>[]>(charSequenceMultiKeyArray34);
        java.lang.Class<?> wildcardClass44 = charSequenceMultiKeyArray34.getClass();
        java.io.Serializable serializable45 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable> serializableMultiKey46 = new org.apache.commons.collections4.keyvalue.MultiKey<java.io.Serializable>((java.io.Serializable) str6, (java.io.Serializable) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", (java.io.Serializable) charSequenceMultiKey18, (java.io.Serializable) charSequenceMultiKeyArray34, serializable45);
        int int47 = charSequenceMultiKey18.size();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]" + "'", str6, "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], null, MultiKey[], ]");
        org.junit.Assert.assertNotNull(multiKeyArray21);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray22);
        org.junit.Assert.assertNotNull(multiKeyArray24);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray25);
        org.junit.Assert.assertNotNull(multiKeyArray27);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray28);
        org.junit.Assert.assertNotNull(multiKeyArray30);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray31);
        org.junit.Assert.assertNotNull(multiKeyArray33);
        org.junit.Assert.assertNotNull(charSequenceMultiKeyArray34);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey1 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray0, false);
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray5 = null; // flaky: charSequenceMultiKey4.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = null; // flaky: new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray5);
        java.lang.Object obj7 = null; // flaky: charSequenceMultiKey6.readResolve();
        java.lang.CharSequence charSequence9 = null; // flaky: charSequenceMultiKey6.getKey((int) (byte) 1);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray5);
// flaky:         org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "MultiKey[null, hi!, hi!, hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]], MultiKey[null, MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!], , MultiKey[], ], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray9, charSequenceArray12, charSequenceArray13, charSequenceArray19);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13, true);
        java.lang.Object obj25 = charSequenceMultiKey24.readResolve();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "MultiKey[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "MultiKey[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "MultiKey[]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], MultiKey[hi!, hi!, null, MultiKey[null, hi!, hi!, hi!], hi!]]");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey6 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray4, false);
        java.lang.CharSequence[] charSequenceArray7 = charSequenceMultiKey6.getKeys();
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey9 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey11 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "", (java.lang.CharSequence) "MultiKey[hi!, MultiKey[], , MultiKey[], MultiKey[null, hi!, hi!, hi!]]", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey10 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey20 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey27 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray9, strArray13, strArray19, strArray26);
        boolean boolean28 = charSequenceMultiKey3.equals((java.lang.Object) strArray26);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey29 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence[]) strArray26);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey31 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray30);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey38 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray37);
        java.lang.String[] strArray41 = new java.lang.String[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "MultiKey[]", "", "MultiKey[]", "MultiKey[null, hi!, hi!, hi!]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>> strComparableMultiKey48 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>[]) strArray47);
        java.lang.String[] strArray54 = new java.lang.String[] { "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", "hi!", "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", "MultiKey[]", "MultiKey[MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey55 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray37, strArray41, strArray47, strArray54);
        boolean boolean56 = charSequenceMultiKey31.equals((java.lang.Object) strArray41);
        java.lang.String[] strArray57 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]> strArrayMultiKey58 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.String[]>(strArray26, strArray41, strArray57);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey4 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMultiKey4.toString();
        java.lang.String str6 = charSequenceMultiKey4.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = charSequenceMultiKey4.equals(obj7);
        java.lang.CharSequence[] charSequenceArray9 = null; // flaky: charSequenceMultiKey4.getKeys();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "MultiKey[null, hi!, hi!, hi!]", "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey14 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "MultiKey[null, hi!, hi!, hi!]", "hi!", "hi!" };
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey21 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequenceArray19, false);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]> charSequenceArrayMultiKey22 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence[]>(charSequenceArray9, charSequenceArray12, charSequenceArray13, charSequenceArray19);
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object> objMultiKey24 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.Object>((java.lang.Object[]) charSequenceArray13, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str5, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MultiKey[null, hi!, hi!, hi!]" + "'", str6, "MultiKey[null, hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]]", charSequence1, (java.lang.CharSequence) "MultiKey[null, hi!, hi!, hi!]");
        java.lang.String str4 = charSequenceMultiKey3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]" + "'", str4, "MultiKey[MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]], null, MultiKey[null, hi!, hi!, hi!]]");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey3 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!]", (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]");
        java.lang.Object obj4 = charSequenceMultiKey3.readResolve();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "MultiKey[hi!, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "MultiKey[hi!, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "MultiKey[hi!, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence> charSequenceMultiKey5 = new org.apache.commons.collections4.keyvalue.MultiKey<java.lang.CharSequence>(charSequence0, (java.lang.CharSequence) "MultiKey[, MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], MultiKey[, MultiKey[null, hi!, hi!, hi!], hi!, hi!], hi!]", charSequence2, (java.lang.CharSequence) "MultiKey[]", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = null; // flaky: charSequenceMultiKey5.getKeys();
        int int7 = charSequenceMultiKey5.size();
// flaky:         org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }
}
