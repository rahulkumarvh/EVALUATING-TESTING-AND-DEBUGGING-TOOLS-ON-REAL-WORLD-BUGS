import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestKHEAPSORTBuggy19 {

    public static boolean debug = false;

    @Test
    public void test9501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9501");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9502");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9503");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9504");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList34 = java_programs.KHEAPSORT.kheapsort(intList32, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList36 = java_programs.KHEAPSORT.kheapsort(intList34, (int) (short) 0);
        java.lang.Class<?> wildcardClass37 = intList36.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertNotNull(intList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test9505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9505");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9506");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test9507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9507");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9508");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9509");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9510");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9511");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9512");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9513");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9514");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9515");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9516");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test9517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9517");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test9518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9518");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        java.lang.Class<?> wildcardClass29 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9519");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9520");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9521");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test9522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9522");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9523");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.lang.Class<?> wildcardClass21 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9524");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9525");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9526");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.lang.Class<?> wildcardClass27 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9527");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9528");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList34 = java_programs.KHEAPSORT.kheapsort(intList30, 0);
        java.util.ArrayList<java.lang.Integer> intList36 = java_programs.KHEAPSORT.kheapsort(intList34, (int) (short) 1);
        java.lang.Class<?> wildcardClass37 = intList36.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertNotNull(intList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test9529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9529");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9530");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.lang.Class<?> wildcardClass27 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9531");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.lang.Class<?> wildcardClass27 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9532");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList9, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.KHEAPSORT.kheapsort(intList11, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.KHEAPSORT.kheapsort(intList11, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.KHEAPSORT.kheapsort(intList11, 0);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9533");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9534");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9535");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9536");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test9537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9537");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test9538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9538");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.lang.Class<?> wildcardClass29 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9539");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.KHEAPSORT.kheapsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.KHEAPSORT.kheapsort(intList9, 0);
        java.util.ArrayList<java.lang.Integer> intList17 = java_programs.KHEAPSORT.kheapsort(intList15, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList19 = java_programs.KHEAPSORT.kheapsort(intList17, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList21 = java_programs.KHEAPSORT.kheapsort(intList17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList19);
    }

    @Test
    public void test9540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9540");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test9541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9541");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9542");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9543");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.lang.Class<?> wildcardClass23 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9544");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9545");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9546");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9547");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test9548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9548");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9549");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9550");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.lang.Class<?> wildcardClass25 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9551");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9552");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test9553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9553");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9554");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9555");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9556");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.lang.Class<?> wildcardClass29 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9557");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9558");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList34 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
    }

    @Test
    public void test9559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9559");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9560");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9561");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9562");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9563");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9564");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9565");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9566");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9567");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9568");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9569");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList6, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9570");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9571");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, 0);
        java.util.ArrayList<java.lang.Integer> intList34 = java_programs.KHEAPSORT.kheapsort(intList32, (int) (short) 0);
        java.lang.Class<?> wildcardClass35 = intList32.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test9572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9572");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9573");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test9574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9574");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9575");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9576");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9577");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9578");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = intList32.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test9579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9579");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList26, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test9580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9580");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.KHEAPSORT.kheapsort(intList11, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList15 = java_programs.KHEAPSORT.kheapsort(intList13, 0);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9581");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9582");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = intList32.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test9583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9583");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test9584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9584");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9585");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9586");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9587");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9588");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9589");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList28, 0);
        java.util.ArrayList<java.lang.Integer> intList34 = java_programs.KHEAPSORT.kheapsort(intList32, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList36 = java_programs.KHEAPSORT.kheapsort(intList34, 1);
        java.lang.Class<?> wildcardClass37 = intList34.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertNotNull(intList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test9590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9590");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9591");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9592");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.lang.Class<?> wildcardClass27 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9593");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9594");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9595");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9596");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9597");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9598");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9599");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9600");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9601");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList7, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test9602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9602");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9603");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9604");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9605");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9606");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9607");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9608");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9609");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9610");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9611");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.lang.Class<?> wildcardClass31 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test9612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9612");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9613");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9614");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9615");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9616");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9617");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9618");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.lang.Class<?> wildcardClass29 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9619");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test9620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9620");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test9621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9621");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9622");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9623");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9624");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9625");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9626");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9627");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9628");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9629");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.lang.Class<?> wildcardClass19 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9630");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9631");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9632");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9633");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9634");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9635");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9636");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9637");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9638");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9639");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9640");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9641");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9642");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.lang.Class<?> wildcardClass25 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9643");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9644");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.lang.Class<?> wildcardClass25 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9645");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9646");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.lang.Class<?> wildcardClass27 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9647");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9648");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9649");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9650");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9651");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9652");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9653");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.lang.Class<?> wildcardClass21 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9654");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9655");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test9656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9656");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9657");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9658");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9659");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9660");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9661");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9662");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9663");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9664");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList34 = java_programs.KHEAPSORT.kheapsort(intList32, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList36 = java_programs.KHEAPSORT.kheapsort(intList34, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertNotNull(intList36);
    }

    @Test
    public void test9665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9665");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9666");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9667");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9668");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test9669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9669");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9670");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9671");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test9672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9672");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9673");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9674");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9675");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, 1);
        java.lang.Class<?> wildcardClass33 = intList32.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test9676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9676");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9677");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test9678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9678");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9679");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9680");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.lang.Class<?> wildcardClass31 = intList30.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test9681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9681");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9682");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9683");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9684");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9685");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9686");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9687");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9688");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList9, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.KHEAPSORT.kheapsort(intList9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = java_programs.KHEAPSORT.kheapsort(intList13, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test9689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9689");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9690");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.KHEAPSORT.kheapsort(intList9, 0);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test9691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9691");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9692");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9693");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9694");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9695");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9696");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9697");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9698");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9699");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9700");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList28, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test9701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9701");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9702");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9703");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9704");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9705");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test9706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9706");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = java_programs.KHEAPSORT.kheapsort(intList11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test9707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9707");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9708");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9709");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9710");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9711");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9712");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9713");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, 1);
        java.lang.Class<?> wildcardClass33 = intList30.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test9714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9714");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test9715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9715");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9716");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9717");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9718");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList24, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9719");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9720");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9721");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9722");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9723");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9724");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9725");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9726");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9727");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9728");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9729");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9730");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9731");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, 1);
        java.util.ArrayList<java.lang.Integer> intList34 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (byte) 1);
        java.lang.Class<?> wildcardClass35 = intList34.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test9732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9732");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9733");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, 0);
        java.lang.Class<?> wildcardClass31 = intList30.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test9734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9734");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9735");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList34 = java_programs.KHEAPSORT.kheapsort(intList32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test9736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9736");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test9737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9737");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = intList32.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test9738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9738");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9739");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.lang.Class<?> wildcardClass23 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9740");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9741");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test9742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9742");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9743");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9744");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList34 = java_programs.KHEAPSORT.kheapsort(intList32, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList36 = java_programs.KHEAPSORT.kheapsort(intList32, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList38 = java_programs.KHEAPSORT.kheapsort(intList36, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertNotNull(intList36);
    }

    @Test
    public void test9745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9745");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9746");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test9747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9747");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.lang.Class<?> wildcardClass25 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9748");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9749");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9750");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9751");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9752");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9753");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9754");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9755");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9756");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9757");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9758");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test9759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9759");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9760");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9761");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9762");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9763");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9764");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9765");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9766");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9767");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9768");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9769");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9770");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9771");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9772");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9773");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test9774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9774");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9775");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9776");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9777");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9778");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = intList30.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test9779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9779");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9780");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9781");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, 1);
        java.lang.Class<?> wildcardClass31 = intList30.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test9782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9782");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9783");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9784");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9785");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9786");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9787");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9788");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9789");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9790");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList28, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test9791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9791");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9792");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test9793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9793");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9794");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9795");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.lang.Class<?> wildcardClass33 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test9796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9796");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9797");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9798");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9799");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9800");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9801");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test9802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9802");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9803");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9804");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9805");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9806");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9807");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9808");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9809");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9810");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9811");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test9812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9812");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9813");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9814");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9815");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9816");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9817");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9818");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.lang.Class<?> wildcardClass25 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9819");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9820");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9821");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.lang.Class<?> wildcardClass25 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9822");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.lang.Class<?> wildcardClass23 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9823");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9824");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList34 = java_programs.KHEAPSORT.kheapsort(intList24, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test9825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9825");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9826");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9827");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9828");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9829");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9830");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9831");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9832");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9833");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9834");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList34 = java_programs.KHEAPSORT.kheapsort(intList32, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList36 = java_programs.KHEAPSORT.kheapsort(intList34, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
    }

    @Test
    public void test9835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9835");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9836");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9837");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9838");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.KHEAPSORT.kheapsort(intList11, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = java_programs.KHEAPSORT.kheapsort(intList11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test9839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9839");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9840");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9841");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9842");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9843");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9844");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, 0);
        java.lang.Class<?> wildcardClass31 = intList30.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test9845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9845");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9846");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9847");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9848");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9849");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9850");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intList24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test9851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9851");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test9852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9852");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList9, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList13 = java_programs.KHEAPSORT.kheapsort(intList9, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test9853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9853");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9854");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9855");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9856");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9857");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9858");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9859");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9860");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9861");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test9862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9862");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9863");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test9864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9864");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9865");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intList20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9866");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = intList26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9867");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test9868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9868");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9869");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9870");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9871");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test9872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9872");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9873");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9874");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test9875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9875");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9876");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test9877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9877");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        java.lang.Class<?> wildcardClass19 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9878");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test9879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9879");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test9880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9880");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test9881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9881");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.lang.Class<?> wildcardClass31 = intList22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test9882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9882");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList22, 0);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9883");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList30, (int) (short) 1);
        java.lang.Class<?> wildcardClass33 = intList30.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test9884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9884");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intList18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9885");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList26, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList26, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList32 = java_programs.KHEAPSORT.kheapsort(intList26, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test9886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9886");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test9887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9887");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test9888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9888");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test9889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9889");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test9890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9890");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList24, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList30 = java_programs.KHEAPSORT.kheapsort(intList28, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test9891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9891");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList28 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test9892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy19.test9892");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, 1);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }
}

