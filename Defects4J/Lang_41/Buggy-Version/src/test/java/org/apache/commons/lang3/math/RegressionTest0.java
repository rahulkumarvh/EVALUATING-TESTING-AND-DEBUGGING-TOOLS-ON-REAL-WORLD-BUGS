package org.apache.commons.lang;

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
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) 1.0d, "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) '4', "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) '4', "java.lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Character" + "'", str2, "Character");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray7.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "java.lang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java/lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) 100, "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java" + "'", str1, "java");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) true, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?> wildcardClass8 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("Character");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Character" + "'", str1, "Character");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageName(obj0, "$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$" + "'", str2, "$");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?> wildcardClass17 = wildcardClassArray7.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.String str31 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) true, ".");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang" + "'", str31, "java.lang");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, ".");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) (short) -1, "java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("Class[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "Character", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Character");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(obj0, ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object[] objArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang.ClassUtils.toClass(objArray0);
        org.junit.Assert.assertNull(wildcardClassArray1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Class<?> wildcardClass9 = wildcardClassArray8.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, ".", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) "java", "java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(obj0, "Character");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Character" + "'", str2, "Character");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "String" + "'", str1, "String");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass(".", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray0);
        org.junit.Assert.assertNull(wildcardClassArray1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "java", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("Character");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Character" + "'", str1, "Character");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16, false);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass(objArray26);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang.ClassUtils.toClass(objArray34);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray35);
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray35);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        boolean boolean54 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        boolean boolean57 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray53, true);
        java.lang.String str59 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) boolean57, "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang" + "'", str59, "java.lang");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) "ArrayList", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang.ClassUtils.toClass(objArray22);
        boolean boolean24 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) boolean25, "Character");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Boolean" + "'", str27, "Boolean");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(".");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "java", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("ArrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("ArrayList", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArrayList");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.Class<?> wildcardClass7 = wildcardClassList6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClassList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("String", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: String");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("ArrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ArrayList" + "'", str1, "ArrayList");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.lang.ClassUtils classUtils0 = new org.apache.commons.lang.ClassUtils();
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) classUtils0, "java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang" + "'", str2, "org.apache.commons.lang");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java" + "'", str1, "java");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) "Boolean", "Character");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("Class[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Class[]" + "'", str1, "Class[]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) (short) 100, "Character");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray24);
        boolean boolean26 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray24);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang.ClassUtils.toClass(objArray33);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray34);
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang.ClassUtils.toClass(objArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray43);
        boolean boolean46 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray43, false);
        boolean boolean48 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray43, true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.String str9 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) objArray6, "java");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.toClass(objArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass(objArray26);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang.ClassUtils.toClass(objArray34);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray35);
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray35);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        boolean boolean54 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray53);
        boolean boolean56 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray53, false);
        boolean boolean57 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray53);
        java.lang.Class<?> wildcardClass58 = wildcardClassArray10.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("Class[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Class[]" + "'", str1, "Class[]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) (short) 0, "String");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(obj0, "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang.ClassUtils.toClass(objArray31);
        boolean boolean33 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray32);
        boolean boolean35 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray32, true);
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang.ClassUtils.toClass(objArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray43);
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang.ClassUtils.toClass(objArray51);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray52);
        boolean boolean55 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray43, wildcardClassArray52, false);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray52);
        boolean boolean58 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray56, false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("org.apache.commons.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons.lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(".");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) "Class[]", "Class[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Class<?> wildcardClass31 = wildcardClassArray30.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.String str18 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) boolean16, ".");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Boolean" + "'", str18, "Boolean");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray24);
        boolean boolean26 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray24);
        java.lang.String str28 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray24, "$");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Class[]" + "'", str28, "Class[]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("org.apache.commons.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.commons" + "'", str1, "org.apache.commons");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass(objArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang.ClassUtils.toClass(objArray45);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang.ClassUtils.toClass(objArray53);
        boolean boolean55 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray54);
        boolean boolean56 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray54);
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang.ClassUtils.toClass(objArray63);
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang.ClassUtils.toClass(objArray71);
        boolean boolean73 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray72);
        boolean boolean75 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray72, false);
        boolean boolean77 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray72, false);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass(objArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        boolean boolean11 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("Character");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("Object[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Object");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("Object[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Object[]" + "'", str1, "Object[]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass(objArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang.ClassUtils.toClass(objArray45);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang.ClassUtils.toClass(objArray53);
        boolean boolean55 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray54);
        boolean boolean56 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray54);
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang.ClassUtils.toClass(objArray63);
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang.ClassUtils.toClass(objArray71);
        boolean boolean73 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray72);
        boolean boolean75 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray72, false);
        boolean boolean77 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray72, false);
        java.lang.String str79 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray72, "java");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Class[]" + "'", str79, "Class[]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) 10L, ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Long" + "'", str2, "Long");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("ArrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ArrayList" + "'", str1, "ArrayList");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "String" + "'", str1, "String");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String[] strArray13 = new java.lang.String[] { "java.lang", "Object[]", "Class[]", ".", "Long", "java", "Boolean", "Boolean", "$", "ArrayList", "ArrayList", "$", "java" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<java.lang.Class<?>> wildcardClassList16 = org.apache.commons.lang.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList14);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClassList16);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass(objArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) objArray24, "java");
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang.ClassUtils.toClass(objArray24);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang.ClassUtils.toClass(objArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray36);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        boolean boolean54 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray53);
        boolean boolean55 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray53);
        java.lang.Object[] objArray62 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang.ClassUtils.toClass(objArray62);
        java.lang.Object[] objArray70 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang.ClassUtils.toClass(objArray70);
        boolean boolean72 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray71);
        boolean boolean74 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray71, false);
        boolean boolean75 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray71);
        boolean boolean77 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray28, true);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang" + "'", str27, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) "hi!", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16, false);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) 1.0f, "java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "Boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Boolean");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortClassName(obj0, "String");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("java", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("Boolean");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Boolean" + "'", str1, "Boolean");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("Object[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Object[]" + "'", str1, "Object[]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("org.apache.commons");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache" + "'", str1, "org.apache");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("org.apache.commons");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "commons" + "'", str1, "commons");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.String str18 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray7, "Character");
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang" + "'", str18, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray19);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("org.apache");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org" + "'", str1, "org");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) ".", "org");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass(objArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang.ClassUtils.toClass(objArray45);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang.ClassUtils.toClass(objArray53);
        boolean boolean55 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray54);
        boolean boolean56 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray54);
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang.ClassUtils.toClass(objArray63);
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang.ClassUtils.toClass(objArray71);
        boolean boolean73 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray72);
        boolean boolean75 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray72, false);
        boolean boolean77 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray72, false);
        java.lang.Object[] objArray84 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang.ClassUtils.toClass(objArray84);
        java.lang.Object[] objArray92 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang.ClassUtils.toClass(objArray92);
        boolean boolean94 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray85, wildcardClassArray93);
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray93);
        boolean boolean96 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray72, wildcardClassArray93);
        java.lang.Class<?> wildcardClass97 = wildcardClassArray93.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "commons");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16, false);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang.ClassUtils.toClass(objArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass(objArray36);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        boolean boolean46 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray45);
        boolean boolean47 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray45);
        boolean boolean49 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray29, false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray0);
        org.junit.Assert.assertNull(wildcardClassArray1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "Character", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Character");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("Boolean");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray24);
        boolean boolean26 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray24);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang.ClassUtils.toClass(objArray33);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang.ClassUtils.toClass(objArray41);
        boolean boolean43 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray42);
        boolean boolean45 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray42, false);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray24);
        java.lang.Class<?> wildcardClass47 = wildcardClassArray46.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.String str10 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray7, "java.lang");
        java.lang.String str12 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) "java.lang", "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Class[]" + "'", str10, "Class[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "String" + "'", str12, "String");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName(".");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageName(obj0, ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray24);
        boolean boolean26 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray24);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang.ClassUtils.toClass(objArray33);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang.ClassUtils.toClass(objArray41);
        boolean boolean43 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray42);
        boolean boolean45 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray42, false);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang.ClassUtils.toClass(objArray60);
        boolean boolean62 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray61);
        java.lang.String str65 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray63, "");
        boolean boolean66 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang" + "'", str65, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("Class", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Class");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("Class");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Class" + "'", str1, "Class");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "commons", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("java.util");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "util" + "'", str1, "util");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) 1.0f, "org");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("org.apache.commons.lang", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons.lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) "Class[]", "org.apache");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("org");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("Character");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass(objArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        boolean boolean17 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardClassArray20);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang" + "'", str1, "lang");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) (byte) 0, "java.lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("Long");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Long" + "'", str1, "Long");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Class<?> wildcardClass30 = wildcardClassArray24.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray25);
        boolean boolean28 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray26, true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) (short) 100, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang.ClassUtils.toClass(objArray31);
        boolean boolean33 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray32);
        boolean boolean35 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray32, true);
        java.lang.String str37 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) true, "lang");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Boolean" + "'", str37, "Boolean");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray24);
        boolean boolean26 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray24);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang.ClassUtils.toClass(objArray33);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang.ClassUtils.toClass(objArray41);
        boolean boolean43 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray42);
        boolean boolean45 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray42, false);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang.ClassUtils.toClass(objArray60);
        boolean boolean62 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray61);
        java.lang.String str65 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray63, "");
        boolean boolean66 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray63);
        java.lang.Class<?> wildcardClass67 = wildcardClassArray63.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang" + "'", str65, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass(objArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) objArray24, "java");
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang.ClassUtils.toClass(objArray24);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang.ClassUtils.toClass(objArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray36);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        boolean boolean54 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray53);
        boolean boolean55 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray53);
        java.lang.Object[] objArray62 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang.ClassUtils.toClass(objArray62);
        java.lang.Object[] objArray70 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang.ClassUtils.toClass(objArray70);
        boolean boolean72 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray71);
        boolean boolean74 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray71, false);
        boolean boolean75 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray71);
        boolean boolean77 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray28, true);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray17);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang" + "'", str27, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "org");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("Class");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("org");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org" + "'", str1, "org");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "org.apache.commons", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache/commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "org.apache");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16, false);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass(objArray26);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang.ClassUtils.toClass(objArray34);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray35);
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray35);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        boolean boolean54 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        boolean boolean57 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray53, true);
        java.lang.String str59 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) boolean57, "java");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Boolean" + "'", str59, "Boolean");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang" + "'", str1, "lang");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("ArrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray24);
        boolean boolean26 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray24);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang.ClassUtils.toClass(objArray33);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang.ClassUtils.toClass(objArray41);
        boolean boolean43 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray42);
        boolean boolean45 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray42, false);
        java.lang.String str47 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray42, "org.apache");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Class[]" + "'", str47, "Class[]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("org.apache.commons");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "commons" + "'", str1, "commons");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass(objArray26);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        boolean boolean31 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray27, true);
        java.lang.Class<?> wildcardClass32 = wildcardClassArray27.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.String str21 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray17, "Object[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Class[]" + "'", str21, "Class[]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("$");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass(objArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        boolean boolean17 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray16);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass(objArray24);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray25);
        java.lang.String str28 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray25, "java.lang");
        boolean boolean30 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray25, true);
        boolean boolean31 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray25);
        java.lang.String str33 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray0, "Object[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Class[]" + "'", str28, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Object[]" + "'", str33, "Object[]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortClassName(obj0, "lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lang" + "'", str2, "lang");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("ArrayList");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArrayList");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "Class");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Class");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.String str19 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray17, "");
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass(objArray26);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang.ClassUtils.toClass(objArray34);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.String str41 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray39, "hi!");
        boolean boolean43 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray39, true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang" + "'", str19, "java.lang");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.lang" + "'", str41, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("Object[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.String str9 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) objArray6, "java");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.toClass(objArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass(objArray26);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang.ClassUtils.toClass(objArray34);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray35);
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray35);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        boolean boolean54 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray53);
        boolean boolean56 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray53, false);
        boolean boolean57 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray53);
        java.lang.String str59 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray10, "commons");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang" + "'", str59, "java.lang");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("java");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("Boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Boolean");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "org.apache.commons");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache/commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "Class", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Class");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("org.apache.commons.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang" + "'", str1, "lang");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.String str19 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray17, "ArrayList");
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass(objArray26);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray27);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang.ClassUtils.toClass(objArray35);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang.ClassUtils.toClass(objArray43);
        boolean boolean45 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray44);
        boolean boolean46 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray44);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang.ClassUtils.toClass(objArray53);
        java.lang.Object[] objArray61 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang.ClassUtils.toClass(objArray61);
        boolean boolean63 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray62);
        boolean boolean65 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray62, false);
        java.lang.Object[] objArray72 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang.ClassUtils.toClass(objArray72);
        java.lang.Object[] objArray80 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang.ClassUtils.toClass(objArray80);
        boolean boolean82 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray73, wildcardClassArray81);
        java.lang.Class<?>[] wildcardClassArray83 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray81);
        java.lang.String str85 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray83, "");
        boolean boolean86 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray83);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray83);
        boolean boolean88 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray87);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Class[]" + "'", str19, "Class[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "java.lang" + "'", str85, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("org.apache.commons", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.String str10 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray7, "java.lang");
        java.lang.String str12 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray7, "java.util");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Class[]" + "'", str10, "Class[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Class[]" + "'", str12, "Class[]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray24);
        boolean boolean26 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray24);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass(objArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        boolean boolean17 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray16);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass(objArray24);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang.ClassUtils.toClass(objArray32);
        boolean boolean34 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray25, wildcardClassArray33);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray33, true);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray33);
        boolean boolean39 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray37, false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("String", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: String");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) "Class", "$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.String str32 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray7, "org.apache");
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang.ClassUtils.toClass(objArray39);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray40);
        java.lang.String str43 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray41, "java.lang");
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray41);
        boolean boolean46 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray41, true);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang.ClassUtils.toClass(objArray53);
        java.lang.String str56 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) objArray53, "java");
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang.ClassUtils.toClass(objArray53);
        java.lang.Object[] objArray64 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang.ClassUtils.toClass(objArray64);
        java.lang.Object[] objArray72 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang.ClassUtils.toClass(objArray72);
        java.lang.Object[] objArray80 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang.ClassUtils.toClass(objArray80);
        boolean boolean82 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray73, wildcardClassArray81);
        boolean boolean83 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray65, wildcardClassArray73);
        boolean boolean84 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray57, wildcardClassArray73);
        java.lang.Object[] objArray91 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang.ClassUtils.toClass(objArray91);
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray92);
        java.lang.String str95 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray92, "");
        java.lang.Class<?>[] wildcardClassArray96 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray92);
        boolean boolean98 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray57, wildcardClassArray96, false);
        boolean boolean99 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray96);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang" + "'", str32, "java.lang");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang" + "'", str43, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang" + "'", str56, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "java.lang" + "'", str95, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("org");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16, false);
        java.lang.String str21 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) false, "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang" + "'", str21, "java.lang");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("org.apache.commons.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.commons" + "'", str1, "org.apache.commons");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass(".");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) "util", "util");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.String str10 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray7, "");
        java.lang.String str12 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray7, "Boolean");
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang.ClassUtils.toClass(objArray22);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang.ClassUtils.toClass(objArray30);
        boolean boolean32 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray33);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray33);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray35);
        java.lang.String str38 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray35, "hi!");
        boolean boolean40 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray35, true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Class[]" + "'", str12, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Class[]" + "'", str38, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "Class[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LClass;");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("Long", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Long");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16, false);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang.ClassUtils.toClass(objArray27);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang.ClassUtils.toClass(objArray35);
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray38);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray38);
        boolean boolean41 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray40);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.String str10 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray7, "");
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("org.apache");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org" + "'", str1, "org");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("java.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java.lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String[] strArray9 = new java.lang.String[] { "Long", "Class", "org.apache.commons", "Object[]", "java", ".", "Class[]", ".", "Boolean" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<java.lang.Class<?>> wildcardClassList12 = org.apache.commons.lang.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList10);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClassList12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) 0.0f, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Float" + "'", str2, "Float");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.util.List<java.lang.Class<?>> wildcardClassList8 = org.apache.commons.lang.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.util.List<java.lang.Class<?>> wildcardClassList9 = org.apache.commons.lang.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList4);
        java.lang.String str11 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassList9, "$");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClassList6);
        org.junit.Assert.assertNotNull(wildcardClassList7);
        org.junit.Assert.assertNotNull(wildcardClassList8);
        org.junit.Assert.assertNotNull(wildcardClassList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ArrayList" + "'", str11, "ArrayList");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageName("org.apache.commons");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache" + "'", str1, "org.apache");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray24);
        boolean boolean26 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray24);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang.ClassUtils.toClass(objArray33);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang.ClassUtils.toClass(objArray41);
        boolean boolean43 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray42);
        boolean boolean45 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray42, false);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang.ClassUtils.toClass(objArray60);
        boolean boolean62 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray61);
        java.lang.String str65 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray63, "");
        boolean boolean66 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray63);
        java.lang.String str68 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray63, "Long");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang" + "'", str65, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "java.lang" + "'", str68, "java.lang");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?> wildcardClass20 = wildcardClassArray17.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("java.util", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java.util");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.String str9 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) objArray6, "java");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.toClass(objArray17);
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang.ClassUtils.toClass(objArray25);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang.ClassUtils.toClass(objArray33);
        boolean boolean35 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray34);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray26);
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray26);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        boolean boolean54 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray55);
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang.ClassUtils.toClass(objArray63);
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang.ClassUtils.toClass(objArray71);
        boolean boolean73 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray72);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray74);
        boolean boolean76 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray55, wildcardClassArray74);
        boolean boolean78 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray74, false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray24);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("org.apache");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) "java", "Character");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass(objArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang.ClassUtils.toClass(objArray45);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang.ClassUtils.toClass(objArray53);
        boolean boolean55 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray54);
        boolean boolean56 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray54);
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang.ClassUtils.toClass(objArray63);
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang.ClassUtils.toClass(objArray71);
        boolean boolean73 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray72);
        boolean boolean75 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray72, false);
        boolean boolean77 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray72, false);
        java.lang.Object[] objArray84 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang.ClassUtils.toClass(objArray84);
        java.lang.Object[] objArray92 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang.ClassUtils.toClass(objArray92);
        boolean boolean94 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray85, wildcardClassArray93);
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray93);
        boolean boolean96 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray72, wildcardClassArray93);
        java.lang.String str98 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray72, "ArrayList");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "Class[]" + "'", str98, "Class[]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("commons");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?> wildcardClass10 = wildcardClassArray9.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortClassName("Long");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Long" + "'", str1, "Long");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName("java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java" + "'", str1, "java");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16, false);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang.ClassUtils.toClass(objArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass(objArray36);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        boolean boolean46 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray45);
        boolean boolean47 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray45);
        java.lang.Object[] objArray54 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang.ClassUtils.toClass(objArray54);
        java.lang.Object[] objArray62 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang.ClassUtils.toClass(objArray62);
        boolean boolean64 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray55, wildcardClassArray63);
        boolean boolean66 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray63, false);
        java.lang.Object[] objArray73 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang.ClassUtils.toClass(objArray73);
        java.lang.Object[] objArray81 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang.ClassUtils.toClass(objArray81);
        boolean boolean83 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray74, wildcardClassArray82);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray82);
        java.lang.String str86 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray84, "");
        boolean boolean87 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray84);
        java.lang.Class<?>[] wildcardClassArray88 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray84);
        boolean boolean90 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray88, true);
        java.lang.String str92 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) true, "$");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "java.lang" + "'", str86, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "java.lang" + "'", str92, "java.lang");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("commons", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: commons");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.String str9 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) objArray6, "java");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.toClass(objArray17);
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang.ClassUtils.toClass(objArray25);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang.ClassUtils.toClass(objArray33);
        boolean boolean35 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray34);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray26);
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray26);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray45);
        java.lang.String str48 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray45, "");
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        boolean boolean51 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray49, false);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray49);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "org.apache", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang.ClassUtils.toClass(objArray38);
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang.ClassUtils.toClass(objArray46);
        boolean boolean48 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray47);
        java.lang.Object[] objArray55 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang.ClassUtils.toClass(objArray55);
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang.ClassUtils.toClass(objArray63);
        boolean boolean65 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray56, wildcardClassArray64);
        boolean boolean67 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray64, true);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray69);
        boolean boolean72 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray69, false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray17);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang.ClassUtils.toClass(objArray27);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang.ClassUtils.toClass(objArray35);
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray36);
        java.lang.String str39 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray28, "Character");
        boolean boolean40 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray28);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang" + "'", str39, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.String str32 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray7, "org.apache");
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang.ClassUtils.toClass(objArray40);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray41);
        boolean boolean46 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray41, true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang" + "'", str32, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass(objArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        boolean boolean17 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray16);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass(objArray24);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray25);
        java.lang.String str28 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray25, "java.lang");
        boolean boolean30 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray25, true);
        boolean boolean31 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray25);
        java.lang.Class<?> wildcardClass32 = wildcardClassArray25.getClass();
        java.lang.String str34 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClass32, "java");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Class[]" + "'", str28, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang" + "'", str34, "java.lang");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray24);
        boolean boolean26 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray24);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang.ClassUtils.toClass(objArray33);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang.ClassUtils.toClass(objArray41);
        boolean boolean43 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray42);
        boolean boolean45 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray42, false);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray24);
        java.lang.String str48 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray24, "Character");
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray24);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray49);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("$", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageName(obj0, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16, false);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang.ClassUtils.toClass(objArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass(objArray36);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        boolean boolean46 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray45);
        boolean boolean47 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray45);
        java.lang.Object[] objArray54 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang.ClassUtils.toClass(objArray54);
        java.lang.Object[] objArray62 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang.ClassUtils.toClass(objArray62);
        boolean boolean64 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray55, wildcardClassArray63);
        boolean boolean66 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray63, false);
        java.lang.Object[] objArray73 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang.ClassUtils.toClass(objArray73);
        java.lang.Object[] objArray81 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang.ClassUtils.toClass(objArray81);
        boolean boolean83 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray74, wildcardClassArray82);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray82);
        java.lang.String str86 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray84, "");
        boolean boolean87 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray84);
        java.lang.Class<?>[] wildcardClassArray88 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray84);
        boolean boolean90 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray88, true);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray88);
        java.lang.String str93 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray91, "Class[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "java.lang" + "'", str86, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Class[]" + "'", str93, "Class[]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.String str1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName("java.util");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java" + "'", str1, "java");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "String", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: String");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.String str19 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray17, "");
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass(objArray26);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang.ClassUtils.toClass(objArray34);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray35);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang.ClassUtils.toClass(objArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray44);
        java.lang.String str47 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray44, "java.lang");
        boolean boolean49 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray44, true);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray44);
        boolean boolean51 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray44);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang" + "'", str19, "java.lang");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Class[]" + "'", str47, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getShortClassName(obj0, "Float");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Float" + "'", str2, "Float");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass(objArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) objArray24, "java");
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang.ClassUtils.toClass(objArray24);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang.ClassUtils.toClass(objArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray36);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        boolean boolean54 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray53);
        boolean boolean55 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray53);
        java.lang.Object[] objArray62 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang.ClassUtils.toClass(objArray62);
        java.lang.Object[] objArray70 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang.ClassUtils.toClass(objArray70);
        boolean boolean72 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray71);
        boolean boolean74 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray71, false);
        boolean boolean75 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray71);
        boolean boolean77 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray28, true);
        java.lang.String str79 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) true, "org.apache.commons.lang");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang" + "'", str27, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "java.lang" + "'", str79, "java.lang");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass("Character", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Character");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang.ClassUtils.getClass(classLoader0, "org.apache.commons.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache/commons/lang");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16, false);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass(objArray26);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang.ClassUtils.toClass(objArray34);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray35);
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray35);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang.ClassUtils.toClass(objArray44);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang.ClassUtils.toClass(objArray52);
        boolean boolean54 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        boolean boolean57 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray53, true);
        java.lang.Class<?> wildcardClass58 = wildcardClassArray35.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Class<?> wildcardClass31 = wildcardClassArray7.getClass();
        java.lang.String str33 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) wildcardClass31, "org.apache.commons.lang");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Class" + "'", str33, "Class");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(obj0, "Long");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Long" + "'", str2, "Long");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16, false);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass(objArray26);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang.ClassUtils.toClass(objArray34);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray35);
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass(objArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        boolean boolean17 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang.ClassUtils.toClass(objArray15);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray16);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray16, false);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang.ClassUtils.toClass(objArray26);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang.ClassUtils.toClass(objArray34);
        boolean boolean36 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray35);
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(wildcardClassArray16);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang.ClassUtils.getClass("util");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: util");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang.ClassUtils.toClass(objArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.String str27 = org.apache.commons.lang.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray24, "java.lang");
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray24, true);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang.ClassUtils.toClass(objArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang.ClassUtils.toClass(objArray45);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang.ClassUtils.toClass(objArray53);
        boolean boolean55 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray54);
        boolean boolean56 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray54);
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang.ClassUtils.toClass(objArray63);
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang.ClassUtils.toClass(objArray71);
        boolean boolean73 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray72);
        boolean boolean75 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray72, false);
        boolean boolean77 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray72, false);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Class[]" + "'", str27, "Class[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang.ClassUtils.toClass(objArray14);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang.ClassUtils.toClass(objArray22);
        boolean boolean24 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray15);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang.ClassUtils.toClass(objArray32);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang.ClassUtils.toClass(objArray40);
        boolean boolean42 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray41);
        java.lang.Object[] objArray49 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang.ClassUtils.toClass(objArray49);
        java.lang.Object[] objArray57 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang.ClassUtils.toClass(objArray57);
        boolean boolean59 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray50, wildcardClassArray58);
        boolean boolean61 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray58, true);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray58);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray58);
        java.lang.Object[] objArray70 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang.ClassUtils.toClass(objArray70);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray71);
        java.lang.String str74 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray72, "java.lang");
        boolean boolean75 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray72);
        boolean boolean76 = org.apache.commons.lang.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray63);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "java.lang" + "'", str74, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.String[] strArray14 = new java.lang.String[] { "java", "Boolean", "", "String", "util", "hi!", "Class[]", "commons", "Class[]", "$", "Class[]", "hi!", "ArrayList", "ArrayList" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.Class<?>> wildcardClassList17 = org.apache.commons.lang.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList15);
        java.lang.String str19 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) wildcardClassList17, "ArrayList");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ArrayList" + "'", str19, "ArrayList");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0d), (short) 0, 1.0f, 1, "" };
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang.ClassUtils.toClass(objArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        java.lang.Class<?> wildcardClass10 = wildcardClassArray9.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 1.0, 1, ]");
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

