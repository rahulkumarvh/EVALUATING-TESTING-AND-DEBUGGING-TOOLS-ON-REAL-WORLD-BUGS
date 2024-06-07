package org.apache.commons.lang.enums;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum6 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.String str5 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum7 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, (int) '.');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Class;" + "'", str5, "Class;");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.Class class5 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum8 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, (int) '$');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        char[] charArray2 = new char[] { 'a' };
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("0", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum6 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.String str5 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Class) wildcardClass4);
        java.lang.Class class6 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        java.lang.Class class7 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[] { class7 };
        java.lang.Class[] classArray9 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray8);
        java.lang.Class[] classArray10 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray9);
        java.lang.Class<?> wildcardClass11 = classArray10.getClass();
        java.lang.Class class12 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass11);
        boolean boolean13 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass11);
        java.util.List list14 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass11);
        java.lang.Class class15 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass11);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(class6, (java.lang.Class) wildcardClass11);
        java.util.Iterator iterator17 = null; // flaky: org.apache.commons.lang.enums.Enum.iterator((java.lang.Class) wildcardClass11);
        org.apache.commons.lang.enums.Enum enum19 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass11, (int) ' ');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Class;" + "'", str5, "Class;");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(enum19);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        java.lang.String str6 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Class) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum8 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "String;" + "'", str6, "String;");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum6 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class[] classArray4 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray3);
        java.lang.Class<?> wildcardClass5 = classArray4.getClass();
        java.lang.Class class6 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass5);
        java.util.List list8 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass5);
        java.lang.Class class9 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean10 = org.apache.commons.lang.ClassUtils.isAssignable(class0, class9);
        java.lang.Class class11 = null;
        java.lang.Class[] classArray12 = new java.lang.Class[] { class11 };
        java.lang.Class[] classArray13 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray12);
        java.lang.Class[] classArray14 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray13);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        java.lang.Class class16 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass15);
        java.util.List list17 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass15);
        boolean boolean18 = org.apache.commons.lang.ClassUtils.isAssignable(class9, (java.lang.Class) wildcardClass15);
        org.apache.commons.lang.enums.Enum enum20 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum(class9, 3);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(enum20);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.String str5 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Class) wildcardClass4);
        java.lang.Class class6 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("  .", "$$hi!$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        java.lang.Class<?> wildcardClass10 = strArray9.getClass();
        boolean boolean11 = org.apache.commons.lang.ClassUtils.isAssignable(class6, (java.lang.Class) wildcardClass10);
        java.util.List list12 = org.apache.commons.lang.ClassUtils.getAllInterfaces(class6);
        java.util.Map map13 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnumMap(class6);
        java.lang.String[] strArray16 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("  .", "$$hi!$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        java.lang.Class<?> wildcardClass17 = strArray16.getClass();
        boolean boolean18 = org.apache.commons.lang.ClassUtils.isAssignable(class6, (java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum20 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Class;" + "'", str5, "Class;");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
// flaky:         org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        char[] charArray9 = new char[] { 'a', '4', 'a', '4' };
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsOnly("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray9);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray9);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("string", charArray9);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut("orgapachecommonslangNullArgumentException:!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihmustnotbenull", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        java.lang.String str16 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum18 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass15, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.Class class5 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        java.util.List list6 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass4);
        org.apache.commons.lang.enums.Enum enum8 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnum((java.lang.Class) wildcardClass4, "[Ljava.lang");
        org.apache.commons.lang.enums.Enum enum10 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, 7);
        java.lang.String str11 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Class) wildcardClass4);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(enum8);
        org.junit.Assert.assertNull(enum10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[Ljava.lang" + "'", str11, "[Ljava.lang");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.String str5 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Class) wildcardClass4);
        java.lang.Class class6 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        org.apache.commons.lang.enums.Enum enum8 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, (int) (short) 10);
        org.apache.commons.lang.enums.Enum enum10 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, 1);
        java.lang.String str12 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Object) enum10, "CLASS;$");
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Class;" + "'", str5, "Class;");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNull(enum8);
        org.junit.Assert.assertNull(enum10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CLASS;$" + "'", str12, "CLASS;$");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class[] classArray4 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray3);
        java.lang.Class<?> wildcardClass5 = classArray4.getClass();
        java.lang.Class class6 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass5);
        java.util.List list8 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass5);
        java.lang.Class class9 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean10 = org.apache.commons.lang.ClassUtils.isAssignable(class0, class9);
        java.lang.Class class11 = null;
        java.lang.Class[] classArray12 = new java.lang.Class[] { class11 };
        java.lang.Class[] classArray13 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray12);
        java.lang.Class[] classArray14 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray13);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        java.lang.Class class16 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass15);
        java.util.List list17 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass15);
        boolean boolean18 = org.apache.commons.lang.ClassUtils.isAssignable(class9, (java.lang.Class) wildcardClass15);
        java.lang.Class class19 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(class9);
        org.apache.commons.lang.enums.Enum enum21 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum(class19, (int) (short) 1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNull(enum21);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum6 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class[] classArray4 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray3);
        java.lang.Class<?> wildcardClass5 = classArray4.getClass();
        java.lang.Class class6 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass5);
        java.util.List list8 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass5);
        java.lang.Class class9 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean10 = org.apache.commons.lang.ClassUtils.isAssignable(class0, class9);
        java.lang.Class class11 = null;
        java.lang.Class[] classArray12 = new java.lang.Class[] { class11 };
        java.lang.Class[] classArray13 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray12);
        java.lang.Class[] classArray14 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray13);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        java.lang.Class class16 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass15);
        java.util.List list17 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass15);
        boolean boolean18 = org.apache.commons.lang.ClassUtils.isAssignable(class9, (java.lang.Class) wildcardClass15);
        java.lang.String str19 = org.apache.commons.lang.ClassUtils.getPackageName(class9);
        org.apache.commons.lang.enums.Enum enum21 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum(class9, 0);
        java.lang.Class[] classArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method24 = org.apache.commons.lang.ClassUtils.getPublicMethod(class9, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", classArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: [Ljava.lang.Class;.Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi()");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[Ljava.lang" + "'", str19, "[Ljava.lang");
        org.junit.Assert.assertNull(enum21);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class[] classArray4 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray3);
        java.lang.Class<?> wildcardClass5 = classArray4.getClass();
        java.lang.Class class6 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass5);
        java.util.List list8 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass5);
        java.lang.Class class9 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean10 = org.apache.commons.lang.ClassUtils.isAssignable(class0, class9);
        java.lang.Class class11 = null;
        java.lang.Class[] classArray12 = new java.lang.Class[] { class11 };
        java.lang.Class[] classArray13 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray12);
        java.lang.Class[] classArray14 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray13);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        java.lang.Class class16 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass15);
        java.util.List list17 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass15);
        boolean boolean18 = org.apache.commons.lang.ClassUtils.isAssignable(class9, (java.lang.Class) wildcardClass15);
        java.util.List list19 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnumList(class9);
        boolean boolean20 = org.apache.commons.lang.ClassUtils.isInnerClass(class9);
        org.apache.commons.lang.enums.Enum enum22 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum(class9, 0);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(enum22);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.Class class5 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass4);
        java.util.List list7 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass4);
        java.lang.Class class8 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        java.util.List list9 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass4);
        java.util.Iterator iterator10 = null; // flaky: org.apache.commons.lang.enums.Enum.iterator((java.lang.Class) wildcardClass4);
        org.apache.commons.lang.enums.Enum enum12 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, (int) (byte) 100);
        java.util.Map map13 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnumMap((java.lang.Class) wildcardClass4);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(list9);
