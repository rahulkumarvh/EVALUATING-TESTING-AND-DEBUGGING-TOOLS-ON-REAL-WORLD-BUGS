import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestKHEAPSORTBuggy1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0501");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0502");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0503");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0504");
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0505");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intList3.getClass();
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0506");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0507");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) '#');
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
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0508");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 10);
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0509");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0510");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0511");
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
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 1);
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0512");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) -1);
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0513");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) '#');
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
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0514");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0515");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0516");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 10);
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0517");
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
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0518");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) '4');
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0519");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0520");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.lang.Class<?> wildcardClass13 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0521");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) -1);
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0522");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0523");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0524");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 100);
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
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0525");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0526");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.lang.Class<?> wildcardClass13 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0527");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.lang.Class<?> wildcardClass15 = intList3.getClass();
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0528");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0529");
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0530");
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
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (-1));
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0531");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) '#');
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
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0532");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (-1));
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0533");
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
        java.lang.Class<?> wildcardClass23 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0534");
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0535");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 10);
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0536");
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0537");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 10);
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0538");
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
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0539");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0540");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 10);
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0541");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 100);
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0542");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 100);
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0543");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList10, (int) ' ');
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0544");
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0545");
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0546");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 10);
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
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0547");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 10);
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0548");
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0549");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0550");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0551");
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
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (-1));
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
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0552");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0553");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList2 = java_programs.KHEAPSORT.kheapsort(intList0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0554");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 100);
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
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0555");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) -1);
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0556");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList2, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = java_programs.KHEAPSORT.kheapsort(intList2, (int) 'a');
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
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0557");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 100);
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0558");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 10);
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0559");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 10);
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0560");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) '4');
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0561");
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0562");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0563");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, 10);
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0564");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) '#');
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
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0565");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0566");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0567");
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0568");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 100);
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0569");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0570");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0571");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) 'a');
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
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0572");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) '#');
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
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0573");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0574");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 10);
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0575");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 100);
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0576");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) ' ');
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
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0577");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 10);
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0578");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList7, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0579");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0580");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 100);
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0581");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0582");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0583");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) 'a');
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
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0584");
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0585");
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0586");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) '#');
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0587");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.lang.Class<?> wildcardClass8 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0588");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0589");
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0590");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0591");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0592");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0593");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 10);
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0594");
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
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (-1));
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
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0595");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 100);
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0596");
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0597");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
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
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0598");
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
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) '#');
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0599");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0600");
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0601");
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0602");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
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
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0603");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 100);
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0604");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0605");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 100);
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0606");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList14, (int) 'a');
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
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0607");
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0608");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
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
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0609");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) -1);
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0610");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0611");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) ' ');
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0612");
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0613");
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
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0614");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0615");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0616");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) 'a');
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
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0617");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 10);
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0618");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) -1);
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0619");
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
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0620");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 100);
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
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0621");
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
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0622");
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0623");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList2, 1);
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0624");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 10);
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
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0625");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 100);
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0626");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 10);
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
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0627");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, 100);
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0628");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList2 = java_programs.KHEAPSORT.kheapsort(intList0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0629");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) -1);
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0630");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0631");
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0632");
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0633");
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0634");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 100);
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
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0635");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0636");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.lang.Class<?> wildcardClass17 = intList10.getClass();
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0637");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0638");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 100);
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0639");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) '#');
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
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0640");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 10);
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0641");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) '#');
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0642");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 10);
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0643");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) '4');
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0644");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) 'a');
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0645");
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0646");
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0647");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0648");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0649");
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0650");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0651");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intList10.getClass();
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0652");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0653");
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
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) -1);
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0654");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0655");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0656");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList2 = java_programs.KHEAPSORT.kheapsort(intList0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0657");
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
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0658");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
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
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0659");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 10);
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0660");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intList14.getClass();
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0661");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) 'a');
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
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0662");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) '#');
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0663");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0664");
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0665");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 100);
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
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0666");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList9, (int) (short) 0);
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0667");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) 'a');
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
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0668");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) -1);
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0669");
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0670");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0671");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 100);
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0672");
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
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0673");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) ' ');
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
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0674");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0675");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0676");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 10);
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0677");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0678");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList12, (int) ' ');
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0679");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0680");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intList10.getClass();
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
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0681");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 100);
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
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0682");
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0683");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 10);
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0684");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0685");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) 'a');
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
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0686");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 100);
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
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0687");
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0688");
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0689");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (-1));
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0690");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 10);
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
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0691");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
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
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0692");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0693");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0694");
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
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList20, (int) ' ');
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0695");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) ' ');
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0696");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, (int) 'a');
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0697");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 10);
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
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0698");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 1);
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
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0699");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0700");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 100);
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
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0701");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) ' ');
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
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0702");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
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
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0703");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0704");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 10);
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0705");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0706");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) ' ');
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0707");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0708");
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0709");
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
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0710");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 100);
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0711");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0712");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intList10.getClass();
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0713");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 100);
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0714");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList7, 1);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0715");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0716");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 100);
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0717");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 100);
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0718");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0719");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0720");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
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
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0721");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList6, (int) ' ');
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
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0722");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0723");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intList14.getClass();
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0724");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) -1);
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0725");
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
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) 'a');
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
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0726");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0727");
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0728");
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
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) 10);
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0729");
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0730");
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
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0731");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 10);
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0732");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 10);
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0733");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) '#');
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0734");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0735");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0736");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 100);
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0737");
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0738");
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
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) '#');
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0739");
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0740");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intList8.getClass();
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0741");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (int) 'a');
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0742");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0743");
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0744");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intList14.getClass();
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
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0745");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) ' ');
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
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0746");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, 100);
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0747");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 100);
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0748");
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0749");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 10);
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
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0750");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) ' ');
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
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0751");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) '4');
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0752");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.lang.Class<?> wildcardClass11 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0753");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0754");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0755");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0756");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) 'a');
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
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0757");
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
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0758");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0759");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) 'a');
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0760");
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0761");
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0762");
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0763");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0764");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) '4');
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
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0765");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) -1);
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0766");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 100);
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0767");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) -1);
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0768");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList12, (int) '4');
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0769");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0770");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (-1));
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0771");
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
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 100);
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0772");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0773");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) -1);
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0774");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) -1);
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
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0775");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) '#');
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
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0776");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (-1));
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0777");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) '#');
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
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0778");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) -1);
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0779");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) ' ');
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0780");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) 'a');
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
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0781");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 100);
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0782");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0783");
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0784");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, (int) '4');
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0785");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 10);
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0786");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList2, 1);
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0787");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 100);
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0788");
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0789");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 100);
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
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0790");
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
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) '#');
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
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0791");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) ' ');
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
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0792");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList3, (-1));
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0793");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0794");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.lang.Class<?> wildcardClass9 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0795");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 100);
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
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0796");
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
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0797");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 10);
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
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0798");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0799");
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0800");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 100);
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
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0801");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0802");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 100);
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0803");
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0804");
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0805");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0806");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0807");
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
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0808");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
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
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0809");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.lang.Class<?> wildcardClass13 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0810");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList22, 100);
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0811");
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0812");
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0813");
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0814");
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
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0815");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 10);
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0816");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0817");
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0818");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0819");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0820");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) 'a');
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0821");
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
        java.lang.Class<?> wildcardClass19 = intList12.getClass();
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
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0822");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
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
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0823");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) -1);
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0824");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) -1);
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
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0825");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0826");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0827");
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
        java.lang.Class<?> wildcardClass21 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0828");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (short) 1);
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0829");
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0830");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 10);
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0831");
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
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0832");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) -1);
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0833");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList7, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0834");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 10);
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0835");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, 10);
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
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0836");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 100);
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0837");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) -1);
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
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0838");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0839");
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0840");
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
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 10);
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0841");
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
        java.lang.Class<?> wildcardClass25 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0842");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0843");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0844");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 100);
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0845");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0846");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (byte) 0);
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0847");
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0848");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0849");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
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
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0850");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList2, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) -1);
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0851");
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0852");
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0853");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0854");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0855");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0856");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0857");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 100);
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0858");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0859");
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0860");
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0861");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0862");
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0863");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, (-1));
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
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0864");
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0865");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 100);
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0866");
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0867");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
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
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0868");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList18, (-1));
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0869");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) -1);
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0870");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intList10.getClass();
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
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0871");
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
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0872");
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
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0873");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) ' ');
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
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0874");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0875");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0876");
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0877");
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0878");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 10);
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0879");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0880");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0881");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0882");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (short) 0);
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0883");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
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
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0884");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
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
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0885");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 0);
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0886");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0887");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList7, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0888");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 100);
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0889");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, 100);
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0890");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.KHEAPSORT.kheapsort(intList2, 0);
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.KHEAPSORT.kheapsort(intList2, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.KHEAPSORT.kheapsort(intList9, (int) (short) 0);
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0891");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0892");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList16, (-1));
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
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0893");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) ' ');
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0894");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
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
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0895");
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0896");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 1);
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0897");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
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
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0898");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0899");
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0900");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0901");
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0902");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0903");
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0904");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0905");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0906");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList22, (int) (byte) 10);
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0907");
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0908");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
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
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0909");
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0910");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 100);
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
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0911");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 100);
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0912");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0913");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0914");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList14, 100);
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0915");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) '4');
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
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0916");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intList10.getClass();
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0917");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) '#');
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
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0918");
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
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList16, 1);
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0919");
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0920");
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
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) '#');
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
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0921");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) -1);
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0922");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0923");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 0);
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0924");
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
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0925");
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0926");
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
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0927");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0928");
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
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0929");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0930");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) ' ');
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
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0931");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (byte) 0);
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0932");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0933");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) '#');
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
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0934");
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0935");
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0936");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 10);
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
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0937");
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
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0938");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, 10);
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0939");
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0940");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (-1));
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0941");
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0942");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.lang.Class<?> wildcardClass13 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0943");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList6, (int) ' ');
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0944");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) ' ');
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0945");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0946");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0947");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) ' ');
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
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0948");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0949");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0950");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (short) 1);
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
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0951");
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0952");
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0953");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 100);
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0954");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
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
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0955");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 0);
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
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0956");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList26 = java_programs.KHEAPSORT.kheapsort(intList24, 100);
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0957");
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0958");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0959");
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0960");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0961");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0962");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) '4');
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0963");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList8, (int) '4');
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0964");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList16, (int) (byte) -1);
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0965");
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
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0966");
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
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0967");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        java.lang.Class<?> wildcardClass15 = intList8.getClass();
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0968");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (short) 0);
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0969");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList6, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList6, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, (int) (byte) 10);
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0970");
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0971");
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0972");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList14, 100);
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0973");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList10, (int) ' ');
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0974");
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
        java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 1);
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0975");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList5, 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0976");
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
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0977");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList20 = java_programs.KHEAPSORT.kheapsort(intList18, (int) '4');
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0978");
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0979");
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
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList12, 10);
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0980");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0981");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0982");
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0983");
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0984");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList12, 100);
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0985");
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0986");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) -1);
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0987");
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
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0988");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 100);
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
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0989");
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0990");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, 1);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0991");
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
        java.lang.Class<?> wildcardClass19 = intList10.getClass();
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0992");
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0993");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) -1);
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0994");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList6, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0995");
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
        java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList24 = java_programs.KHEAPSORT.kheapsort(intList20, (int) (short) 1);
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0996");
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0997");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList22 = java_programs.KHEAPSORT.kheapsort(intList18, (int) (short) 100);
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0998");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList8, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList8, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList8, (int) (short) 100);
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test0999");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList18 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 10);
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestKHEAPSORTBuggy1.test1000");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 1, 0 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.KHEAPSORT.kheapsort(intList3, 1);
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (byte) 0);
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.KHEAPSORT.kheapsort(intList3, (int) (short) 0);
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList14 = java_programs.KHEAPSORT.kheapsort(intList10, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList16 = java_programs.KHEAPSORT.kheapsort(intList14, (int) (byte) 0);
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
}

