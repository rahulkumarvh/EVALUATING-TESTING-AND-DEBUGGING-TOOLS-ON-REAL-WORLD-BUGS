import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestBUCKETSORTPatched17 {

    public static boolean debug = false;

    @Test
    public void test8501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8501");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 100);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 100);
        java.lang.Class<?> wildcardClass28 = intList27.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8502");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8503");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8504");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8505");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intList2.getClass();
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
    public void test8506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8506");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
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
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test8507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8507");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 10);
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
    public void test8508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8508");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) 'a');
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test8509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8509");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 1);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, 100);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList25, 10);
        java.util.ArrayList<java.lang.Integer> intList31 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList33 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) ' ');
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
    }

    @Test
    public void test8510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8510");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intList5.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8511");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, 10);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intList19.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8512");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test8513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8513");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 100);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 1);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 100);
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 10);
        java.lang.Class<?> wildcardClass30 = intList29.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8514");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test8515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8515");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 10);
        java.lang.Class<?> wildcardClass24 = intList21.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8516");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, 10);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = intList21.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8517");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test8518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8518");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test8519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8519");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test8520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8520");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test8521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8521");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intList19.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8522");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList31 = correct_java_programs.BUCKETSORT.bucketsort(intList29, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList33 = correct_java_programs.BUCKETSORT.bucketsort(intList29, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList35 = correct_java_programs.BUCKETSORT.bucketsort(intList33, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList37 = correct_java_programs.BUCKETSORT.bucketsort(intList35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertNotNull(intList35);
    }

    @Test
    public void test8523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8523");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
    }

    @Test
    public void test8524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8524");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test8525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8525");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    }

    @Test
    public void test8526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8526");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 1);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList27, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList31 = correct_java_programs.BUCKETSORT.bucketsort(intList27, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList33 = correct_java_programs.BUCKETSORT.bucketsort(intList31, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
    }

    @Test
    public void test8527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8527");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList13, 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test8528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8528");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test8529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8529");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList13, 1);
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
    public void test8530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8530");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test8531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8531");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test8532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8532");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test8533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8533");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 1);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) ' ');
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test8534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8534");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test8535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8535");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
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
    public void test8536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8536");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 10);
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
    public void test8537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8537");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 1);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 10);
        java.lang.Class<?> wildcardClass26 = intList19.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8538");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
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
    public void test8539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8539");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test8540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8540");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 10);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = intList25.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8541");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 10);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) 'a');
        java.lang.Class<?> wildcardClass22 = intList21.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8542");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = intList19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8543");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, 1);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) '#');
        java.lang.Class<?> wildcardClass30 = intList29.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8544");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, 100);
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
    public void test8545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8545");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test8546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8546");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test8547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8547");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 1);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) ' ');
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test8548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8548");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
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
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test8549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8549");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = intList29.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8550");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 100);
        java.lang.Class<?> wildcardClass20 = intList19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8551");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test8552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8552");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    }

    @Test
    public void test8553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8553");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test8554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8554");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
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
    public void test8555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8555");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, 100);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test8556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8556");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList31 = correct_java_programs.BUCKETSORT.bucketsort(intList29, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList33 = correct_java_programs.BUCKETSORT.bucketsort(intList31, 1);
        java.util.ArrayList<java.lang.Integer> intList35 = correct_java_programs.BUCKETSORT.bucketsort(intList33, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList37 = correct_java_programs.BUCKETSORT.bucketsort(intList35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertNotNull(intList35);
    }

    @Test
    public void test8557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8557");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '4');
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
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test8558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8558");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intList21.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8559");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
    }

    @Test
    public void test8560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8560");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, 100);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList27, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList31 = correct_java_programs.BUCKETSORT.bucketsort(intList29, (int) ' ');
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
    }

    @Test
    public void test8561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8561");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test8562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8562");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = intList19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8563");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test8564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8564");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) 'a');
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test8565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8565");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList27, (int) (short) 10);
        java.lang.Class<?> wildcardClass30 = intList29.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8566");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test8567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8567");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) ' ');
        java.lang.Class<?> wildcardClass20 = intList13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8568");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test8569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8569");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList27, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test8570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8570");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 100);
        java.lang.Class<?> wildcardClass20 = intList19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8571");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList13, 1);
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
    public void test8572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8572");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, 100);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) 'a');
        java.lang.Class<?> wildcardClass28 = intList27.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8573");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 1);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 100);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList27, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
    }

    @Test
    public void test8574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8574");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.lang.Class<?> wildcardClass22 = intList21.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8575");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList27, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList31 = correct_java_programs.BUCKETSORT.bucketsort(intList29, 10);
        java.lang.Class<?> wildcardClass32 = intList31.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test8576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8576");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList25, 100);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test8577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8577");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 10);
        java.lang.Class<?> wildcardClass26 = intList23.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8578");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 1);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, 100);
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList29 = correct_java_programs.BUCKETSORT.bucketsort(intList25, 10);
        java.util.ArrayList<java.lang.Integer> intList31 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList33 = correct_java_programs.BUCKETSORT.bucketsort(intList25, 10);
        java.util.ArrayList<java.lang.Integer> intList35 = correct_java_programs.BUCKETSORT.bucketsort(intList25, (int) '#');
        java.lang.Class<?> wildcardClass36 = intList25.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(intList29);
        org.junit.Assert.assertNotNull(intList31);
        org.junit.Assert.assertNotNull(intList33);
        org.junit.Assert.assertNotNull(intList35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test8579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8579");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intList23.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8580");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 1);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
    }

    @Test
    public void test8581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8581");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
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
    public void test8582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8582");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList17);
    }

    @Test
    public void test8583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8583");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
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
        org.junit.Assert.assertNotNull(intList21);
    }

    @Test
    public void test8584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8584");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test8585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8585");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
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
    public void test8586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8586");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList19, 10);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
    }

    @Test
    public void test8587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8587");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test8588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8588");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, 10);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList19, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
    }

    @Test
    public void test8589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8589");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = intList19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8590");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList15);
    }

    @Test
    public void test8591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8591");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = intList15.getClass();
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
    public void test8592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8592");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, 100);
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
    public void test8593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestBUCKETSORTPatched17.test8593");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 10);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, 1);
        java.util.ArrayList<java.lang.Integer> intList25 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList27 = correct_java_programs.BUCKETSORT.bucketsort(intList23, (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = intList27.getClass();
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
        org.junit.Assert.assertNotNull(intList21);
        org.junit.Assert.assertNotNull(intList23);
        org.junit.Assert.assertNotNull(intList25);
        org.junit.Assert.assertNotNull(intList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }
}

