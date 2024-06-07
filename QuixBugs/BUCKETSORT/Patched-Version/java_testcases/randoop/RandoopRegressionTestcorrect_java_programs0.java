import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTestcorrect_java_programs0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test001");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test003");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test004");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 10, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test005");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test006");
        correct_java_programs.BUCKETSORT bUCKETSORT0 = new correct_java_programs.BUCKETSORT();
        java.lang.Class<?> wildcardClass1 = bUCKETSORT0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test007");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 1, 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test008");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 1, 1, 0, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test009");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 0, 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.BUCKETSORT.bucketsort(intList3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test010");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.lang.Class<?> wildcardClass6 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test011");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.lang.Class<?> wildcardClass6 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test012");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test013");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test014");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test015");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test016");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.lang.Class<?> wildcardClass6 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test017");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test018");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test019");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.lang.Class<?> wildcardClass6 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test020");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.lang.Class<?> wildcardClass8 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test021");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test022");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test023");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test024");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.lang.Class<?> wildcardClass8 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test025");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test026");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1), 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.BUCKETSORT.bucketsort(intList3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test027");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test028");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.lang.Class<?> wildcardClass8 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test029");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test030");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test031");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test032");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test033");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test034");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test035");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test036");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) -1);
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
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test037");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test038");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test039");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test040");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test041");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test042");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test043");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test044");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test045");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test046");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test047");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test048");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) -1);
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
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test049");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.lang.Class<?> wildcardClass8 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test050");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test051");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 0);
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
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test052");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 10, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test053");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test054");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test055");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.BUCKETSORT.bucketsort(intList0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test056");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
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
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test057");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test058");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test059");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) -1);
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test060");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test061");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test062");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test063");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test064");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test065");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test066");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test067");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test068");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test069");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.lang.Class<?> wildcardClass8 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test070");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test071");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test072");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
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
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test073");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test074");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test075");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test076");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test077");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test078");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test079");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test080");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test081");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test082");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test083");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test084");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test085");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test086");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test087");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test088");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.lang.Class<?> wildcardClass12 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test089");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test090");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
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
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test091");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test092");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test093");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.BUCKETSORT.bucketsort(intList0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test094");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test095");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test096");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test097");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test098");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) -1);
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test099");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test100");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 0);
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test101");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test102");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test103");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test104");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test105");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 0);
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
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test106");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 0);
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
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test107");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test108");
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
        java.lang.Class<?> wildcardClass18 = intList7.getClass();
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test109");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test110");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test111");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test112");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
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
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test113");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test114");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.BUCKETSORT.bucketsort(intList0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test115");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test116");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test117");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.lang.Class<?> wildcardClass16 = intList5.getClass();
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test118");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test119");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test120");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) -1);
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test121");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test122");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test123");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (-1));
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test124");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test125");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
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
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test126");
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
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test127");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test128");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
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
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test129");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test130");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test131");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
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
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test132");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test133");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.BUCKETSORT.bucketsort(intList0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test134");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test135");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 0);
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
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test136");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) -1);
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
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test137");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test138");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (-1));
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test139");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.lang.Class<?> wildcardClass14 = intList5.getClass();
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test140");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
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
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test141");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test142");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test143");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 0);
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
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test144");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 100);
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
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test145");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (-1));
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
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test146");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.BUCKETSORT.bucketsort(intList0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test147");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test148");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test149");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test150");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test151");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test152");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test153");
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
        java.lang.Class<?> wildcardClass18 = intList5.getClass();
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test154");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 0);
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
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test155");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 0);
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
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test156");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intList11.getClass();
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test157");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.lang.Class<?> wildcardClass10 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test158");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
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
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test159");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test160");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test161");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test162");
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
        java.lang.Class<?> wildcardClass20 = intList7.getClass();
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test163");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 0);
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
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test164");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 0);
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
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test165");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (-1));
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
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test166");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test167");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.BUCKETSORT.bucketsort(intList0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test168");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) ' ');
        java.lang.Class<?> wildcardClass12 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test169");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test170");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
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
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test171");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test172");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test173");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) '4');
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
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
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test174");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test175");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test176");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test177");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test178");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.lang.Class<?> wildcardClass12 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test179");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList15, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test180");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test181");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test182");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (-1));
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test183");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test184");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
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
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test185");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 10);
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
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test186");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) -1);
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
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test187");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test188");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, (int) (short) -1);
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
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test189");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test190");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test191");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (-1));
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test192");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (byte) -1);
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
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test193");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) ' ');
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
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
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test194");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) '4');
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test195");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList15, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList19 = correct_java_programs.BUCKETSORT.bucketsort(intList17, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test196");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 1);
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test197");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
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
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test198");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test199");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
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
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test200");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
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
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test201");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test202");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
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
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test203");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test204");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test205");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
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
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test206");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 0);
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
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test207");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 10);
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test208");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
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
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test209");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test210");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
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
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test211");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test212");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test213");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test214");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test215");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intList5.getClass();
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
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test216");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 0);
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
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test217");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 100);
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
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test218");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 0);
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
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test219");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.lang.Class<?> wildcardClass14 = intList5.getClass();
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test220");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 0);
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
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test221");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) -1);
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
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test222");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 10);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 100);
        java.lang.Class<?> wildcardClass18 = intList11.getClass();
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
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test223");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
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
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test224");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) ' ');
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
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
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test225");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test226");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test227");
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test228");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test229");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) ' ');
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test230");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test231");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
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
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test232");
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
        java.util.ArrayList<java.lang.Integer> intList21 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
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
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test233");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test234");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 1);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test235");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test236");
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
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test237");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList17 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) ' ');
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
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test238");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 100);
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
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test239");
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
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test240");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) ' ');
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
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test241");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test242");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) '#');
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
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test243");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test244");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
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
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test245");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test246");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test247");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
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
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test248");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (-1));
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
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test249");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test250");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test251");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) '4');
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
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test252");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test253");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) -1);
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
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test254");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test255");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test256");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 0);
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
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test257");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) -1);
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
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test258");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 100);
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
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
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test259");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test260");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test261");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 1);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test262");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test263");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (-1));
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
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test264");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
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
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test265");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList13, (int) (short) 10);
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
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test266");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
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
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test267");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '4');
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
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test268");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test269");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 10);
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
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test270");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (byte) 100);
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
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test271");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test272");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test273");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List length = -1");
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
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test274");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test275");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test276");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test277");
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
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test278");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) 'a');
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 10");
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
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test279");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 10);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) -1);
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test280");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        java.util.ArrayList<java.lang.Integer> intList15 = correct_java_programs.BUCKETSORT.bucketsort(intList11, 1);
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
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test281");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) ' ');
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '4');
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test282");
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
        java.util.ArrayList<java.lang.Integer> intList23 = correct_java_programs.BUCKETSORT.bucketsort(intList21, (int) '#');
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
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test283");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (byte) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, 100);
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
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test284");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test285");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, 1);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test286");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList5, (int) (short) 100);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 1);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList7, (int) (byte) 10);
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTestcorrect_java_programs0.test287");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.BUCKETSORT.bucketsort(intList2, 10);
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.BUCKETSORT.bucketsort(intList2, (int) '#');
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.BUCKETSORT.bucketsort(intList9, (int) (short) 10);
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.BUCKETSORT.bucketsort(intList11, (int) ' ');
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
}