// flaky:         org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(enum12);
// flaky:         org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.Class class5 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass4);
        java.util.List list7 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass4);
        java.lang.Class class8 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        java.util.List list9 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass4);
        java.util.Iterator iterator10 = null; // flaky: org.apache.commons.lang.enums.Enum.iterator((java.lang.Class) wildcardClass4);
        org.apache.commons.lang.enums.Enum enum12 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, 6);
        java.lang.String str13 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Class) wildcardClass4);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(list9);
// flaky:         org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(enum12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Class;" + "'", str13, "Class;");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class[] classArray4 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray3);
        java.lang.Class<?> wildcardClass5 = classArray4.getClass();
        java.lang.Class class6 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass5);
        java.util.List list8 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass5);
        java.lang.Class class9 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean10 = org.apache.commons.lang.ClassUtils.isAssignable(class0, class9);
        java.lang.Class class11 = null;
        java.lang.Class[] classArray12 = new java.lang.Class[] { class11 };
        java.lang.Class[] classArray13 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray12);
        java.lang.Class[] classArray14 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray13);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        java.lang.Class class16 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass15);
        java.util.List list17 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass15);
        boolean boolean18 = org.apache.commons.lang.ClassUtils.isAssignable(class9, (java.lang.Class) wildcardClass15);
        java.lang.Class class19 = null;
        java.lang.Class[] classArray20 = new java.lang.Class[] { class19 };
        java.lang.Class[] classArray21 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray20);
        java.lang.Class[] classArray22 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray21);
        java.lang.Class<?> wildcardClass23 = classArray22.getClass();
        java.lang.Class class24 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass23);
        boolean boolean25 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass23);
        java.util.List list26 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass23);
        java.lang.Class class27 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass23);
        boolean boolean28 = org.apache.commons.lang.ClassUtils.isAssignable(class9, class27);
        java.lang.String str29 = org.apache.commons.lang.ClassUtils.getPackageName(class27);
        org.apache.commons.lang.enums.Enum enum31 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum(class27, 34);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[Ljava.lang" + "'", str29, "[Ljava.lang");
        org.junit.Assert.assertNull(enum31);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.lang.NullArgumentException nullArgumentException1 = new org.apache.commons.lang.NullArgumentException("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.apache.commons.lang.NullArgumentException nullArgumentException3 = new org.apache.commons.lang.NullArgumentException("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.apache.commons.lang.NullArgumentException nullArgumentException5 = new org.apache.commons.lang.NullArgumentException("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        nullArgumentException3.addSuppressed((java.lang.Throwable) nullArgumentException5);
        java.lang.Throwable[] throwableArray7 = nullArgumentException3.getSuppressed();
        nullArgumentException1.addSuppressed((java.lang.Throwable) nullArgumentException3);
        java.lang.Class<?> wildcardClass9 = nullArgumentException1.getClass();
        java.lang.Class class10 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum12 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray1, '4');
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray1, "10.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.0");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.Class class9 = null;
        java.lang.Class[] classArray10 = new java.lang.Class[] { class9 };
        java.lang.Class[] classArray11 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray10);
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray10, '4');
        java.lang.String str15 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray10, "10.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.0");
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(classArray1, classArray10);
        java.lang.Class<?> wildcardClass17 = classArray10.getClass();
        java.lang.String str18 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Class) wildcardClass17);
        org.apache.commons.lang.enums.Enum enum20 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass17, (int) (byte) 10);
        org.apache.commons.lang.enums.Enum enum22 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnum((java.lang.Class) wildcardClass17, "hIeaaaaaaaaa");
        java.lang.String str24 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Object) "hIeaaaaaaaaa", "      Hihi");
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[Ljava.lang" + "'", str18, "[Ljava.lang");
        org.junit.Assert.assertNull(enum20);
        org.junit.Assert.assertNull(enum22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang" + "'", str24, "java.lang");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        char[] charArray2 = new char[] { 'a' };
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("0", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        java.lang.Class class5 = null;
        java.lang.Class class6 = null;
        java.lang.Class[] classArray7 = new java.lang.Class[] { class6 };
        java.lang.Class[] classArray8 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray7);
        java.lang.Class[] classArray9 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray8);
        java.lang.Class<?> wildcardClass10 = classArray9.getClass();
        java.lang.Class class11 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass10);
        boolean boolean12 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass10);
        java.util.List list13 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass10);
        java.lang.Class class14 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass10);
        boolean boolean15 = org.apache.commons.lang.ClassUtils.isAssignable(class5, class14);
        java.lang.Class class16 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[] { class16 };
        java.lang.Class[] classArray18 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray17);
        java.lang.Class[] classArray19 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray18);
        java.lang.Class<?> wildcardClass20 = classArray19.getClass();
        java.lang.Class class21 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass20);
        java.util.List list22 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass20);
        boolean boolean23 = org.apache.commons.lang.ClassUtils.isAssignable(class14, (java.lang.Class) wildcardClass20);
        org.apache.commons.lang.enums.Enum enum25 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnum(class14, "NullArgumentException: !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih must not be null...........................................................................................................................................................................................................................................................................................................lang...........................................................................................................................................................................................................................................................................................................commons...........................................................................................................................................................................................................................................................................................................apache...........................................................................................................................................................................................................................................................................................................org");
        java.lang.String str26 = org.apache.commons.lang.ClassUtils.getPackageName(class14);
        java.util.Map map27 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnumMap(class14);
        boolean boolean28 = org.apache.commons.lang.ClassUtils.isAssignable((java.lang.Class) wildcardClass4, class14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum30 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(enum25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[Ljava.lang" + "'", str26, "[Ljava.lang");
// flaky:         org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class[] classArray4 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray3);
        java.lang.Class<?> wildcardClass5 = classArray4.getClass();
        java.lang.Class class6 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass5);
        java.util.List list8 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass5);
        java.lang.Class class9 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass5);
        boolean boolean10 = org.apache.commons.lang.ClassUtils.isAssignable(class0, class9);
        java.lang.Class class11 = null;
        java.lang.Class[] classArray12 = new java.lang.Class[] { class11 };
        java.lang.Class[] classArray13 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray12);
        java.lang.Class[] classArray14 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray13);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        java.lang.Class class16 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass15);
        java.util.List list17 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass15);
        boolean boolean18 = org.apache.commons.lang.ClassUtils.isAssignable(class9, (java.lang.Class) wildcardClass15);
        java.lang.String str19 = org.apache.commons.lang.ClassUtils.getPackageName(class9);
        org.apache.commons.lang.enums.Enum enum21 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum(class9, 0);
        java.util.Map map22 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnumMap(class9);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[Ljava.lang" + "'", str19, "[Ljava.lang");
        org.junit.Assert.assertNull(enum21);
// flaky:         org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.Class class5 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang.ClassUtils.isInnerClass(class5);
        java.util.Iterator iterator7 = null; // flaky: org.apache.commons.lang.enums.Enum.iterator(class5);
        java.util.Iterator iterator8 = null; // flaky: org.apache.commons.lang.enums.Enum.iterator(class5);
        org.apache.commons.lang.enums.Enum enum10 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum(class5, (int) ' ');
        java.lang.String str11 = org.apache.commons.lang.ClassUtils.getPackageName(class5);
        java.lang.String str12 = org.apache.commons.lang.ClassUtils.getShortClassName(class5);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertNotNull(iterator7);
// flaky:         org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(enum10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[Ljava.lang" + "'", str11, "[Ljava.lang");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Class;" + "'", str12, "Class;");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.Class class5 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        java.util.List list6 = org.apache.commons.lang.ClassUtils.getAllSuperclasses(class5);
        org.apache.commons.lang.enums.Enum enum8 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnum(class5, "java.lang");
        java.lang.Class class9 = null;
        java.lang.Class class10 = null;
        java.lang.Class[] classArray11 = new java.lang.Class[] { class10 };
        java.lang.Class[] classArray12 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray11);
        java.lang.Class[] classArray13 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray12);
        java.lang.Class<?> wildcardClass14 = classArray13.getClass();
        java.lang.Class class15 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass14);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass14);
        java.util.List list17 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass14);
        java.lang.Class class18 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass14);
        boolean boolean19 = org.apache.commons.lang.ClassUtils.isAssignable(class9, class18);
        java.lang.Class class20 = null;
        java.lang.Class[] classArray21 = new java.lang.Class[] { class20 };
        java.lang.Class[] classArray22 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray21);
        java.lang.Class[] classArray23 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray22);
        java.lang.Class<?> wildcardClass24 = classArray23.getClass();
        java.lang.Class class25 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass24);
        java.util.List list26 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass24);
        boolean boolean27 = org.apache.commons.lang.ClassUtils.isAssignable(class18, (java.lang.Class) wildcardClass24);
        java.lang.Class class28 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(class18);
        boolean boolean29 = org.apache.commons.lang.ClassUtils.isAssignable(class5, class28);
        java.util.List list30 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnumList(class5);
        java.util.Map map31 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnumMap(class5);
        org.apache.commons.lang.enums.Enum enum33 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum(class5, 2);
        boolean boolean34 = org.apache.commons.lang.ClassUtils.isInnerClass(class5);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(enum8);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky:         org.junit.Assert.assertNotNull(list30);
// flaky:         org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(enum33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("", "HI!");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.Class class4 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass3);
        java.lang.Class class5 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum7 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.Class class5 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        org.apache.commons.lang.enums.Enum enum7 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum(class5, 250);
        java.lang.Class class8 = null;
        boolean boolean9 = org.apache.commons.lang.ClassUtils.isAssignable(class5, class8);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNull(enum7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.String str5 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Class) wildcardClass4);
        java.lang.Class class6 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        java.lang.Class class7 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[] { class7 };
        java.lang.Class[] classArray9 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray8);
        java.lang.Class[] classArray10 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray9);
        java.lang.Class<?> wildcardClass11 = classArray10.getClass();
        java.lang.Class class12 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass11);
        boolean boolean13 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass11);
        java.util.List list14 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass11);
        java.lang.Class class15 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass11);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(class6, (java.lang.Class) wildcardClass11);
        java.lang.Class class17 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[] { class17 };
        java.lang.Class[] classArray19 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray18);
        java.lang.Class[] classArray20 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray19);
        java.lang.Class<?> wildcardClass21 = classArray20.getClass();
        java.lang.Class class22 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass21);
        boolean boolean23 = org.apache.commons.lang.ClassUtils.isAssignable((java.lang.Class) wildcardClass11, (java.lang.Class) wildcardClass21);
        org.apache.commons.lang.enums.Enum enum25 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass21, 17);
        java.lang.Class class27 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[] { class27 };
        java.lang.Class[] classArray29 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray28);
        java.lang.String str31 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray28, '4');
        java.lang.String str33 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray28, "10.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.0");
        java.lang.String str34 = org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[]) classArray28);
        java.lang.String str35 = org.apache.commons.lang.StringUtils.concatenate((java.lang.Object[]) classArray28);
        java.lang.Class[] classArray36 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method37 = org.apache.commons.lang.ClassUtils.getPublicMethod((java.lang.Class) wildcardClass21, "ble;aThrow", classArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: [Ljava.lang.Class;.ble;aThrow(null)");
        } catch (java.lang.NoSuchMethodException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Class;" + "'", str5, "Class;");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(enum25);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(classArray36);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("java.lang ", "", (int) ' ');
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("ORG.APACHEACHE.COMMONS.LANG.NULLRGUMENTEXCEPTION:!IH!IH!", strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum8 = org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Class must be a subclass of Enum");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.Class[] classArray3 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray2);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        java.lang.String str5 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Class) wildcardClass4);
        java.lang.Class class6 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass4);
        java.lang.Class class7 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[] { class7 };
        java.lang.Class[] classArray9 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray8);
        java.lang.Class[] classArray10 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray9);
        java.lang.Class<?> wildcardClass11 = classArray10.getClass();
        java.lang.Class class12 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass11);
        boolean boolean13 = org.apache.commons.lang.ClassUtils.isInnerClass((java.lang.Class) wildcardClass11);
        java.util.List list14 = org.apache.commons.lang.ClassUtils.getAllInterfaces((java.lang.Class) wildcardClass11);
        java.lang.Class class15 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass11);
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(class6, (java.lang.Class) wildcardClass11);
        java.lang.Class class17 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[] { class17 };
        java.lang.Class[] classArray19 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray18);
        java.lang.Class[] classArray20 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray19);
        java.lang.Class<?> wildcardClass21 = classArray20.getClass();
        java.lang.Class class22 = org.apache.commons.lang.ClassUtils.primitiveToWrapper((java.lang.Class) wildcardClass21);
        boolean boolean23 = org.apache.commons.lang.ClassUtils.isAssignable((java.lang.Class) wildcardClass11, (java.lang.Class) wildcardClass21);
        org.apache.commons.lang.enums.Enum enum25 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass21, 17);
        java.lang.String str26 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Class) wildcardClass21);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Class;" + "'", str5, "Class;");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(enum25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[Ljava.lang" + "'", str26, "[Ljava.lang");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        java.lang.Class[] classArray2 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray1);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray1, '4');
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray1, "10.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.0");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.Class class9 = null;
        java.lang.Class[] classArray10 = new java.lang.Class[] { class9 };
        java.lang.Class[] classArray11 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray10);
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray10, '4');
        java.lang.String str15 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray10, "10.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.0");
        boolean boolean16 = org.apache.commons.lang.ClassUtils.isAssignable(classArray1, classArray10);
        java.lang.Class<?> wildcardClass17 = classArray10.getClass();
        java.lang.String str18 = org.apache.commons.lang.ClassUtils.getPackageName((java.lang.Class) wildcardClass17);
        org.apache.commons.lang.enums.Enum enum20 = null; // flaky: org.apache.commons.lang.enums.ValuedEnum.getEnum((java.lang.Class) wildcardClass17, (int) (byte) 10);
        java.lang.Class class21 = null;
        java.lang.Class[] classArray22 = new java.lang.Class[] { class21 };
        java.lang.Class[] classArray23 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray22);
        java.lang.String str25 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray22, '4');
        java.lang.String str27 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray22, "10.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.0");
        java.lang.String str29 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray22, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.Class class30 = null;
        java.lang.Class[] classArray31 = new java.lang.Class[] { class30 };
        java.lang.Class[] classArray32 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(classArray31);
        java.lang.String str34 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray31, '4');
        java.lang.String str36 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) classArray31, "10.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.0");
        boolean boolean37 = org.apache.commons.lang.ClassUtils.isAssignable(classArray22, classArray31);
        java.lang.Class<?> wildcardClass38 = classArray31.getClass();
        org.apache.commons.lang.enums.Enum enum40 = null; // flaky: org.apache.commons.lang.enums.Enum.getEnum((java.lang.Class) wildcardClass38, "...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i..");
        boolean boolean41 = org.apache.commons.lang.ClassUtils.isAssignable((java.lang.Class) wildcardClass17, (java.lang.Class) wildcardClass38);
        java.lang.String str42 = org.apache.commons.lang.ClassUtils.getShortClassName((java.lang.Class) wildcardClass38);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[Ljava.lang" + "'", str18, "[Ljava.lang");
        org.junit.Assert.assertNull(enum20);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(enum40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Class;" + "'", str42, "Class;");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.enums.Enum enum2 = org.apache.commons.lang.enums.ValuedEnum.getEnum(class0, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Enum Class must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}
